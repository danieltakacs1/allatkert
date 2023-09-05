public class Allat {
    private String nev = "A nevem...";

    public void beallitNev(String nev) {

        if(nev.isEmpty()) {
            System.out.println("Hiba! Nem adtál meg nevet!");
            System.exit(1);
        }
        this.nev = nev;
    }

    public String lekerNev(){
        return this.nev;
    }

    public void hangotad(String hang) {
        System.out.println(hang);
    }
}
