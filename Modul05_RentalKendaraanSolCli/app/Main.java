package app;

import model.Kendaraan;
import controller.RentalController;

public class Main {
        public static void main(String[] args) {
                RentalController controller = new RentalController();

                //Data awal/dummy data
                controller.tambahDataAwal(new Kendaraan(
                        "L 1234 AB", 
                        "Toyota Avanza", 
                        "MOBIL", 
                        350000)
                );
                controller.tambahDataAwal(new Kendaraan(
                        "L 2468 CD", 
                        "Honda Mobilio", 
                        "MOBIL", 
                        300000)
                );
                controller.tambahDataAwal(new Kendaraan(
                        "L 5678 EF", 
                        "Honda Vario", 
                        "MOTOR", 
                        75000)
                );

                controller.jalankan();
        }
}