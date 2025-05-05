public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, double payRate, String department, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.payRate = payRate;
        this.department = department;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        double regular = getRegularHours() * payRate;
        double overtime = getOvertimeHours() * payRate;

        return  regular + overtime;
    }

    public double getRegularHours(){
        return payRate;
    }

    public double getOvertimeHours(){
    return payRate;
    }


}
