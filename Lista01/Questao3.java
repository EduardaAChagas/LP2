
public class Questao3 {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		int i=0, k=0, l=0, j=0;

	    System.out.println("Digite um numero impar entre 1 - 19:");
	    int n = teclado.LerInteiro();
	    
	    //Terceira questao da lista

	    while((n % 2 == 0) || (n < 1) || (n > 19)){
	            System.out.print( "ERRO. Digite um número ímpar entre  1 a 19: " );    
	            n = teclado.LerInteiro();
	        }
	          
	    for(i=0;i<n;i++){
	    	for(j=i;j<n;j++){
	    		System.out.print(' ');
	    	}
	    	for(k=0;k<=i;k++){
	    		System.out.print("*");
	    	}
	    	for(l=n;l<n+i;l++){
	    		System.out.print("*");
	    	}
	    	System.out.println( );
	    	}

	    //parte de baixo
	    for(i=n-1;i>0;i--){
	    	for(j=i;j<n+1;j++){
	    		System.out.print(' ');
	    	}
	    	for(k=0;k<=i-1;k++){
	    		System.out.print("*");
	    	}
	    	for(l=n;l<(n+i)-1;l++){
	    		System.out.print("*");
	    	}
	    	System.out.println( );
	    }

	  }     

	}


