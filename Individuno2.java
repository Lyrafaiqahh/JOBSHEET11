import java.util.Scanner;
public class Individuno2 {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            
            //inputan
            System.out.print("Input nilai N (min 5) : ");
            int N = sc.nextInt();

            //jika input < 5
            if (N < 5) {
                System.out.println("Warning! Ketentuan hanyalah minimal 5!");
              
            // jika input >=5
            } else {
                for (int i = N; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            }
        
        }
    }

