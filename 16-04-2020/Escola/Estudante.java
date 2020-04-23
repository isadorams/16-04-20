class Escola{
  private int  codigo;
  private String nome;
  private Data dataNasc;
  private double notaMat;
  private double notaPort;
  private double notaCien;
     

    
    public  Estudante(int codigo,String nome){
      this.codigo = codigo;
      this.nome = nome;
    }
    
    public int getCodigo(){
      return this.codigo;
    }
    public void setCodigo(int codigo){
      this.codigo = codigo;
    
    }

     public String getNome(){
      return this.nome;
    }
    public void setNome(String nome){
      this.nome = nome;
    }

     public Data getDataNasc(){
      return this.dataNasc;
    }
    public void setDataNasc(Data dataNasc){
      this.dataNasc = dataNasc;
    }

 public double getNotaMat(){
      return this.notaMat;
    }
    public void setNotaMat(double notaMat){
      this.notaMat = notaMat;
    }


    public double getNotaPort(){
      return this.notaPort;
    }
    public void setNotaPort(double notaPort){
      this.notaPort = notaPort;
    }

    public double getNotaCien(){
      return this.notaCien;
    }
    public void setNotaCien(double notaCien){
      this.notaCien = notaCien;
    }

    
    public void Notas(double notaMat, double notaPort,double notaCien){
    }

public void  calculaMedia(double notaMat, double notaPort,double notaCien){
        int media = (n1 + n2 + n3)/3;
        
    }
  
   
    }
 

    