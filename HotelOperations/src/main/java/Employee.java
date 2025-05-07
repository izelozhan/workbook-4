
public class Employee {
    private  int employeeId;
    private  String name;
    private String department;
    private double payRate;
    private double regularHours;
    private double startTime;
    private double hoursWorked;



    public Employee(int employeeId, String name, double payRate, String department, double regularHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.payRate = payRate;
        this.department = department;
        this.regularHours = regularHours;
        this.startTime = -1;
    }

    public Employee() {

    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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


    public void punchTimeCard(double time){
        if (startTime == -1){
            startTime = time;
        } else {
            double workHours = time - startTime;
            hoursWorked += workHours;
            startTime = -1;
        }
    }

    public double punchIn(double time){
        return startTime = time;
    }

    public void punchOut(double time){
        double todaysHours = time - startTime;
        this.hoursWorked += todaysHours;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

}
