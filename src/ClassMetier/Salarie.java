/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMetier;

/**
 *
 * @author Alex
 */
public class Salarie {
    private int matriculeSalarie;
    private String nomSalarie;
    private String prenomSalarie;
    private double salaire;
    
    public Salarie(int matricule, String nom, String prenom, double salaire)
    {
        this.matriculeSalarie = matricule;
        this.nomSalarie = nom;
        this.prenomSalarie = prenom;
        this.salaire = salaire;
    }

    /**
     * @return the matriculeSalarie
     */
    public int getMatriculeSalarie() {
        return matriculeSalarie;
    }

    /**
     * @return the nomSalarie
     */
    public String getNomSalarie() {
        return nomSalarie;
    }

    /**
     * @return the prenomSalarie
     */
    public String getPrenomSalarie() {
        return prenomSalarie;
    }

    /**
     * @return the salaire
     */
    public double getSalaire() {
        return salaire;
    }
    
    public double CalculerSalaire()
    {
        return salaire;
    }
}
