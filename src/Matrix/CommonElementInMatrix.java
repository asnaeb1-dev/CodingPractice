package Matrix;

import java.util.HashMap;
import java.util.Map;

public class CommonElementInMatrix {
    public static void main(String[] args) {
       int[][] a = {{1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9},
        };
       commonElement(a, a.length, a[0].length);
    }
    private static void commonElement(int[][] a,int n, int m){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<m;i++){
            map.put(a[0][i], 0);
        }

        for(int i = 1;i<n;i++){
            for(int j = 0;j<m;j++){
                if(map.containsKey(a[i][j])){
                    if(map.get(a[i][j]) != i){
                        map.put(a[i][j], map.get(a[i][j]) + 1);
                    }
                }
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == n - 1 ){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
