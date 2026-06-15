import java.util.*;
public class Matrix{
public static void main(String[] args){
//int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[][] arr = new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
arr[i][j] = sc.nextInt();
}
}
int[][] mat = new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
mat[j][i] = arr[i][j];
}
}
int[][] fin = new int[n][n];
for(int i=0;i<n;i++){
int k=0;
for(int j=n-1;j>=0;j--){
fin[i][j] = mat[i][k];
k++;
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
 System.out.print(fin[i][j]+" ");
}
System.out.println();
}
}
}