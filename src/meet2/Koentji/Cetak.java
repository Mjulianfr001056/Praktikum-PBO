public class Cetak {
    static double minNumber(double a, double b){
        if (a<b){
            return a;
        } else {
            return b;
        }
    }

    static int minNumber(int a, int b){ 
        if(a<b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args){
        System.out.println(minNumber(5.5, 7.5));
        System.out.println(minNumber(10, 20));
    }
}
