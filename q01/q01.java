import java.util.Scanner;

class q01{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num_tank = in.nextInt();
        int gasosa_total = 0, kmtotal = 0;
        for (int i = 0;i<num_tank;i++){
            int gasosa_atual=in.nextInt();
            int km_atual=in.nextInt();
            System.out.println((double) gasosa_atual/km_atual);
            gasosa_total+=gasosa_atual;
            kmtotal+=km_atual;
        }
        System.out.println("Total de Gasolina: "+gasosa_total);
        System.out.println("Total de km: "+kmtotal);
    }
}