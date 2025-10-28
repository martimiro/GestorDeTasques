package model;

import view.TaskException;

public interface InListTask {
    // Afegeix una tasca a la llista
    public void afegirTask(Task task) throws TaskException;

    // Buida la llista de tasques
    public void buidar();

    // Elimina una tasca de la llista
    public void eliminarTasca(Task task) throws TaskException;

    // Itera la llista
    public String llistarTasques() throws TaskException;

    // Veu un item de la llista
    public Task veureTasca(int index) throws TaskException;
}