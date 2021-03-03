/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemiaielemek;


public class Felfedezesek {
    private String ev;
    private String nev;
    private String vj;
    private int rsz;
    private String felf;

    public Felfedezesek(String sor) {
        String [] s = sor.split(";");
        this.ev = s[0];
        this.nev = s[1];
        this.vj = s[2];
        this.rsz = Integer.parseInt(s[3]);
        this.felf = s[4];
    }

    public String getEv() {
        return ev;
    }

    public String getNev() {
        return nev;
    }

    public String getVj() {
        return vj;
    }

    public int getRsz() {
        return rsz;
    }

    public String getFelf() {
        return felf;
    }

    @Override
    public String toString() {
        String txt = "\tAz elem vegyjele: " + vj+
                   "\n\tAz elem neve: " + nev +
                   "\n\tRendszáma: " + rsz +
                   "\n\tFelfesezési éve: " + ev +
                   "\n\tFelfesező: " + felf;
        return txt;
    }
    
    
    
    
    
    
    
    
}
