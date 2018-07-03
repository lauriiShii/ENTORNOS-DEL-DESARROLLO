
public class Operaciones {

	 // Calcula el factorial de un n�mero entero
	  public int factorial(int a){
	   
	   int i, factorial;
	   factorial = 1;
	   for (i=1;i<=a;i++){
	    factorial = factorial*i;
	   }
	   
	   return factorial;
	  }
	  
	  // Calcula el n�mero siguiente
	  public int siguiente(int a){
	   return a+1;
	  }
	  
	  //Calcula el n�mero anterior
	  public int anterior(int a){
	   a--;
	   return a;
	  }
	  
	  //Dice si un numero es primo
	  public boolean esPrimo(int a){
		  int i=2;
		  boolean primo = true;
		  while (primo || (i==a)){
			  
			  if (a%i==0)
				  primo=false; 
			  i++;
		  }
		  return primo;
	  }
	
}
