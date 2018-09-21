/**
 *
 * @author Andre Barros
 */
public class QuartoHotel {
    private int NumQuarto;
    private double ValorDiaria;
    private int NumRG;
    private boolean Situacao;
    private double TotalFaturado;
    
    public QuartoHotel(int nq, double vd){
        NumQuarto = nq;
        ValorDiaria = vd;
        Situacao = false; //livre
        TotalFaturado = 0;
    }
    
    
    public void reservar(int RG){
        NumRG = RG;
        Situacao = true; //ocupado
    }
    
    public double liberar(int Dias){
        double ValTot;
        NumRG = 0;
        Situacao = false; //livre 
        
        ValTot = ValorDiaria * Dias;
        TotalFaturado += ValTot;
        
        return ValTot;
    }   
    
    public boolean getSituacao(){
        return Situacao;    
    }
    
       
    public double getTotalFaturado(){
        return TotalFaturado;
    }

    
}
