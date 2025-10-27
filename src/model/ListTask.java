package model;

import view.TaskException;

import java.util.ArrayList;

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
}