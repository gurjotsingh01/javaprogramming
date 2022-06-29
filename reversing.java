import java.util.Scanner;
class Reversenumber{
	public static void reversenumber(int number){
	
if(number<10)
{
	//prints the same number if you enter a number less than 10
	System.out.println(number);
return;
}
else
{
System.out.print(number%10);
reversenumber(number/10);
	}
}
//MAIN METHOD
public static void main(String args[]){
	System.out.print("enter the number you wish to reverse:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.print("The reverse of the number you entered is:");
	//method calling 
	reversenumber(num);
}
}