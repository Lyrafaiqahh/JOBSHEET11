import java.util.Scanner;
public class Individuno1 {
    // TINGGAL BALIKIN AJA DARI 1  KE PANJANG
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //inputan
        System.out.print("Input nilai N (minimal 3) : ");
        int N = sc.nextInt();

        // jika inputan < 3
        if (N < 3) {
            System.out.println("silahkan masukkan nilai minimal 3!");
        }

        // jika inputan >= 3
        else {
        for (int i = 1; i <= N ; i++) {
            for (int j = 1; j <= N - i ; j++) {
                System.out.print(" ");
            }
          
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println(); 
        }
    }
    }
}