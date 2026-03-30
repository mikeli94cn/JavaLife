import java.util.Scanner;

public class IfElseSwitch {

    public static void main(String[] args) {
        enum Weekday{
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }
        enum Mood{
            HAPPY,
            BAD
        }


        

        Scanner sc=new Scanner(System.in);
        String today=sc.next();
        if (today.equals(Weekday.MONDAY.toString())) {
            System.out.printf("today is %s,mood is %s\n",today,Mood.BAD.toString());
           
        } else {
            System.out.printf("today is %s,mood is %s\n",today,Mood.HAPPY.toString());
            
        }
    }
}
