package Arrays;

public class TransitionElement {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(transitionPoint(arr, arr.length));
    }
    private static int transitionPoint(int arr[], int n) {
        // code here
        int el = arr[0];
        
        int pos = -1;
        for(int i = 1;i<n;i++){
            if(el == 0){
                if(arr[i] == 1){
                    pos = i;
                    break;
                }else{
                    el = arr[i];
                }
            }else {
                pos = i - 1;
                break;
            }
        }
        return pos;
    }

}
