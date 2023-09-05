public class Employee {

    public Employee(String FIO, String post, String email, String phoneNumber, String salary, int age) {
        this.FIO = FIO;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    String FIO;
    String post;
    String email;
    String phoneNumber;
    String salary;
    int age;



    public void info(){
        System.out.println(FIO + " " + post + " " + email + " " +  phoneNumber + " " + salary + " " + age);
    }
}
