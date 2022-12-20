import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TacheComplexe implements Tache {

    private String nom;
    private List<Tache> sousRepertoire = new ArrayList<Tache>();

    public TacheComplexe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getCout() {
        int totalCount = 0;

        for(Tache tache: sousRepertoire) {
            totalCount += tache.getCout();
        }

        return totalCount;
    }

    public void ajouter(Tache newTache) {
        sousRepertoire.add(newTache);
    }

    public void remove(Tache tache) {
        sousRepertoire.remove(tache);
    }
}