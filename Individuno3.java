import java.util.Scanner;
public class Individuno3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (min 3): ");
        int N = input.nextInt();

        //Jika input < 3
        if (N < 3) {
            System.out.println("Warning! Nilai N minimal harus 3!");
            
            //input > 3
        } else {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    // Mulai cetak angka di bagian sisi kotak
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print(N);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
 
