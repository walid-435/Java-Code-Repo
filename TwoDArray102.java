import java.util.*;

public class TwoDArray102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int n=sc.nextInt();
        System.out.println("Enter the coloumn size: ");
        int m=sc.nextInt();
         int matrix[][]=new int[n][m];
         for (int  i=0; i<n; i++) {
             for(int j=0; j<m; j++){
                System.out.println("Enter the elements: ");
            matrix[i][j]=sc.nextInt();
             }
         }
         System.out.println("The spiral order matrix is: ");
         int rowStart=0;
         int rowEnd= n-1;
         int colStart=0;
         int colEnd= m-1;
        
        //to print the spiral 
         while(rowStart<=rowEnd && colStart<=colEnd){
            //1
            for(int col=colStart; col<=colEnd; col++){
                System.out.println(matrix[rowStart][col]+" ");
            }
            rowStart++;

            //2
            for(int row=rowStart; row<=rowEnd; row++){
                System.out.println(matrix[row][colEnd]+" ");
            }
            colEnd--;
            
            //3
         for(int col=colEnd; col>=colStart; col--){
            System.out.println(matrix[rowEnd][col]+" ");
         }
         rowEnd--;
        
        //4
        for(int row=rowEnd; row>=rowStart; row--){
            System.out.println(matrix[row][colStart]+" ");
        }
        colStart++;
        System.out.println();
        }
    }
}
