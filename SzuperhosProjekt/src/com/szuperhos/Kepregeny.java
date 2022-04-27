package com.szuperhos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kepregeny {
    static List<Szuperhos> hosok = new ArrayList<>();


    public static void main(String[] args) {
        try {

            szereplok("szuperhos.txt");
            szuperhosok();
        } catch (IOException e) {
            System.out.println("Hiba történt a beolvasás során.");
            e.printStackTrace();
        }
    }

    static void szereplok(String eleresiUt) throws FileNotFoundException {
            File fajl = new File(eleresiUt);
            Scanner olvaso = new Scanner(fajl);
            while (olvaso.hasNextLine()) {
                String[] adat = olvaso.nextLine().split(" ");
                String tipus = adat[0];
                int kutyuSzam = Integer.parseInt(adat[1]);

                Milliardos hos;
                if (tipus.equals("Vasember")){
                    hos = new Vasember();
                }else {
                    hos = new Batman();
                }

                for (int i = 0; i < kutyuSzam; i++) {
                    hos.kutyutKeszit();
                }

                hosok.add(((Szuperhos) hos));
            }
            olvaso.close();
    }

    static void szuperhosok(){
        for (Szuperhos szuperhos : hosok) {
            System.out.println(szuperhos);
        }
    }
}
