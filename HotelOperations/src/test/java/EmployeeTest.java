import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        //Arrange
        Employee employee = new Employee();
        employee.punchIn(9);
        //Act
        employee.punchOut(17);
        //Assert
        double expected = employee.getHoursWorked();
        assertEquals(8, expected);
    }

    @Test
    void punchOut() {
        //Arrange
        Employee employee = new Employee();
        employee.punchIn(9);
        //Act
        employee.punchOut(17);
        //Assert
        double expected = employee.getHoursWorked();
        assertEquals(8, expected);
    }
}