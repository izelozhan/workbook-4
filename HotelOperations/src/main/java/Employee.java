import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double regularHours;
    private LocalDateTime punchIn;
    private LocalDateTime punchOut;

    public Employee(int employeeId, String name, double payRate, String department, double regularHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.payRate = payRate;
        this.department = department;
        this.regularHours = regularHours;

    }

    public double getTotalPay(){
        double regular = getRegularHours() * payRate;
        double overtime = getOvertimeHours() * payRate;

        return  regular + overtime;
    }

    public double setRegularHours(double regularHours){
        return this.regularHours = regularHours;
    }

    public double getRegularHours(){
        return Math.min(this.hoursWorked, this.regularHours);
    }

    public double getOvertimeHours(){
        if(this.hoursWorked > regularHours){
            return this.hoursWorked - regularHours;
        } else {
            return 0;
        }
    }

    public void showPayroll(){
        System.out.println("Hello " + name + ", from " + department + " Team! Your paycheck is " + getTotalPay());
    }

    public void punchTimeCard(double inTime, double outTime){
        hoursWorked = outTime - inTime;
        System.out.println("You worked between " + inTime + "/" + outTime + ". Hours worked: " + hoursWorked);
    }

    public void punchIn(){
        punchIn = LocalDateTime.now();
        System.out.println("Punched in: " + punchIn);
    }

    public void punchOut(){
        punchOut = LocalDateTime.now();
        System.out.println("Punched in: " + punchOut);
    }

}
