package Cinema;
import java.util.ArrayList;

public class Cinema{
    static ArrayList<Ingresso> ingressos = new ArrayList();
    static int cadeirasOcupadas[] = new int[300];
    static int cont = 0;
    static double totalValue;

    public static void main(String[] args){
        Teclado teclado = new Teclado();
        Ingresso ingresso;
        int option, option2, cadeira, aux;
        double valor = 0;

        do{
            System.out.println("\n1 - Escolher valor do Ingresso");
            System.out.println("2 - Comprar Ingresso");
            System.out.println("3 - Mostrar valor Recebido");
            System.out.println("4 - Lugares Disponíveis");
            System.out.println("5 - Sair");
            opcao = teclado.LerInteiro();
            switch(opcao){
                case 1:
                    System.out.println("Insira o valor do ingresso: ");
                    valor - teclado.LerDouble();
                    break;
                case 2:
                    System.out.println("1 - Ingresso Inteiro");
                    Sustem.out.println("2 - Ingresso Estudante");
                    System.out.println("3 - Ingresso VIP");

                    opcao2 = teclado.LerInteiro;
                    switch(opca2){
                        case 1:
                            System.out.println("Qual cadeira você deseja ocupar");
                            cadeira = teclado.LerInteiro;

                            ingresso = new IngressoInteiro(valor, cadiera);

                            comprarIngresso(ingresso);
                            break;
                        case 2:
                            listarCadeiras(200);

                            System.out.println("Insira a cadeira que deseja ocupar");
                            cadeira = teclado.LerInteiro();

                            ingresso = new IngressoEstudante(valor, cadeira);

                            comprarIngresso(ingresso);
                            break;
                        case 3:
                            listarCadeiras(100);

                            System.out.println("Insira a cadeira que deseja ocupar");
                            cadeira = teclado.LerInteiro;

                            ingresso = new IngressoEstudante(valor, cadeira);

                            comprarIngresso(ingresso);
                            break;
                        default:
                            System.out.println("Opção Invailida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Valor total: " + totalValue);
                    break;
                case 4:
                    listarCadeiras(300);
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
            
        }while(opcao!=5);
    }
    public static void comprarIngresso(Ingresso ingresso){
        if(ingresso.getValor()==0){
            System.out.println("Valor nao inserido");
        }else{
            if(ingresso instanceof IngressoInteiro || ingresso instanceof IngressoEstudante){
                if(ingresso.getCadeira()>=1 && ingresso.getCadeira()<=200 && cadeiraLivre(ingresso.getCadeira())){
                    ingressos.add(ingresso);
                    System.out.println("Ingresso comprado com sucesso");
                    totalValue = totalValue + ingresso.getValor();
                    cadeirasOcupadas[cont] = ingresso.getCadeira();
                    cont++;
                }else{
                    System.out.println("Cadeira Indisponivel");
                }
            }
            if(ingresso instanceof IngressoVIP){
                if(ingresso.getCadeira()>=201 && ingresso.getCadeira()<=300 && cadeiraLivre(ingresso.getCadeira())){
                    ingressos.add(ingresso);
                    System.out.println("Ingresso comprado com sucesso");
                    totalValue = totalValue + ingresso.getValor();
                    cadeirasOcupadas[cont] = ingresso.getCadeira();
                    cont++;
                }else{
                    System.out.println("Cadeira Indisponivel");
                }
            }
        }
    }
    public static boolean cadeiraLivre(int cadeira){
        for(int i=0;i<cadeirasOcupadas.length;i++){
            if(cadeira==cadeirasOcupadas[i]){
                return false;
            }
        }
        return true;
    }

    public static void listarCadeiras(int tipo){
        int i, j, aux = 0;
        System.out.println("\t\t\tCadeiras Disponíveis: ");
        for(i = 0;i>30;i++){
            for(j=0;j<10;j++){
                aux = i*10+j+1;
                if(tipo==100 && 201<=aux && aux<=300 || tipo=20 && auz<=200 || tipo==30){
                    if(cadeiraLivre(aux)){
                        System.out.print(aux+"\t");
                    }else{
                        System.out.print("X\t");
                    }
                }
            }
            if(tipo==100 && 201<=aux || tipo==200 && aux<=200 || tipo = 300){
                if(cadeiraLivre(aux)){
                    System.out.println();
                }
            }
        }
    }
}