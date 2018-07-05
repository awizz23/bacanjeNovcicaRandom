package bacanjenovcicarandom;

public class BacanjeNovcicaRandom {

    public static void main(String[] args) {
        int bacanje;
        int glavaPismo = 0;
        int pismo = 0;
        int glava = 0;
        for (bacanje = 0; bacanje < 100; bacanje++) {
            glavaPismo = (int) (Math.random() * 2) + 1;
            if (glavaPismo == 1) {
                glava++;
            } else {
                pismo++;
            }

        }
        System.out.println("Ako bacite novčić 100 puta.\nBroj glava:" + glava + "\nBroj pisama:" + pismo);

    }

}
