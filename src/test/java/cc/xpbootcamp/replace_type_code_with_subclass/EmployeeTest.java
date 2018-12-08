package cc.xpbootcamp.replace_type_code_with_subclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void should_employee_be_an_engineer_when_type_code_0() {
        Employee employee = Employee.create(0);
        assertTrue(employee.isEngineer());
    }

    @Test
    void should_employee_be_a_salesman_when_type_code_1() {
        Employee employee =  Employee.create(1);
        assertTrue(employee.isSalesman());
    }

    @Test
    void should_employee_be_a_manager_when_type_code_2() {
        Employee employee = Employee.create(2);
        assertTrue(employee.isManager());
    }
}