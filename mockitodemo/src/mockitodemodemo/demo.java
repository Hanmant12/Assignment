package mockitodemodemo;

import org.junit.Before;
import org.mockito.Mockito;

public class demo {
	EmployeeService employeeService;
    
    @Before
    public void setUp() {
        employeeService = Mockito.mock(EmployeeService.class);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.setEmployeeService(employeeService);
}}
