import java.util.Scanner;

public class GungorUserStory14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Did you attend Yalcin Mentor's GitHub meeting? Please answer Yes/No");

        String answer = scan.next();

        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("You will be successful on Github");
        }else{
            System.out.println("You have to study a lot!!!");
        }


    }
}
