package model;

import view.TaskException;

import java.util.ArrayList;

public class ListTask implements InListTask {
    // Atributs
    private ArrayList<Task> llistaTask;

    // Constructor
    public ListTask() {
        this.llistaTask = new ArrayList<Task>();
    }

    // Mètodes
    public void afegirTask(Task task) throws TaskException {
        llistaTask.add(task);
    }

    public void buidar() {
        for(int i = 0; i < llistaTask.size(); i++) {
            llistaTask.remove(i);
        }
    }

    public String llistarTask() throws TaskException {
        StringBuffer sb = new StringBuffer();

        return sb.toString();
    }
}