package unitary_test;

import model.Task;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

public class TaskTest {
    // Variable Dates i boolean estat
    LocalDate dataInici = LocalDate.of(1999,1,1);
    LocalDate dataFinal = LocalDate.of(1999,1,2);
    boolean estat = true;

    Task taskTest;

    @BeforeEach
    public void setUp() {
        taskTest = new Task("Title", "Desc", dataInici, dataFinal, estat);
    }

}
