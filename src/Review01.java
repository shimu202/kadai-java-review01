
public class Review01 {

    public static void main(String[] args) {
        int result = tax (1500);
        int total = result + 1500 ;


        System.out.println(1500 + "円の税込価格は" +total + "円（消費税は" + result +"円）です。");
    }
                public static int tax (int num1) {
                    int zeiritu = 10;
            int result = num1 * zeiritu/ 100;
                    return result;
        }

  }

