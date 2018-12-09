package cc.xpbootcamp.replace_type_code_with_state_strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

    @Test
    void should_calculate_correct_engineer_pay() {
        Employee employee = new Employee(EmployeeType.ENGINEER);
        employee.setBonus(30000);
        employee.setMonthlySalary(15000);
        employee.setCommission(5000);
        assertThat(employee.payAmount()).isEqualTo(15000);
    }

    @Test
    void should_calculate_correct_salesman_pay() {
        Employee employee = new Employee(EmployeeType.SALESMAN);
        employee.setBonus(10000);
        employee.setMonthlySalary(3000);
        employee.setCommission(10000);
        assertThat(employee.payAmount()).isEqualTo(13000);
    }

    @Test
    void should_calculate_correct_manager_pay() {
        Employee employee = new Employee(EmployeeType.MANAGER);
        employee.setBonus(10000);
        employee.setMonthlySalary(8000);
        employee.setCommission(5000);
        assertThat(employee.payAmount()).isEqualTo(18000);
    }

}