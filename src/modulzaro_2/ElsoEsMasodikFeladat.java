//Molnár Konrád
package modulzaro_2;

public class ElsoEsMasodikFeladat {

    private static int[] szamok = new int[8];
    private static int[][] matrix = new int[5][5];

    public static void main(String[] args) {
        ProgramozoiTetelek();
        Adatszerkezet();
    }

    private static void ProgramozoiTetelek() {
        feltolt(8);
        konzolraIr("A tömb kiirása két oszlopban:\n\n");
        kiir(2);
        progTetelekBemutatasa();
    }

    private static int[] feltolt(int db) {
        for (int i = 0; i < db; i++) {
            szamok[i] = velSzam(0, 50);
        }

        return szamok;
    }

    private static int velSzam(int also, int felso) {
        int randomSzam = (int) (Math.random() * (felso - also + 1)) + also;

        return randomSzam;
    }

    private static void kiir(int oszlop) {
        for (int i = 0; i < szamok.length; i++) {
            if (i != 0 && i % oszlop == 0) {
                System.out.println("");
            }
            System.out.print(szamok[i] + " ");
        }
        System.out.println("\n");
    }

    private static void progTetelekBemutatasa() {
        osszegzesBemutatasa();
        megszamlalasBemutatasa();
        szelsoertekekBemutatasa();
        kivalasztasBemutatasa();
        eldontesekBemutatasa();
        linKerBemutatasa();
    }

    private static void osszegzesBemutatasa() {
        konzolraIr("Összegzés tétele:\n");
        osszegzes();
        konzolraIr("A tömb elemeinek összege: " + osszegzes() + "\n\n");
    }

    private static void megszamlalasBemutatasa() {
        konzolraIr("Megszámlálás tétele:\n");
        megszamlalas();
        konzolraIr("A tömbben lévő nullák száma: " + megszamlalas() + "\n\n");
    }

    private static void szelsoertekekBemutatasa() {
        minHelyBemutatasa();
        maxHelyBemutatasa();
    }

    private static void minHelyBemutatasa() {
        konzolraIr("Minimum kiválasztás tétele:\n");
        minHely();
        konzolraIr("A legkisebb elem helye: " + minHely() + "\n\n");
    }

    private static void maxHelyBemutatasa() {
        konzolraIr("Maximum kiválasztás tétele:\n");
        maxHely();
        konzolraIr("A legnagyobb elem helye: " + maxHely() + "\n\n");
    }

    private static void kivalasztasBemutatasa() {
        konzolraIr("Kiválasztás tétele:\n");
        kivalasztas();
        konzolraIr("Az első, 5-el osztható szám helye: " + kivalasztas() + "\n\n");
    }

    private static void eldontesekBemutatasa() {
//        eldontesEgyBemutatasa();
        eldontesMindBemutatasa();
    }

//    private static void eldontesEgyBemutatasa() {
//        konzolraIr("Eldöntés 1.tétele:\n");
//        eldontesEgy();
//        konzolraIr("Van-e tökéletes szám a tömb elemei között?: " + eldontesEgy() + "\n\n");
//    }
    private static void eldontesMindBemutatasa() {
        konzolraIr("Eldöntés 2.tétele:\n");
        eldontesMind();
        konzolraIr("A tömb elemei növekvő sorrrendben vannak-e?: " + eldontesMind() + "\n\n");
    }

    private static void linKerBemutatasa() {
        konzolraIr("Lineáris keresés tétele:\n");
        linKer();
        konzolraIr("13-as érték helye (Ha van! Ha nincs: -1-et ad értéknek): " + linKer() + "\n\n");
    }

    private static void konzolraIr(String kimenet) {
        System.out.print(kimenet);
    }

    private static int osszegzes() {
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++) {
            osszeg += szamok[i];
        }
        return osszeg;
    }

    private static int megszamlalas() {
        int db = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] == 0) {
                db++;
            }
        }
        return db;
    }

    private static int minHely() {
        int minIndex = 0;
        for (int i = 1; i < szamok.length; i++) {
            if (szamok[i] < szamok[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int maxHely() {
        int maxIndex = 0;
        for (int i = 1; i < szamok.length; i++) {
            if (szamok[i] > szamok[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int kivalasztas() {
        int i = 0;
        while (!(szamok[i] % 5 == 0) && (szamok[i] == 0)) {
            i++;
        }
        return i;
    }

//    private static boolean eldontesEgy() {
//        int N = szamok.length;
//        int ker = tokeletesSzam();
//        int i = 0;
//        while(i < N && !(szamok[i] == tokeletesSzam())){
//            i++;
//        }
//        return i < N;  
//    }
//    
//    private static int tokeletesSzam(){
//        int szam = 0;
//        for (int i = 0; i < szamok[i]; i++) {
//            if (szamok[i] % i == 0) {
//                szam += i;
//            }
//        }
//        return szam;
//    }
    private static boolean eldontesMind() {
        int N = szamok.length;
        int i = 0;
        while (i < N && (szamok[i] < szamok[i + 1])) {
            i++;
        }
        return i >= N;
    }

    private static int linKer() {
        int N = szamok.length;
        int i = 0;
        while (i < N && !(szamok[i] == 13)) {
            i++;
        }
        if (i < N) {
            return i;
        } else {
            return -1;
        }
    }

    private static void Adatszerkezet() {
        matrixBemutatasa();
    }
    
    private static void matrixBemutatasa(){
        matrixFeltolt();
        konzolraIr("A mátrix főátlójának feltöltése 10 és 50 közötti számokkal: \n\n");
        matrixKiir(matrix);
        konzolraIr("A mátrix főátlójának maximum értéke: " + maxErtek() + "\n\n");
        konzolraIr("A mátrix főátlójának minimum értéke: " + minErtek() + "\n\n");        
        matrixInvert();
        konzolraIr("A mátrix, értékeinek megváltoztatása után: \n\n");
        matrixKiir(matrix);
    }

    private static void matrixFeltolt() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = velSzam(10, 50);
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void matrixKiir(int[][] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                System.out.print(tomb[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void matrixInvert() {
        maxErtek();
        minErtek();
        invert(matrix);
    }

    private static int maxErtek() {
        int maxErtek = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= maxErtek) {
                    maxErtek = matrix[i][j];
                }
            }
        }
        return maxErtek;
    }

    private static int minErtek() {
        int minErtek = maxErtek();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= minErtek && matrix[i][j] != 0) {
                    minErtek = matrix[i][j];
                }
            }
        }
        return minErtek;
    }

    private static void invert(int[][] tomb) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = velSzam(minErtek(), maxErtek());
                }
            }
        }
    }

}
