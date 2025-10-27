package model;

import view.TaskException;
import java.util.Date;

public class Task {
    // Atributs
    private String title;
    private String desc;
    private Date dataInici;
    private Date dataFinal;
    private boolean estat;

    // Constructor
    public Task(String title, String desc, Date dataInici, Date dataFinal, boolean estat) {
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

    public Date getDataInici() {
        return this.dataInici;
    }

    public Date getDataFinal() {
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

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    // Altres mètodes:
    // Els següents quatre mètodes són els mètodes que representen els verbs CRUD.

    public void crearTasca(Task task) {
    }

    public void veureTasca() throws TaskException {

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
        sb.append("Done: ").append(estat ? "Yes" : "No").append("\n");

        return sb.toString();
    }
}