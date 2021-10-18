public class JavaMethod{
    public static void main(String[] args){
        //  System.out.println("Iskandar, 17, Manchester");
        //  myMethod("Status");
         myMethod("Status");
         checkAge(20);
    }
    static void human(String nama, int umur, String Alamat){
        System.out.println("nama :" + nama + ". umur :" + umur);
    }
    static void myMethod(String Status){
        System.out.println("Mahasiswa");
    }
    static void checkAge(int age) {
        if (age < 18) {
          System.out.println("true(A)");
        } else {
          System.out.println("false(B)");
        }
    }
}
