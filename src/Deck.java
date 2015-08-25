import java.util.Random;
import Card;

class Deck {
	  /**/
    int size;
	  Card[] d;

    Deck(int s) {
	      d = new Card[s];
	  }

    void shuffle() {
			  /**/
        Random r = new Random();
        for(int i = d.length-1; i > 0; i--) {
            int rand = r.nextInt(i);
            Card temp = d[i];
            d[i] = d[rand];
            d[rand] = temp;
        }
    }
}
