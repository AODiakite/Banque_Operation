/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author diakite
 */
public class Compte {
    private String rib;
    private double solde;
    private char categorie;
    private boolean open;

    public Compte() {
    }

    public Compte(String rib, double solde, char categorie, boolean open) {
        this.rib = rib;
        this.solde = solde;
        this.categorie = categorie;
        this.open = open;
    }

    public Compte(String rib, double solde) {
        this.rib = rib;
        this.solde = solde;
    }
    
    
    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public char getCategorie() {
        return categorie;
    }

    public void setCategorie(char categorie) {
        this.categorie = categorie;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return "Compte{" + "rib=" + rib + ", solde=" + solde + ", categorie=" + categorie + ", open=" + open + '}';
    }
     
    
}
