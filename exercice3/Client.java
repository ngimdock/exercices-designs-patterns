public class Client {
    public static void main(String[] args) {

        TacheComplexe tacheComplexe = new TacheComplexe("cuisiner");

        tacheComplexe.ajouter(new TacheElementaire("Tourner fufu", 20));
        tacheComplexe.ajouter(new TacheElementaire("Preparer le eru", 10));

        System.out.println("Cout de la tâche complexe " + tacheComplexe.getNom() + ": " + tacheComplexe.getCout());
    }
}