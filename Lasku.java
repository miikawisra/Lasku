import java.io.*;

class Lasku {
    public static void main(String[] args){
        int eka;
        int toka;
        int summa;
        int erotus;
        int tulo;
        double osamaara;
        int jako_jaannos;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Syötä ensimmäinen kokonaisluku:");
            eka = Integer.parseInt(in.readLine());

            System.out.println("Syötä toinen kokonaisluku:");
            toka = Integer.parseInt(in.readLine());
            double koli = eka;
            double neli = toka;
            summa = eka + toka;
            erotus = eka - toka;
            tulo = eka * toka;
            osamaara = koli/neli;
            jako_jaannos= eka%toka;
            

            System.out.println(eka+" + "+toka+" = "+summa);
            System.out.println(eka+" - "+toka+" = "+ erotus);
            System.out.println(eka+" * "+toka+" = "+ tulo);
            System.out.println(eka+" / "+toka+" = "+ osamaara);
            System.out.println("Jakojäännos on: "+ jako_jaannos);
        }
        catch(Exception e){
            System.out.println("Väärä syöte!");
        }
    }
}

/*Syötä ensimmäinen kokonaisluku:7
Syötä toinen kokonaisluku:
3
7+3 = 10
7-3 = 4
7*3 = 21
7/3 = 2.3333333333333335
Jakojäännös: 1
*/