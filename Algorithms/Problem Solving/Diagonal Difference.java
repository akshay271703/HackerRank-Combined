import java.io.*;

public class Result {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //Get size of matrix
    final int N = Integer.parseInt(br.readLine());
      
    //Get matrix
    final int[][] matrix = new int[N][N];
    for(int y = 0; y < N; ++y){
        String[] row = br.readLine().split(" ");
        for(int x = 0; x < N; ++x){
            matrix[y][x] = Integer.parseInt(row[x]);
        }
    }
    int left_diagonal=0;
    int right_diagonal=0;

    for(int i=0;i<=N-1;i++)
    {
        for(int j=0;j<=N-1;j++)
        {
            if(i==j)//left diagonal
            {
                left_diagonal+=matrix[i][j];
                if(((i+j)==N-1)) // Also Right diagonal
                right_diagonal+=matrix[i][j];
            }
            else if(((i+j)==N-1)) // right diagonal
            {
                right_diagonal+=matrix[i][j];
            }
        }
    }
    System.out.println(Math.abs(left_diagonal-right_diagonal));
  }
}
