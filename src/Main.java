import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int date , i;

        Scanner input = new Scanner(System.in) ;

        System.out.print("Lütfen doğum yılınızı giriniz:");
        date = input.nextInt() ;

        i = date %12 ;

        if (date>0) {
            switch (i) {
                case 0:
                    System.out.println("Çin Zodyak Burcunuz: Maymun");
                    break;

                case 1:
                    System.out.println("Çin Zodyak Burcunuz: Horoz");
                    break;

                case 2:
                    System.out.println("Çin Zodyak Burcunuz: Köpek");
                    break;

                case 3:
                    System.out.println("Çin Zodyak Burcunuz: Domuz");
                    break;

                case 4:
                    System.out.println("Çin Zodyak Burcunuz: Fare");
                    break;

                case 5:
                    System.out.println("Çin Zodyak Burcunuz: Öküz");
                    break;

                case 6:
                    System.out.println("Çin Zodyak Burcunuz: Kaplan");
                    break;

                case 7:
                    System.out.println("Çin Zodyak Burcunuz: Tavşan");
                    break;

                case 8:
                    System.out.println("Çin Zodyak Burcunuz: Ejderha");
                    break;

                case 9:
                    System.out.println("Çin Zodyak Burcunuz: Yılan");
                    break;

                case 10:
                    System.out.println("Çin Zodyak Burcunuz: At");
                    break;

                case 11:
                    System.out.println("Çin Zodyak Burcunuz: Koyun");
                    break;
            }
        } else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }
    }

}
