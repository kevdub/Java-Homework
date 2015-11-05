import java.util.Scanner;

public class chal2{
  public static void main(String [] args){
  Scanner keyboard = new Scanner(System.in);

  int time , speed;


  System.out.println("How fast were you going ?");
  speed = keyboard.nextInt();

  while(speed<=0)
  {
     System.out.println("Please enter a valid speed ");
     speed = keyboard.nextInt();
  }

  System.out.println(" How long did you ride / drive ?");
  time = keyboard.nextInt();

  while(time<=0)
  {
     System.out.println("Please enter a valid time ");
     time = keyboard.nextInt();
  }

  System.out.println(" Hour                    Distance");
  System.out.println("---------------------------------");


  for( int hour = 1; hour<=time; hour++)
  {
   System.out.println(hour+ "                    " + (hour * speed));
    }
   }
  }
