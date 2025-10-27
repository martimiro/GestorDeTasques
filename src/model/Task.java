package model;

import java.util.Date;

public class Task {
    // Atributs
    private String title;
    private String desc;
    private Date dataInici;
    private Date dataFinal;


    // Creació de la classe
    public Task(String title, String desc, Date dataInici, Date dataFinal) {
        this.setTitle(title);
        this.setDesc(desc);
        this.setDataInici(dataInici);
        this.setDataFinal(dataFinal);
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

    // Altres mètodes
    public void crearTasca(Task task) {

    }

    public void veureTasca() {

    }

    public void editarTasca() {

    }

    public void eliminarTasca() {

    }
}
