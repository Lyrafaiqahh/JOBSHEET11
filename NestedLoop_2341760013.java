public class NestedLoop_2341760013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        // Mengisi data ke array
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan data menggunakan foreach
        int kota = 1;
        for (double[] kotaTemps : temps) {
            System.out.print("Kota ke-" + kota + ": ");
            for (double hariTemp : kotaTemps) {
                System.out.print(hariTemp + " ");
            }
            System.out.println();
            kota++;
        }
    }
}