import java.util.ArrayList;

public class Canil {

	public static void main(String[] args) {
		ArrayList<Cachorro> canil = new ArrayList();
		Teclado input = new Teclado();
		int menu;
		do {
			System.out.println("### --- Sistema Canil --- ###");
			System.out.println("1. Cadastrar Cachorro");
			System.out.println("2. Listar Cachorro");
			System.out.println("3. Adotar Cachorro");
			System.out.println("4. Alimentar Cachorro");
			System.out.println("5. Exercitar Cachorro");
			System.out.println("6. Sair");
			
			menu = input.LerInteiro();
			
			switch(menu) {
			//////////////////////////////////////////
			case 1:
				System.out.println("Nome do cachorro:");
				Cachorro dog = new Cachorro();
				dog.setNome(input.LerString());
				System.out.println("Idade do cachorro:");
				dog.setIdade(input.LerInteiro());
				System.out.println("Peso do cachorro:");
				dog.setPeso(input.LerFloat());
				
				dog.setAdotado(false);
				
				canil.add(dog);
				break;
			///////////////////////////////////////
			case 2:
				for(int i = 0;i<canil.size();i++) {
					if(canil.get(i).getAdotado()== false){
						System.out.printf("%s - idade: %d ano(s)  peso: %.2f kg \n", canil.get(i).getNome(), canil.get(i).getIdade(), canil.get(i).getPeso());
					}
				}
				break;
			//////////////////////////////////////
			case 3:
				System.out.println("Qual cachorro deseja adotar (escolha pelo numero):");
				for(int i = 0;i<canil.size();i++) {
					System.out.printf("%d - %s \n", i, canil.get(i).getNome());
				}
				int adotado = input.LerInteiro();
				
				canil.get(adotado).setAdotado(true);
				
				break;
			////////////////////////////////////////
			case 4:
				for(int i = 0;i<canil.size();i++) {
					if(canil.get(i).getAdotado()== false){
						System.out.printf("%s -> %.2f kg \n", canil.get(i).getNome(), canil.get(i).getPeso());
					}
				}
				System.out.println("1 - Alimentar todos  2- alimentar apenas um");
				int escolha = input.LerInteiro();
				if(escolha == 1) {
					System.out.println("Qual a quantidade de comida para cada um?");
					float quantidade = input.LerFloat();
					for(int i=0;i<canil.size();i++) {
						canil.get(i).setPeso(canil.get(i).alimentarCachorro(quantidade));
					}
				}
				
				if(escolha == 2) {
					System.out.println("Qual cachorro deseja alimentar? (informe o numero do mesmo)");
					for(int i = 0;i<canil.size();i++) {
						if(canil.get(i).getAdotado()== false){
							System.out.printf("%d - %s \n", i, canil.get(i).getNome());
						}	
					}
					int escolhaCachorro = input.LerInteiro();
					
					System.out.println("Qual a quantidade de comida para dar a ele?");
					float quantidade = input.LerFloat();
					
					for(int i = 0;i<canil.size();i++) {
						if(i == escolhaCachorro) {
							canil.get(i).setPeso(canil.get(i).alimentarCachorro(quantidade));
						}
					}
				}
				
				for(int i = 0;i<canil.size();i++) {
					if(canil.get(i).getAdotado()== false){
						System.out.printf("%s -> %.2f kg \n", canil.get(i).getNome(), canil.get(i).getPeso());
					}
				}
				break;
				///////////////////////////////////
			case 5:
				
				for(int i = 0;i<canil.size();i++) {
					if(canil.get(i).getAdotado()== false){
						System.out.printf("%s -> %.2f kg \n", canil.get(i).getNome(), canil.get(i).getPeso());
					}
				}
				System.out.println("1 - Exercitar todos  2- Exercitar apenas um");
				int escolhaQuantExerc = input.LerInteiro();
				
				if(escolhaQuantExerc == 1) {
					System.out.println("Qual a distancia que vc percorrerá com os cachorros ?");
					int distancia = input.LerInteiro();
					for(int i=0;i<canil.size();i++) {
						canil.get(i).setPeso(canil.get(i).exercitarCachorro(distancia));
					}
				}
				
				if(escolhaQuantExerc == 2) {
					System.out.println("Qual cachorro deseja exercitar? (informe o numero do mesmo)");
					for(int i = 0;i<canil.size();i++) {
						if(canil.get(i).getAdotado()== false){
							System.out.printf("%d - %s \n", i, canil.get(i).getNome());
						}	
					}
					int escolhaCachorro = input.LerInteiro();
					
					System.out.println("Qual a distancia que vc percorrerá com ele?");
					int distancia = input.LerInteiro(); 
					
					for(int i = 0;i<canil.size();i++) {
						if(i == escolhaCachorro) {
							canil.get(i).setPeso(canil.get(i).exercitarCachorro(distancia));
						}
					}
				}
				
				for(int i = 0;i<canil.size();i++) {
					if(canil.get(i).getAdotado()== false){
						System.out.printf("%s -> %.2f kg \n", canil.get(i).getNome(), canil.get(i).getPeso());
					}
				}
				
				break;
			case 6:
				System.out.println("Obrigado por utilizar nosso sistema!");
				break;
			default:
				System.out.println("Essa opção não existe");
			}
		}while(menu!=6);
	}

}
