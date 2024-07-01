public class ConstructorImplement {
    private int age;
    private String gender;
    private int salary;

    public ConstructorImplement(int newAge, String Gender, int newSalary) {
        age = newAge;
        gender = Gender;
        salary = newSalary;
    }

    public void getIncometax() {
        if (age<18) {
            System.out.println("You are a minor now");
        } 
        else if(age>85 && gender.equalsIgnoreCase("M")) {
            System.out.println("Zero Tax");
        } 
        else if(age>85 && gender.equalsIgnoreCase("F")) {
            System.out.println("No Tax");
        } 
        else if(age<85 && gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) 
        {
            if(salary<150000) {
                System.out.println("No Tax");
            } 
            else if(salary>800000) {
                System.out.println("Payable Amount = "+0.3*salary);
            } 
            else if(salary<800000 && salary>500000) {
                System.out.println("Payable Amount = "+0.2*salary);
            } 
            else if(salary<500000 && salary>150000) {
                System.out.println("Payable Amount = "+0.1*salary);
            }
        }
    }
}