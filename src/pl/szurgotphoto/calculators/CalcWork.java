package pl.szurgotphoto.calculators;

import java.util.Scanner;

public class CalcWork {

    public static void main(String[] args)
    {
        System.out.println("Program do obliczania dni wg przepracowanych dni oraz godzin");

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę dni roboczych przepracowanych w miesiącu: ");
        int dni = sc.nextInt();

        System.out.println("Czy były nadgodzinki??? (1 = tak, reszta = nie");
        int dec = sc.nextInt();





        if(dec == 1) {
            System.out.println("Podaj liczbę godzin przepracowanych w soboty w miesiącu: ");
            int hsob = sc.nextInt();

            System.out.println("Podaj liczbę godzin przepracowanych w niedziele w miesiącu: ");
            int hnied = sc.nextInt();

            Kalkulator kal = new Kalkulator(dni, hsob, hnied);

            System.out.println("Dni do wpisania to: " +  kal.policz());
        }

        else {
            System.out.println("To na chuj zawracasz dupę?");
        }

    }
}

class Kalkulator{

    private int dni;
    private int gosob;
    private int gonied;


    public Kalkulator(int d, int s, int n)
    {
        dni = d;
        gosob = s;
        gonied = n;
    }



    public double policz()
    {
        double wynik = ((dni * 8) + (gosob * 1.5) + (gonied * 2))/8;
        return wynik;
    }

}
