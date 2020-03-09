import java.util.Scanner;

class q02{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("insira a quantidade de itens");
        int qtde_itens=in.nextInt();
        int soma = 0,item_valor;
        double porcentagem;
        for(int i=0;i<qtde_itens;i++){
            System.out.println("insira o valor do item");
            item_valor=in.nextInt();
            soma+=item_valor;
        }
        porcentagem=9*(soma/100);
        System.out.println(porcentagem+200);
    }
}