import java.security.PublicKey;
import java.util.Arrays;

public class multi {
    public static void main(String[]args){

        int[][] data = {{10,20,30},{40,50,60}};
        System.out.println(Arrays.deepToString(data));
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
