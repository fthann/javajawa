import java.util.Random;
import java.util.Scanner;

public class Test {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []args) {
      // int waktu = 20;
      // if (waktu < 18) {
      //    System.out.println("Siang.");
      // } else {
      //    System.out.println("malaam.");
      // }

      // String hasil = (waktu < 18) ? "siang" : "malam";
      // System.out.println(hasil);

      // int hariKe = 6;
      // String namaHari;

      // switch (hariKe) {
      //    case 1: namaHari = "Ahad"; break;
      //    case 2: namaHari = "senin"; break;
      //    case 3: namaHari = "selasa"; break;
      //    case 4: namaHari = "rabu"; break;
      //    case 5: namaHari = "kamis"; break;
      //    case 6: namaHari = "jumat"; break;
      //    case 7: namaHari = "sabtu"; break;
      //    default: namaHari = "invalid hari"; break;
      // }

      // System.out.println(namaHari);


      // while loop

      // int counter = 0;
      // while(counter < 100) {
      //    System.out.println("Yes im a ball sucker");
      //    counter++;
      // }

   //  contoh class yang menerima input dari user

   // Scanner myScanner = new Scanner(System.in);

   // System.out.println("masukan nama anda");
   // String name = myScanner.nextLine();

   // System.out.println("masukan usia anda");
   // int age = myScanner.nextInt();

   // System.out.println("masukan tinggi badan anda dalam meter");
   // double height = myScanner.nextDouble();

   // System.out.println("halo, " + name + ", anda berusia " + age + "tahun dan tinggi badan anda" + height + " meter");

   // myScanner.close();


   // tugas




   Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int angkaTebakan = random.nextInt(10) + 1; // Angka antara 1-10
        int tebakan;
        int jumlahTebakan = 0;

        System.out.println("Selamat datang di permainan tebak angka");
        System.out.println("Saya telah memilih sebuah angka antara 1 dan 10.");
        System.out.println("Bisakah kamu menebaknya?");

        do {
            System.out.print("Tebakanmu: ");
            tebakan = scanner.nextInt();
            jumlahTebakan++;

            if (tebakan < angkaTebakan) {
                System.out.println("Terlalu rendah! Coba lagi");
            } else if (tebakan > angkaTebakan) {
                System.out.println("Terlalu tinggi! Coba lagi");
            }
        } while (tebakan != angkaTebakan);

        System.out.println("Selamat! Kamu menebak sebanyak " + jumlahTebakan + " kali.");
        scanner.close();
   }
}  