/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemiaielemek;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Máté
 */
public class Kemia {
    private List<String> sorok;
    private List<Felfedezesek> elemek;
    private String BekertVJ;
    
    
    public static void main(String[] args) throws IOException {
        new Kemia().feladatok();   
    }

    private void feladatok() throws IOException {
       beolvas();
       feladat5();
       feladat6();
       
       
    }

    private void beolvas() throws IOException {
        sorok = Files.readAllLines(Paths.get("felfedezesek.csv"));
        elemek = new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            String sor = sorok.get(i);
            elemek.add(new Felfedezesek(sor));
        }
    }

    private void feladat5() {
        Pattern minta = Pattern.compile("[A-Z]",Pattern.CASE_INSENSITIVE);
        Scanner sc = new Scanner(System.in);
        int hossz;
        boolean jo;
        String bekert;
        do {
            System.out.println("5. feladat: kerek egy vegy jelet: ");
            bekert = sc.nextLine();
            Matcher matcher = minta.matcher(bekert);
            hossz = bekert.length();
            jo = matcher.find() && hossz >= 1 && hossz <= 2;
//            System.out.println(jo);
        }while (!jo);
        BekertVJ = bekert;
    }

    private void feladat6() {
        int i = 0;
        int N = elemek.size();
        System.out.println("6. feladat: Keresés");
        while (i < N && !elemek.get(i).getVj().toLowerCase().equals(BekertVJ.toLowerCase()))
            i++;
        if(i<N)
        {
            System.out.println(elemek.get(i));
        }
        else
        {
            System.out.println("nincs ilyen elem az adatforrásban!");
        }
    }
    
}
