package lab2;

import java.sql.SQLOutput;

/* I use a lot of evident and even unnecessary comments.
                The reason for this is to get myself used to commenting the code,
                so it will be more like a habit from the start.*/
public class Main {

    public static void main(String[] args) {

        printMyName();                                                                                                     //primul exercitiu: printare salutare si nume
        System.out.println("Rezultatul adunarii este:" + adunare(4,8));                                             //al doilea exercitiu: printarea adunarii
        System.out.println("Rezultatul scaderii este:" + scadere(5,6));                                             //printare scadere
        System.out.println("Rezultatul inmultirii este:" + inmultire(4, 4.4f));                                     //printare inmultire
        System.out.println("Rezultatul impartirii este:" + impartire(10,3f));                                       //printare impartire
        printText ();                                                                                                      //al treilea exercitiu: formatare text
        System.out.println("Rezultatul mediei a trei numere este:" + medie(8,9,2));                               //al patrulea exercitiu: printarea mediei a 3 numere
        //printHead ();                                                                                                    //al cincilea exercitiu: printare desen cu caractere speciale
        System.out.println("Restul impartirii a doua numere este:" + restImpartire (12, 7));                         //al saselea exercitiu: restul impartirii
        //System.out.println("Convertirea de -14F in Celsius rezulta in: "  + celsius(int o) "C");                            //al saptelea exercitiu: convertire din Fahrenheit in Celsius

    }

    public static void printMyName(){                                //method for greeting and printing name in second line
        System.out.println("Hello \nPeter");
    }
    public static int adunare(int a, int b ){                       //metoda pt adunare
        int adunare = a + b;
        return adunare;
    }
    public static int scadere(int c, int d) {                       //metoda pt scadere
        int scadere = c - d;
        return scadere;
    }
    public static float inmultire( int e, float f){                 //metoda pt inmultire
        float inmultire=  e * f;
        return inmultire;
    }
    public static double impartire(int g, float h){                 //metoda pt impartire
        double impartire= g / h;
        return impartire;
    }
    public static void printText (){                               //metoda pt text formatat
        System.out.println("   J    a   V     V  a " +
                         "\n   J   a a   V   V  a a " +
                         "\nJ  J  aaaaa   V V  aaaaa " +
                         "\n JJ  a     a   V  a     a");
    }
    public static float medie( int i, int j, int k){                //metoda pt medie
        float medie = (i+j+k) / 3f ;
        return medie;
    }
    //public static void printHead (){}                              // metoda pt printare desen cu caractere speciale??? --- nerezolvat pt moment
    public static int restImpartire (int l, int m){
        int restImpartire = l % m;
        return restImpartire;
    }
    public static int celsius (int o){                              // metoda nerezolvata/incorecta...
        int n = -14;
        int celsius = (5/9)*(n-32);
        int o = int celsius;
        return celsius;

        // exercitiul 8 si 9 in stare nerezolvata momentan
    }
}
