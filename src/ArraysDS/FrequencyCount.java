package ArraysDS;

import java.util.Arrays;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 6, 8};
        int n = 5, p = 10;
        frequencyCount(a, a.length, p);
        //System.out.println(Arrays.toString(a));
    }
    private static void frequencyCount(int[] arr, int N, int p){

        int count=0;
        int d = N +1;
        for(int i=0;i<N;i++){
            if(arr[i]>=d){
                arr[i] = N;
                count++;
            }
        }


        for(int i=0; i<N; i++)
            arr[(arr[i]%d)-1] += d;

        for(int i=0; i<N; i++)
            arr[i] = arr[i]/d;



        // reset count of last variable

        arr[N-1] = arr[N-1] -count;

    }
}
