
public class Client {
    public static void main(String[] args) {

        Random random1 = Random.getInstance();
        System.out.println(random1);

        Random random2 = Random.getInstance(2000);
        System.out.println(random2);

        System.out.println("On peut remarquer que malgré 2 instanciations différentes, nous avons la même instance random en cours d'exécution.");
    }
}