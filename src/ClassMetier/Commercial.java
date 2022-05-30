/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMetier;

/**
 *
 * @author Alex
 */
public class Commercial extends Salarie{
    private int prime;
    
    public Commercial(int matricule, String nom, String prenom, double salaire, int prime)
    {
        //On appel le contructeur de la classe mère
        super(matricule, nom, prenom, salaire);
        this.prime = prime;
    }

    /**
     * @return the prime
     */
    public int getPrime() {
        return prime;
    }
    
    @Override
    public double CalculerSalaire()
    {
        return super.CalculerSalaire() + this.prime;
    }
}
