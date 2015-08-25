import java.util.Random;

class Die {
    int max;
    Random r = new Random();

    Die(int m) {
        max = m+1;
    }

    int roll() {
        return r.nextInt(max);
    }
}