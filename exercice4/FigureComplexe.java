import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FigureComplexe implements Figure {

    private String dessin;
    private List<FigureSimple> sousFigures = new ArrayList<FigureSimple>();

    public FigureComplexe(String dessin) {
        this.dessin = dessin;
    }

    public String getDessin() {
        return dessin;
    }

    public void ajouter(FigureSimple figure) {
        sousFigures.add(figure);
    }

    public void supprimer(FigureSimple figure) {
        sousFigures.remove(figure);
    }

    public void translater(int x, int y) {
        for(FigureSimple figureSimple: sousFigures) {
            System.out.println("Anciennes position " + figureSimple.getDessin() +  " (x, y) = (" + figureSimple.getX() + "," + figureSimple.getY() + ")");
            figureSimple.translater(x, y);
            System.out.println("Nouvelles position " + figureSimple.getDessin() +  " (x, y) = (" + figureSimple.getX() + "," + figureSimple.getY() + ")");
        }
    }
}