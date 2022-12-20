
// hello world program
public class Client {

    public static void main(String [] args) {
        System.out.println("Hello world !");

        FigureComplexe figureComplexe = new FigureComplexe("naruto");

        figureComplexe.ajouter(new FigureSimple("moustache", 2, 3));
        figureComplexe.ajouter(new FigureSimple("bando conoha", 4, 5));
        figureComplexe.ajouter(new FigureSimple("cape", 6, 7));

        figureComplexe.translater(10, 10);
    }
}