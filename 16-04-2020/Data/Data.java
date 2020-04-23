
class Data{
    private int dia;
    private int mes;
    private int ano;

    
    public Data(int dia,int mes,int ano){
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
    }
    
    public int getDia(){
      return this.dia;
    }
    public void setDia(int dia){
      this.dia = dia;
    
    }

     public int getMes(){
      return this.mes;
    }
    public void setMes(int mes){
      this.mes = mes;
    }

     public int getAno(){
      return this.ano;
    }
    public void setAno(int ano){
      this.ano = ano;
    }

    public void setData(int dia, int mes, int ano){
        if(dia > 0 && dia <= 31){
            this.dia = dia;
        }
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }
        if(ano > 0 && ano <= 2014){
            this.ano = ano;
        }
    }

   // if (ano%4 == 0 ){
    //    return true;
    //}else{
    //     return false;
   // }
           
    }
 

    