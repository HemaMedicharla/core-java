package LadderIfCondition;

public class Example4 {

    public String calculatePremium(int age, int experience) {

        if (age > 50 && experience >= 10) {
            return "Lowest Premium";
        }
        else if (age >= 30 && age <= 50 && experience >= 5) {
            return "Moderate Premium";
        }
        else if (age >= 18 && age < 30 && experience < 5) {
            return "Highest Premium";
        }
        else {
            return "Not Eligible for Insurance";
        }
    }

    public static void main(String[] args) {

    	Example4 obj = new Example4();

        System.out.println(obj.calculatePremium(55, 12)); 
        
    }
}
