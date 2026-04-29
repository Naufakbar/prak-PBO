public class Asersi1 {
    public static void main(String[] args) throws Exception {
    int x = 0 ;
    if (x>0){
        System.out.println("x bilangann positif");
    }
    else {
        assert(x<0): "ada kesalahan kode";
        System.out.println("x bilangann negatif");
    }
    }
}
