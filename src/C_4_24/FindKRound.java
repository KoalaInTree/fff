package C_4_24;

import java.util.Arrays;

public class FindKRound{

    private static int[] k(int k , int[] source){
        if (k >= source.length){
            return source;
        }
        int[] buffer = new int[2*k];
        int buffer_count = 0;
        int minValue =-1;
        for(int i : source){
            if (buffer_count < buffer.length){
                minValue = i < minValue ? i: minValue;
                buffer[buffer_count] = i;
                buffer_count++;
            }else if (buffer_count == buffer.length){
                Arrays.sort(buffer);
                minValue = buffer[0];


            }
        }
        return null;
    }

    public static void main(String[] args) {
        FindKRound.k(2,new int[]{2,111,6,19,9,3});
    }
}
