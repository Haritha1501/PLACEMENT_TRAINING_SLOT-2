import java.util.*;
public class Spiral{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[][] arr = new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
arr[i][j] = sc.nextInt();
}
}
int top = 0, btm = n-1, lft = 0, rt = n-1;
while(top<=btm && lft<=rt){
for(int i=lft;i<=rt;i++){
System.out.print(arr[top][i]+" ");
}
top++;
for(int j=top;j<=btm;j++){
System.out.print(arr[j][rt]+" ");
}
rt--;
for(int k=rt;k>=lft;k--){
System.out.print(arr[btm][k]+" ");
}
btm--;
for(int l = btm;l>=top;l--){
System.out.print(arr[l][lft]+" ");
}
lft++;
}
}
}