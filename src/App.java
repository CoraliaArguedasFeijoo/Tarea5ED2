import java.util.Scanner;

public class App {
    public static void main (String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	int o=0;
 
	    do
	  	{
	  	Graph G=new Graph();
    	G.Introducir();
    	G.Muestra();
    	G.Grado();
    	System.out.println("Desea buscar un camino en este Graph \n1.-SI\n2.-NO");
    	int op=scan.nextInt();
    	if(op==1)
    	{
    		System.out.println("De el vertice de partida");
    		int i=scan.nextInt();
    		System.out.println("De el vertice a llegar");
    		int j=scan.nextInt();
    		G.Camino(i,j);
    	}
    	System.out.println("\nDesea introducir otro Graph \n1.-SI\n2.-NO");
		 o=scan.nextInt();
		}while(o==1);
	}
}
