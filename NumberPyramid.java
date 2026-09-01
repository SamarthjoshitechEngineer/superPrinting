import java.util.Scanner;
public class NumberPyramid{
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows and columns");
int n=sc.nextInt();
int i=0;
int nsp=n-i;
int a=3;
for(i=1;i<=n;i++){
    for(int j=1;j<=nsp;j++){
        System.out.print("  ");
    }
    nsp--;
for(int k=1;k<=i;k++ ){
    System.out.print(k +" ");
}
for(int q=1;q<=i-1;q++){
    System.out.print(a +" ");
    a++;
}
System.out.println();
}
    }
}