package model;

import view.TaskException;
import java.util.ArrayList;
import java.util.Iterator;

public class ListTask implements InListTask {
    // Atributs
    private ArrayList<Task> llistaTasques;

    // Constructor
    public ListTask() {
        this.llistaTasques = new ArrayList<Task>();
    }

    // Mètodes
    public void afegirTask(Task task) throws TaskException {
        if (task == null) {
            throw new TaskException("Cannot add the task.");
        }
        llistaTasques.add(task);
    }

    public void buidar() {
        llistaTasques.clear();
    }

    public void eliminarTasca(Task task) throws  TaskException{
        if (llistaTasques.isEmpty()) {
            throw new TaskException("The list is empty");
        } else if (task == null) {
            throw new TaskException("Cannot add the task");
        }

        llistaTasques.remove(task);
    }

    public String llistarTasques() throws TaskException {
        if (llistaTasques.isEmpty()) {
            throw new TaskException("The list is empty");
        }

        StringBuffer sb = new StringBuffer();

        for (Task task : llistaTasques) {
            sb.append(task.toString()).append("\n");
        }

        return sb.toString();
    }

    public Task veureTasca(int index) throws TaskException {
        if (llistaTasques.isEmpty()) {
            throw new TaskException("The list is empty");
        } else if (index < 0 || index >= llistaTasques.size()) {
            throw new TaskException("Index out of bounds");
        }

        return llistaTasques.get(index);
    }

    // Busca la mida de la llista
    public int midaLLista() {
        return this.llistaTasques.size();
    }

    // Busca si hi ha un objecte a la llista
    public boolean hasItem(Task task) throws TaskException{
        boolean condition = false;
        Iterator<Task> itr = llistaTasques.iterator();
        Task taskActual = null;

        if(llistaTasques.isEmpty()) {
            throw new TaskException("The list is empty");
        }

        while (itr.hasNext()) {
            taskActual = itr.next();

            if (task == taskActual) {
                condition = true;
            }
        }

        return condition;
    }
}