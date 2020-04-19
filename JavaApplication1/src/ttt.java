/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.io.*;
import java.util.*;

public class ttt {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr)
     {
         int rows=arr.length,col=arr[0].length,i,j,sum=0,t=0;
         for(i=0;i<rows;i++){
             for(j=0;j<col;j++){
                 sum+=arr[i][j];
             }
         }
         for(i=0;i<rows;i++){
             for(j=0;j<col;j++){
                 if(arr[i][j]!=arr[i++][j++]){
                     t+=arr[i][j];
                 }
             }
         }

    System.out.println(t+"  "+sum);
    return t;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (scanner;BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
            int[][] arr = new int[6][6];
            
            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                
                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }
            
            int result = hourglassSum(arr);
            
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
    }
}
