package trojkat;

public class trojkat {

    public static void drawTriangle(int n) {

        char symb = '*';
        char symb2 = '&';

        for (int i = 1; i <= n; i++) {
            for (int j = n; j-i>0;j--){
                System.out.print(symb2);
            }
            for (int j = n; j-(n-i) > 0; j--) {
                System.out.print(symb);
            }


//
            System.out.println();
        }


    }

    public static void main(String[] args) {
        drawTriangle(4);
    }
}
