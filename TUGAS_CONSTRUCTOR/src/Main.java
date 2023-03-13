import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


          System.out.println("Nama  : Muhammad Fairus Ramadhani ");
          System.out.println("NPM   : 21081010090          ");
          System.out.println("Kelas : OOP Kelas D          ");


          System.out.println("Pilih Objek");
          System.out.println("1. Cube");
          System.out.println("2. Clock");
          System.out.println("3. Tube");
          System.out.println("4. Rectangle Pyramid");
          System.out.println("5. Sphere");
          System.out.print("Pilihan : ");
    int jenisBangunRuang = input.nextInt();

    double volume = 0.0;
    int pilihan;
        switch (jenisBangunRuang) {
            case 1 -> {
                Cube kubus;
                System.out.println("Pilih Variasi Input");
                System.out.println("1. Sisi");
                System.out.println("2. Tanpa input (sisi = 1)");
                System.out.print("Pilihan : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.print("Masukkan sisi : ");
                    double sisi = input.nextDouble();
                    kubus = new Cube(sisi);
                    kubus.setSisi(sisi);
                } else {
                    kubus = new Cube();
                }
                kubus.computeAndSetVolume();
                volume = kubus.getVolume();
            }
            case 2 -> {
                Block balok;
                System.out.println("Pilih Variasi Input");
                System.out.println("1. Panjang (lebar & tinggi = panjang)");
                System.out.println("2. Panjang, Lebar (tinggi = lebar)");
                System.out.println("3. Panjang, Lebar, Tinggi");
                System.out.println("4. Tanpa input (default = 1)");
                System.out.print("Pilihan : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.print("Masukkan panjang : ");
                    double panjang = input.nextDouble();
                    balok = new Block(panjang);
                    balok.setPanjang(panjang);
                } else if (pilihan == 2) {
                    System.out.print("Masukkan panjang : ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan Lebar : ");
                    double lebar = input.nextDouble();
                    balok = new Block(panjang, lebar);
                    balok.setPanjang(panjang);
                    balok.setLebar(lebar);
                } else if (pilihan == 3) {
                    System.out.print("Masukkan panjang : ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan Lebar : ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    double tinggi = input.nextDouble();
                    balok = new Block(panjang, lebar, tinggi);
                    balok.setPanjang(panjang);
                    balok.setLebar(lebar);
                    balok.setTinggi(tinggi);
                } else {
                    balok = new Block();
                }
                balok.computeAndSetVolume();
                volume = balok.getVolume();
            }
            case 3 -> {
                Tube tabung;
                System.out.println("Pilih Variasi Input");
                System.out.println("1. Radius (tinggi = radius)");
                System.out.println("2. Radius, Tinggi");
                System.out.println("3. Tanpa input (default = 1)");
                System.out.print("Pilihan : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.print("Masukkan radius : ");
                    double radius = input.nextDouble();
                    tabung = new Tube(radius);
                    tabung.setRadius(radius);
                } else if (pilihan == 2) {
                    System.out.print("Masukkan radius : ");
                    double radius = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double height = input.nextDouble();
                    tabung = new Tube(radius, height);
                    tabung.setRadius(radius);
                    tabung.setHeight(height);
                } else {
                    tabung = new Tube();
                }
                tabung.computeAndSetVolume();
                volume = tabung.getVolume();
            }
            case 4 -> {
                RectPyramid limas;
                System.out.println("Pilih Variasi Input");
                System.out.println("1. Sisi (tinggi = sisi)");
                System.out.println("2. Sisi, Tinggi");
                System.out.println("3. Tanpa input (default = 1)");
                System.out.print("Pilihan : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.print("Masukkan sisi : ");
                    double side = input.nextDouble();
                    limas = new RectPyramid(side);
                    limas.setSide(side);
                } else if (pilihan == 2) {
                    System.out.print("Masukkan sisi : ");
                    double side = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double height = input.nextDouble();
                    limas = new RectPyramid(side, height);
                    limas.setSide(side);
                    limas.setHeight(height);
                } else {
                    limas = new RectPyramid();
                }
                limas.computeAndSetVolume();
                volume = limas.getVolume();
            }
            case 5 -> {
                Sphere bola;
                System.out.println("Pilih Variasi Input");
                System.out.println("1. Radius");
                System.out.println("2. Tanpa input (default = 1)");
                System.out.print("Pilihan : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.print("Masukkan radius : ");
                    double radius = input.nextDouble();
                    bola = new Sphere(radius);
                    bola.setRadius(radius);
                } else {
                    bola = new Sphere();
                }
                bola.computeAndSetVolume();
                volume = bola.getVolume();
            }
            default -> System.out.println("Pilihan tidak valid!");
        }

          System.out.println("========== HASIL ==========");
          System.out.println("Volume = " + volume);
          System.out.println("===========================");
          input.close();
}
}