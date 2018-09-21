import java.util.Scanner;
/**
 * @author Dimas
 */
public class Aplic {
    public static void main(String [] args){        
        Scanner Entrada = new Scanner(System.in);
        int option,  numQuarto, rg,nq, qtdeDias;
        double ValorDiaria;
       
        System.out.println("Informe o Numero do quarto: ");
        numQuarto = Entrada.nextInt();
        System.out.println("Informe o valor da diária: ");
        ValorDiaria = Entrada.nextDouble();

        QuartoHotel qHotel = new QuartoHotel(numQuarto, ValorDiaria);
        
        do{  //Menu
            System.out.println("\n\n******Hotel Recanto do Sossego******\n");
            System.out.println("1-Consultar quarto");
            System.out.println("2-Reservar quarto");
            System.out.println("3-Liberar quarto");
            System.out.println("4-Consultar faturamento");
            System.out.println("5-Sair\n");
            
            option = Entrada.nextInt();
            
            if(option == 1){
               if(qHotel.getSituacao())
                  System.out.print(" Situacao: Ocupado");
               else
                  System.out.print(" Situacao: Livre");
            }
            else             
              if(option == 2){
                   if(qHotel.getSituacao())
                        System.out.println("O quarto já foi reservado.");
                   else{
                        System.out.println("Informe o RG: ");
                        rg = Entrada.nextInt();
                        qHotel.reservar(rg);
                    }
              }
              else
                if(option == 3){                    
                    if(!qHotel.getSituacao())
                        System.out.println("O quarto já foi liberado.");
                    else{
                        System.out.println("Informe a qtde de Dias que o cliente ficou hospedado: ");
                        qtdeDias = Entrada.nextInt();
                        System.out.println("Valor a pagar: "+ 
                                          qHotel.liberar(qtdeDias));
                    }                   
            }
            else
              if(option == 4){
                 System.out.println("Faturamento total: " +
                                   qHotel.getTotalFaturado());
              }
        }while(option != 5);        
    }
}
