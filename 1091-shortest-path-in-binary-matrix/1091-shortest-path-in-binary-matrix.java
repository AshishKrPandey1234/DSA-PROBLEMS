class Tuple {
    int first;
    int second;
    int third;

    Tuple(int _first, int _second, int _third) {
        this.first = _first;
        this.second = _second;
        this.third = _third;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]==1)return -1;
        if (n == 1){
            return 1;
        }
            
        int dist[][] = new int[n][n];

        for (int row[] : dist) {
            Arrays.fill(row, (int) 1e9);
        }
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(1, 0, 0));//first 0 is self dist:0 , second and third 0 is for cell address of first cell
        dist[0][0]=1;

        while (!q.isEmpty()) {
            int dis = q.peek().first;
            int r = q.peek().second;
            int c = q.peek().third;
            q.remove();

            int dr[] = { -1, -1, -1, 0, +1, +1, +1, 0 };
            int dc[] = { -1, 0, +1, +1, +1, 0, -1, -1 };

            for (int i = 0; i < 8; i++) {
                int newR = r + dr[i];
                int newC = c + dc[i];
                if (newR >= 0 && newR < n && newC >= 0 && newC < n && grid[newR][newC] == 0) {
                    if (dis + 1 < dist[newR][newC]) {
                        dist[newR][newC] = dis + 1;

                        if (newR == n - 1 && newC == n - 1)return dis+1;

                            q.add(new Tuple(dis + 1, newR, newC));
                    }
                }
            }
        }
        return -1;

    }
}