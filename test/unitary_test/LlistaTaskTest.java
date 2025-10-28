package unitary_test;

import model.ListTask;
import model.Task;
import org.junit.jupiter.api.*;
import view.TaskException;

import java.lang.classfile.constantpool.LoadableConstantEntry;
import java.time.LocalDate;
import java.util.Date;

import static com.sun.javafx.fxml.expression.Expression.not;
import static org.junit.jupiter.api.Assertions.*;

public class LlistaTaskTest {
    // Variables LocalDate i boolean
    LocalDate dataInici = LocalDate.of(1999,1,1);
    LocalDate dataFinal = LocalDate.of(1999,1,2);
    boolean estat = true;

    private Task taskTest;
    private ListTask llistaTaskTest;

    // Tests i BeforeEach
    @BeforeEach
    void setUp() throws TaskException {
        llistaTaskTest = new ListTask();
        taskTest = new Task("Title","Description", dataInici, dataFinal, estat);

        llistaTaskTest.afegirTask(taskTest);
    }

    @Test
    void afegirTasca() {
        assertEquals(1, llistaTaskTest.midaLLista());
    }

    @Test
    void buidar() {
        llistaTaskTest.buidar();

        assertEquals(0, llistaTaskTest.midaLLista());
    }

    @Test
    void eliminarTasca() throws TaskException {
        /*
        Creem i afegim la nova tasca, ja que en cas contrari salta la TaskException per què la llista estaria buida.

        L'excepció saltaria al mètode hasItem, perquè aquest comprova si la llista està buida en un principi
         */

        LocalDate dataInici2 = LocalDate.of(1999,1,1);
        LocalDate dataFinal2 = LocalDate.of(1999,1,2);
        boolean estat2 = true;
        Task taskTest2 = new Task("Title", "Desc", dataInici2, dataFinal2, estat2);

        llistaTaskTest.afegirTask(taskTest2);
        llistaTaskTest.eliminarTasca(taskTest);

        assertFalse(llistaTaskTest.hasItem(taskTest));
    }

    @Test
    void llistarTasques() throws TaskException {
        String llistaTasquesTest = llistaTaskTest.llistarTasques();

        assertEquals("Title: Title\n" +
                "Description: Description\n" +
                "Start date: 1999-01-01\n" +
                "End date: 1999-01-02\n" +
                "Done: Yes\n", llistaTasquesTest);
    }

    @Test
    void veureTasca() throws TaskException{
        Task tascVar = llistaTaskTest.veureTasca(0);

        assertSame(taskTest, tascVar);
    }
}
