public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double regularHours;

    public Employee(int employeeId, String name, double payRate, String department, double hoursWorked, double regularHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.payRate = payRate;
        this.department = department;
        this.hoursWorked = hoursWorked;
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
        System.out.println("Hello! " + name + "Your ID is" + employeeId + "from" + department + "your paycheck is " + getTotalPay());
    }


}
