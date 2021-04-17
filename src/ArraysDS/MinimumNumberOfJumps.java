package ArraysDS;

public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int[] a = {2 ,3 ,1 ,1 ,2 ,4 ,2 ,0 ,1 ,1};
        System.out.println(minimumJumps(a));
    }
    private static int minimumJumps(int[] arr){
        int jump = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                i+=arr[i];
                jump++;
            }else{
                return jump;
            }
        }
        return jump;
    }
}
