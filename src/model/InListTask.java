package model;

import view.TaskException;

public interface InListTask {
    // Afegeix una tasca a la llista
    public void afegirTask(Task task) throws TaskException;

    // Buida la llista de tasques
    public void buidar();

    // Itera la llista
    public String llistarTasks() throws TaskException;
}