import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        double valorMorango;
        double valorMaca;
        double valorTotal;
        valorMorango = (morangos <= 5) ? morangos*2.5 : morangos*2.2;
        valorMaca = (macas <= 5) ? macas*1.8 : macas*1.5;
        valorTotal=valorMorango+valorMaca;
        valorTotal = ( macas+morangos > 8) ? valorTotal*0.9 : valorTotal;
        System.out.println(valorTotal);

        }
    }
