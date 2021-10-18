public class SyaratBekerja {
    static void SyaratBekerja(int umur) {
        if (umur < 18) {
          System.out.println("Maaf Anda Belum Layak Bekerja");
        } else {
          System.out.println("Selamat Anda Layak Bekerja");
      }
    }
    public static void main(String[] args){
        SyaratBekerja(17);
        return;
 }
}
