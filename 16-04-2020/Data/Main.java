import java.io.IOException;
public class Main
{
  public static void main (String[]args) throws IOException
  {

      Data d1 = new Data(22,12,2001);

      
          System.out.println("Data: " + d1.getDia());
          System.out.println("Mes: " + d1.getMes());
          System.out.println("Ano: " + d1.getAno());
          

          Data d2 = new Data(31,01,0);        
         
         
          System.out.println("Data: " + d2.getDia());
          System.out.println("Mes: " + d2.getMes());
          System.out.println("Ano: " + d2.getAno());
          
          Data d3 = new Data();
          d3.setDia(22);
          d3.setMes(05);
          d3.setAno(2003);     
          
          System.out.println("Data: " + d3.setDia());
          System.out.println("Mes: " + d3.setMes());
          System.out.println("Ano: " + d3.setAno());
          

  }
}






