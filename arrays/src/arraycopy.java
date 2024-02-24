import java.util.Arrays;

public class arraycopy {
    public static void main(String[]args){
        int[] k = {1,2,3,4,5};
        int[] l = Arrays.copyOf(k,k.length);

        for(int i=0;i<k.length;i++){
            System.out.print(l[i] + " ");
        }




    }
}
