import java.util.Scanner;
public class MultiplicationTable {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
System.out.println("Enter the range");
int b=s.nextInt();
int c=s.nextInt();
for(int i=b;i<=c;i++)
{
	int d=i*a;
	System.out.println(i+" * "+a+" = "+d);
}
	}

}
