import java.util.ArrayList;

public class Data {
    public static final int MAX = 100;/*value not shown */
    private int[][] grid;

    public void repopulate(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=MAX;i++){ //the value is between 1 and MAX inclusive
            if(i%10==0 && i%100!=0){//i must be divisible by 10 but not by 100
                list.add(i);
            }
        }
        //populate the grid
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                double rand = Math.random();
                int randIndex = (int) (rand*list.size());
                grid[i][j]=list.get(randIndex);
                //System.out.println(rand + " x "+list.size()+" = "+randIndex);
            }
        }

    }

    public int countIncreasingCols(){
        int max=-1000; int count=0;
        for(int i=0;i<grid[i].length;i++){
            int p=1; //assume column is in ascending order
            for(int j=1;j<grid.length;j++){
                if(grid[j-1][i]>grid[j][i]){
                    p=0; //column is not in descending order
                }
            }
            count+=p; //count
        }
        return count;
    }

    public static void main(String[] args) {
        Data d = new Data();

        int grid[][]= new int [4][3];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j]=1;
            }
        }
        d.grid=grid;
        d.repopulate();
        for(int i=0;i<d.grid.length;i++){
            for(int j=0;j<d.grid[i].length;j++){
                System.out.print(" "+d.grid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(d.countIncreasingCols());

    }
}
