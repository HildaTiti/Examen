import java.util.*;
import java.io.*;

public class examePreg2 
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String cad="";
	   System.out.println("cual es la frace atraducir");	   
	   cad = sc.nextLine();
	   
	   String[] datos=cad.split(" "); 
	   String[][] equival={{"yo","i"},{"estoy","am"},{"muy","very"},{"cansado","tired"},
	   									{"jesus","jesus"},{"ama","love"},{"te","you"}};
	   
	  String traduc="";
	  for(int j=0;j<datos.length;j++)
	  {
	  	for(int i=0;i<equival.length;i++)
	    {	   	  
	   	  if(datos[j].equals(equival[i][0]))
	   	  {
	   	  	traduc = traduc + equival[i][1]+" ";
	   	  }
	    }	  	
	  }
	System.out.println("la frace en ingles:\t"+traduc);
    }
}
