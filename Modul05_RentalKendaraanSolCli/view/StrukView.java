package view;

import model.Penyewaan;
//[SRP] satu tanggung jawab: format tampilan struk sewa.
public class StrukView {
        public void cetak(Penyewaan p) {
                System.out.println("-------------- STRUK SEWA --------------");
                System.out.println("No. Sewa    : " + p.getId());
                System.out.println("Penyewa     : " + p.getNamaPenyewa());
                //Kendaraan     : Honda Vario (L 1234 AB)
                System.out.println("Kendaraan   : " + p.getKendaraan().getMerk() + 
                " (" + p.getKendaraan().getPlatNomor() + ")");
                System.out.println("Jenis       : " + p.getKendaraan().getJenis());
                System.out.println("Lama Sewa   : " + p.getLamaHari() + " hari");
                System.out.println("Total       : " + Format.rupiah(p.getTotalBiaya()));
                System.out.println("----------------------------------------");
        }
}
