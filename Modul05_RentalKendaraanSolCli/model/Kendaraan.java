package model;

/* 
[SRP]: 
Kendaraan hanya bertanggung jawab atas DATA Kendaraan dan aturan bisnis miliknya sendiri (hitung biaya sewa).
*/

public class Kendaraan {
        private final String platNomor;
        private final String merk;
        private final String jenis;
        private final long tarifPerHari;
        private boolean tersedia = true;

        public Kendaraan (String platNomor, String merk, String jenis, long tarifPerHari) {
                this.platNomor = platNomor;
                this.merk = merk;
                this.jenis = jenis;
                this.tarifPerHari = tarifPerHari;
        }
        //[BELUM OCP] if-else per jenis masih ada disini
        //setiap ada jenis baru -> kelas ini harus diubah 
        public long hitungBiaya(int hari) {
                long total = tarifPerHari * hari;

                if (jenis.equals("MOBIL")) {
                        total += 50000; //Asuransi
                } else if(jenis.equals("MOTOR")) {
                        if (hari >= 7) total -= total / 10; //Diskon 10%
                }
                return total;
        }

        public String getPlatNomor() {
                return platNomor;
        }
        public String getMerk() {
                return merk;
        }
        public String getJenis() {
                return jenis;
        }
        public long getTarifPerHari() {
                return tarifPerHari;
        } 
        public boolean isTersedia() {
                return tersedia;
        }
        public void setTersedia(boolean tersedia) {
                this.tersedia = tersedia;
        }
}