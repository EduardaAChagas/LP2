
public class Questao2 {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		System.out.println("Insira um inteiro: ");
		int inteiro = teclado.LerInteiro();
		
		// Segunda questao letra A
		for(int i = 1;i <= inteiro;i++) {
			System.out.printf("\n");
			for(int j = 1; j <= i;j++) {
				System.out.printf("*");
			}
		}
				
		System.out.printf("\n");
				
		//Segunda questao letra B
		for(int i = 1;i <= inteiro;i++) {
			System.out.printf("\n");
			for(int j = inteiro; j >= i;j--) {
				System.out.printf("*");
			}
		}
				
		System.out.printf("\n");
		System.out.printf("\n");
				
		//Segunda questao letra C
		for(int i = 1;i <= inteiro;i++) {
			for(int j = inteiro; j >= i;j--) {
				System.out.printf("*");	
			}
			System.out.printf("\n");
			for(int j=1;j <= i;j++) {
				System.out.printf(" ");
			}
		}
				
		
				
		//Segunda questao letra D
		for(int i = 1;i <= inteiro;i++) {	
			System.out.printf("\n");
			for(int j=inteiro;j > i;j--) {
				System.out.printf(" ");
			}
			for(int j = 1; j <= i;j++) {
				System.out.printf("*");
			}
		}

	}

}
