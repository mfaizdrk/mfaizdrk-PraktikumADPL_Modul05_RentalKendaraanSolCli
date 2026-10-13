package view;

import java.util.Locale;
//[SRP] Satu tanggung jawab: memformat angka menjadi teks Rupiah.
public class Format {
        public static String rupiah(long nilai) {
                return String.format(
                        Locale.US, 
                        "Rp%,d", 
                        nilai
                ).replace(",", ".");
        }
}
