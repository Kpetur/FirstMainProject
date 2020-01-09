package lab2;

public class Main {

    public static void main(String[] args) { // afisarea rezultaterol

        System.out.println(adunare());       //printare adunare

        int e= scadere(5, 7);
        System.out.println(e);               //printare scadere

      //  System.out.println(inmultire());
      //  System.out.println(impartire());
    }


    public static int adunare( ){            //metoda pt adunare
        int a = 5;
        int b = 8;
        int adunare = a + b;
        return adunare;
    }

    public static int scadere(int c, int d) { //metoda pt scadere
        int scadere = c - d;
        return scadere;
    }


}
