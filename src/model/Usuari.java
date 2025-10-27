package model;

public class Usuari {
    // Atributs
    private String nom;

    // Getters
    public String getNom() {
        return this.nom;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Altres mètodes
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Nom: ").append(nom).append("\n");

        return sb.toString();
    }
}