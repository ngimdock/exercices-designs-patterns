public class Random {

    private static Random instance;

    private long seed;

    private Random() {};

    private Random(long seed) {
        this.seed = seed;
    };

    public float nextFloat() {
       long r = seed;
        return (float) (r * (1.0 / 4294967296.0));
    }

    public static Random getInstance() {
        if (instance == null) {
            instance = new Random();
        }
        return instance;
    }

    public static Random getInstance(long seed) {
        if (instance == null) {
            instance = new Random(seed);
        }
        return instance;
    }

}
