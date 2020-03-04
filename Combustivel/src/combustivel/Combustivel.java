/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combustivel;
import java.util.*;
/**
 *
 * @author eduardachagas
 */
public class Combustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        System.out.println("insira a quilometragem");
        double kilo = ent.nextDouble();
        System.out.println("insira os litros");
        int lito=ent.nextInt();
        double consumo=kilo/(double)lito;
        System.out.println("o consumo foi: "+consumo);
    }
}
