package LadderIfCondition;

public class Example5 {

    public double getTicketPrice(int age) {

        if (age < 5) {
            return 0.0;
        }
        else if (age >= 5 && age <= 12) {
            return 5.0;
        }
        else if (age >= 13 && age <= 60) {
            return 10.0;
        }
        else if (age > 60) {
            return 5.0;  
        }
        else {
            return -1;   
        }
    }

    public static void main(String[] args) {

        Example5 obj = new Example5();

        System.out.println(obj.getTicketPrice(5));   
    }
}
