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

    }

    public void buidar() {

    }

    public String llistarTask() throws TaskException {
        StringBuffer sb = new StringBuffer();

        return sb.toString();
    }
}