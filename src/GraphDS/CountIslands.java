package GraphDS;


/**Question --->
 * Given a grid consisting of '0's(Water) and '1's(Land). Find the number of islands.
 * Note: An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e.,
 * in all 8 directions.
 *
 *
 * Example 1:
 *
 * Input:
 * grid = {{0,1},{1,0},{1,1},{1,0}}
 * Output:
 * 1
 * Explanation:
 * The grid is-
 * 0 1
 * 1 0
 * 1 1
 * 1 0
 * All lands are connected.
 * Example 2:
 *
 * Input:
 * grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}}
 * Output:
 * 2
 * Expanation:
 * The grid is-
 * 0 1 1 1 0 0 0
 * 0 0 1 1 0 1 0
 * There are two islands one is colored in blue
 * and other in orange.
 */

/**
 * TODO: Count Islands using BFS
 */
public class CountIslands {
    public static void main(String[] args) {
        char[][] mat = {
                {'0','1','1','1','0','0','0'},
                {'0','0','1','1','0','1','0'}
        };
        System.out.println(countIslands(mat));
    }

    //this has been calculated using dfs algorithm
    private static int countIslands(char[][] g){
        if(g == null || g.length == 0) return 0;
        int islandCount = 0;
        for(int i = 0;i<g.length;i++){
            for(int j = 0;j<g[0].length;j++){
                islandCount+=dfsHelper(g, i, j);
            }
        }
        return islandCount;
    }
    private static int dfsHelper(char[][] g, int i, int j){
        if(i < 0 || i>g.length - 1 || j < 0 || j > g[0].length - 1){
            return 0;
        }
        if(g[i][j] == '1'){
            g[i][j] = '0';
        }else{
            return 0;
        }

        dfsHelper(g, i - 1, j);
        dfsHelper(g, i + 1, j);

        dfsHelper(g, i - 1, j - 1);
        dfsHelper(g, i + 1, j - 1);
        dfsHelper(g, i, j - 1);

        dfsHelper(g, i + 1, j + 1);
        dfsHelper(g, i - 1, j + 1);
        dfsHelper(g, i , j + 1);
        return 1;
    }
}
