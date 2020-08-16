import java.util.Scanner;

public class Conversion
{
public static void main(String[] args)
{
System.out.println("Enter the minutes");
Scanner input=new Scanner(System.in);
int min = input.nextInt();
long years = (long) (min/(60*24*365));
int days = (int) (min/60/24)%365;
System.out.println( min + " minutes is approximately " + years + " years and " + days + " days");
}
}
