package LadderIfCondition;
public class Example2 {

    public String evaluateAdmission(int marks, boolean sportsAchievement) {

        if (marks >= 95) {
            return "Admitted with Scholarship";
        }
        else if (marks >= 85 && marks <= 94) {
            return "Admitted without Scholarship";
        }
        else if (marks >= 70 && marks <= 84 && sportsAchievement) {
            return "Admitted under Sports Quota";
        }
        else if (marks >= 60 && marks <= 69) {
            return "Interview Required";
        }
        else {
            return "Admission Rejected";
        }
    }

    public static void main(String[] args) {

        Example2 obj = new Example2();

        System.out.println(obj.evaluateAdmission(96, false));  
    }
}
