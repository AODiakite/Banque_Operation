/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Compte;
import java.util.List;

/**
 *
 * @author diakite
 */
public class CompteService {
    
    public Compte ouvrirC(String rib,double initialSolde) {
        Compte c=new Compte(rib, initialSolde);
        c.setOpen(true);
        if(0<=c.getSolde() & c.getSolde()<200) c.setCategorie('D');
        else if(200<=c.getSolde() & c.getSolde()<1000) c.setCategorie('C');
        else if(1000<=c.getSolde() & c.getSolde()<60000) c.setCategorie('B');
        else if(c.getSolde()>=60000) c.setCategorie('A');
        return c;

    }
        
    public int fermerC(Compte c){
        if(c.getSolde()!=0) return -1;
        else if(c.isOpen()==false) return -2;
        else{
            c.setOpen(false);
            return 1;
        }
    }
    public int debiter(Compte c,double debit){
        if(c.getSolde()<debit) return -1;
        else{
            c.setSolde(c.getSolde()-debit);
            return 0;
        }
        
    }
       public int crediter(Compte c,double credit){
        
       
            c.setSolde(c.getSolde()-credit);
            return 0;
        
    }
        public int transfert(Compte src,Compte dest,double montant){
           if(src.isOpen()==false) return -1;
           else if(dest.isOpen()==false) return -2;
           else if(debiter(src, montant)==-1) return -3;
           else{
               debiter(src, montant);
               crediter(dest, montant);
               return 1;
           }
       }
       public Compte findByrib(String rib,List<Compte> cs){
           for(int i=0;i<cs.size();i++){ 
              Compte c=cs.get(i);
              if(c.getRib().equals(rib)) return c;
           }
           return null;
           
       }
        
       
        
        
   
    
}
