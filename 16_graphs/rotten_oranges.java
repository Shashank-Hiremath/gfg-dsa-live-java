//https://www.geeksforgeeks.org/problems/rotten-oranges2536/1



class Position{
    int i;
    int j;
    Position(int i, int j){
        this.i = i;
        this.j = j;
    }
}

class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] matrix)
    {
        int R = matrix.length, C = matrix[0].length;
        int i, j, k, i1, j1, size, t=0;
        int[] rowOffset={0, -1, 0, 1};
        int[] colOffset={1, 0, -1, 0};
        
        Queue<Position> q = new LinkedList<Position>();
        for(i=0;i<R;i++)
            for(j=0;j<C;j++)
                if(matrix[i][j]==2)
                    q.add(new Position(i, j));
        while(!q.isEmpty())
        {
            for(size=q.size();size>0;size--)
            {
                i = q.peek().i;
                j = q.peek().j;
                q.poll();
                for(k=0;k<4;k++)
                {
                    i1 = i + rowOffset[k];
                    j1 = j + colOffset[k];
                    if(i1>=0 && i1<R && j1>=0 && j1<C && matrix[i1][j1]==1)
                    {
                        matrix[i1][j1] = 0;
                        q.add(new Position(i1, j1));
                    }
                }
            }
            t++;
        }
        for(i=0;i<R;i++)
            for(j=0;j<C;j++)
                if(matrix[i][j]==1)
                    return -1;
        if(t==0) return 0;
        return t-1;
    }
}