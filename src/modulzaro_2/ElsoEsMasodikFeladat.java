package modulzaro_2;

public class ElsoEsMasodikFeladat {
    
    private static int[] szamok = new int[8];

    public static void main(String[] args) {
        ProgramozoiTetelek();
        Adatszerkezet();
    }

    private static void ProgramozoiTetelek() {
        feltolt(szamok.length);
        kiir(2);
        progTetelek();
        progTetelekBemutatasa();
    }
    
    private static int[] feltolt(int db) {
        for (int i = 0; i < db; i++) {
            szamok[i] = velSzam(0, 50);
        }
        
        return szamok;
    }

    private static int velSzam(int also, int felso) {
        int randomSzam = (int)( Math.random()*(felso-also+1) )+also;
        
        return randomSzam;
    }

    private static void kiir(int oszlop) {
        for (int i = 0; i < szamok.length; i++) {
            if(i != 0 && i % oszlop == 0){
                System.out.println("");
            }
            System.out.print(szamok[i] + " ");
        }
        System.out.println("");               
    }

    private static void progTetelek() {
        
    }

    private static void progTetelekBemutatasa() {
        
    }

    private static void Adatszerkezet() {
        
    }
    
}
