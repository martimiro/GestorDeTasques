package model;

import view.TaskException;
import java.time.LocalDate;
import java.util.List;

public class Task {
    // Atributs
    private String title;
    private String desc;
    private LocalDate dataInici;
    private LocalDate dataFinal;
    private boolean estat;

    // Constructor
    public Task(String title, String desc, LocalDate dataInici, LocalDate dataFinal, boolean estat) {
        this.setTitle(title);
        this.setDesc(desc);
        this.setDataInici(dataInici);
        this.setDataFinal(dataFinal);
        this.setEstat(estat);
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public LocalDate getDataInici() {
        return this.dataInici;
    }

    public LocalDate getDataFinal() {
        return this.dataFinal;
    }

    public boolean getEstat() {
        return this.estat;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc =  desc;
    }

    public void setDataInici(LocalDate dataInici) {
        this.dataInici = dataInici;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    // Altres mètodes:
    // Els següents quatre mètodes són els mètodes que representen els verbs CRUD.

    public void crearTasca(Task task, ListTask taskList) throws TaskException {
        if (task == null) {
            throw new TaskException("Cannot add the task");
        }

        taskList.afegirTask(task);
    }

    public void editarTasca() throws TaskException{

    }

    public void eliminarTasca() throws TaskException{

    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Title: ").append(title).append("\n");
        sb.append("Description: ").append(desc).append("\n");
        sb.append("Start date: ").append(dataInici).append("\n");
        sb.append("End date: ").append(dataFinal).append("\n");
        sb.append("Done: ").append(estat ? "Yes" : "No");

        return sb.toString();
    }
}