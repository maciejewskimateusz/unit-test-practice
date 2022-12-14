package mockExercise3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

class SalaryCalculatorServiceTest {

    private SalaryCalculatorService salaryCalculatorService;

    @Mock
    TaskManagementSystem taskManagementSystem;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        salaryCalculatorService = new SalaryCalculatorService(taskManagementSystem);

    }

    @Test
    void shouldHaveNoBonus() {

        //given
        Employee employee = new Employee("Jan", BigDecimal.valueOf(2000));
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(9);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then
        Assertions.assertThat(salary).isEqualTo(BigDecimal.valueOf(2000));
    }

    @ValueSource(ints = {10, 19})
    @ParameterizedTest
    void shouldHave500Bonus(int finishedTasks) {

        //given
        Employee employee = new Employee("Jan", BigDecimal.valueOf(2000));
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(finishedTasks);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then
        Assertions.assertThat(salary).isEqualTo(BigDecimal.valueOf(2500));
    }

    @Test
    void shouldHave1000Bonus() {

        //given
        Employee employee = new Employee("Jan", BigDecimal.valueOf(2000));
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(20);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then
        Assertions.assertThat(salary).isEqualTo(BigDecimal.valueOf(3000));
    }
}