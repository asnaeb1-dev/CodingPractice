package Strings;

public class FindStringInGrid {
    public static void main(String[] args) {
        char[][] ch = {
                {'a', 'b', 'c'},
                {'d', 'r', 'f'},
                {'g', 'h', 'i'}
        } ;
        findString(ch, ch.length, ch[0].length, "abc");
    }
    private static void findString(char[][] grid, int n, int m, String s){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == s.charAt(0)){
                    boolean b = travelLeft(grid, i, j -1, 1, n, m, s);
                    boolean b1 = travelRight(grid, i, j +1, 1, n, m, s);
                    boolean b2 = travelTop(grid, i - 1, j, 1, n, m, s);
                    boolean b3 = travelBottom(grid, i + 1, j, 1, n, m, s);
                    boolean b4 = travelTopLeft(grid, i - 1, j -1, 1, n, m, s);
                    boolean b5 = travelBottomLeft(grid, i + 1, j -1, 1, n, m, s);
                    boolean b6 = travelTopRight(grid, i - 1, j + 1, 1, n, m, s);
                    boolean b7 = travelBottomRight(grid, i + 1, j + 1, 1, n, m, s);

                    if(b || b1 || b2 || b3 || b4 || b5 || b6 || b7){
                        System.out.println(i +", "+ j);
                    }
                }
            }
        }
    }

    private static boolean travelLeft(char[][] g, int i, int j, int k, int n, int m, String target){
        if(k >= target.length()) return true;
        if(j <= 0) return false;
        if(target.charAt(k) != g[i][j]){
            return false;
        }
        return travelLeft(g, i, j - 1,k+1,  n, m, target);
    }
    private static boolean travelRight(char[][] g, int i, int j, int k, int n, int m, String t){
        if(k >= t.length()) return true;
        if(j >= m) return false;
        if(t.charAt(k) != g[i][j]) return false;
        return travelRight(g, i, j + 1, k + 1, n, m, t);
    }
    private static boolean travelTop(char[][] g, int i, int j, int k, int n, int m, String t){
        if(k >= t.length()) return true;
        if(i <= 0) return false;
        if(t.charAt(k) != g[i][j]) return false;
        return travelTop(g, i - 1, j, k + 1, n, m, t);
    }
    private static boolean travelBottom(char[][] g, int i, int j, int k, int n, int m, String t){
        if(k >= t.length()) return true;
        if(i >= n) return false;
        if(t.charAt(k) != g[i][j]) return false;
        return travelBottom(g, i + 1, j, k + 1, n, m, t);
    }
    private static boolean travelTopLeft(char[][] g, int i, int j, int k, int n, int m, String t){
        if(k >= t.length()) return true;
        if(i <= 0 || j <= 0 ) return false;
        if(t.charAt(k) != g[i][j]) return false;
        return travelTopLeft(g, i - 1, j - 1, k + 1, n, m, t);
    }
    private static boolean travelBottomLeft(char[][] g, int i, int j, int k, int n, int m, String t){
        if(k >= t.length()) return true;
        if(i >= n || j <= 0 ) return false;
        if(t.charAt(k) != g[i][j]) return false;
        return travelBottomLeft(g, i + 1, j - 1, k + 1, n, m, t);

    }
    private static boolean travelTopRight(char[][] g, int i, int j, int k, int n, int m, String t){
        if(k >= t.length()) return true;
        if(i <= 0 || j >= m) return false;
        if(t.charAt(k) != g[i][j]) return false;
        return travelTopRight(g, i - 1, j + 1, k + 1, n, m, t);

    }
    private static boolean travelBottomRight(char[][] g, int i, int j, int k, int n, int m, String t){
        if(k >= t.length()) return true;
        if(i >= n || j >= m) return false;
        if(t.charAt(k) != g[i][j]) return false;
        return travelBottomRight(g, i + 1, j + 1, k + 1, n, m, t);
    }
}
