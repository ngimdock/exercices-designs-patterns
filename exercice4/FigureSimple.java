

public class FigureSimple {

    private String dessin;
    private int x = 0;
    private int y = 0;

    public FigureSimple(String dessin, int x, int y) {
        this.dessin = dessin;
        this.x = x;
        this.y = y;
    }

    public String getDessin() {
        return dessin;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void translater(int x, int y) {
        this.x += x;
        this.y += y;
    }
}