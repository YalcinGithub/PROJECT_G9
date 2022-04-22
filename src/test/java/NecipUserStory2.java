import java.util.Scanner;

public class NecipUserStory2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter your groups name");
        String groupname= scan.next();


 if(groupname.equalsIgnoreCase("group8")){
     System.out.println("You are important person, come in");
 }else{
     System.out.println("go home");
 }


    }
}
