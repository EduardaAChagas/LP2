
public class Questao1 {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		System.out.println("Insira um inteiro: ");
		int inteiro = teclado.LerInteiro();
		
		//Primeira questao
		System.out.println("N N*10 N*100 N*1000");
				
		for(int i = 1;i <= inteiro;i++) {
			System.out.printf("%d  %d   %d   %d \n", i, i*10, i*100, i*1000);
		}

	}

}
