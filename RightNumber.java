import java.util.Scanner;
public class RightNumber{
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows and columns");
int n=sc.nextInt();
int i=0;
int nsp=n-i;
for(i=1;i<=n;i++){
    for(int j=1;j<=nsp;j++){
        System.out.print("  ");
    }
    nsp--;
    int a=1;
for(int k=1;k<=i;k++ ){
    System.out.print( a +" ");
    a++;
}
System.out.println();
}
    }
}
