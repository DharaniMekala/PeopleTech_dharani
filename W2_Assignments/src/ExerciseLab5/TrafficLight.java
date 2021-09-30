//Exercise 1: Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons. On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown. 
package ExerciseLab5;
import java.util.Scanner; 
public class TrafficLight { 
    public static void main(String[] args){ 
Scanner scan = new Scanner(System.in); 

System.out.println("Choose one color : "); 

System.out.println("red"); 

System.out.println("yellow"); 

System.out.println("green"); 

String color = scan.next(); 

light(color); 

} 
public static void light(String color){ 
switch (color){ 

case "red": System.out.println("stop");break; 

case "yellow": System.out.println("ready");break; 

case "green": System.out.println("go");break;
default:System.out.println("Choose only one red, yellow or green");   
} 
} 
} 