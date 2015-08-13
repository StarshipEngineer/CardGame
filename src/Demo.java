import java.util.Random;

class Demo {
    public static void main(String args[]) {
        int size = 10;
        
        Stack s = new Stack(size);
        System.out.println();
        
        for(int i = 0; i < size; i++) {
            s.put(i);
        }
        
        for(int i = 0; i < size; i++) {
            System.out.print(s.get(i));
        }
        
        s.shuffle();
        System.out.println();
        for(int i = 0; i < 10; i++) {
            System.out.print(s.get(i));
        }
    }
}


/*class Deck {
    int size;
    Card[] d;
    
    Deck(int s) {
        d = new Card[s];
    }

 void shuffle() {
  Random r = new Random();
  for(int i = d.length-1; i > 0; i--) {
   int rand = r.nextInt(i);
   Card temp = d[i];
   d[i] = d[rand];
   d[rand] = temp;
  }
 }
}*/

class Stack {
    int size;
    int[] d;
    
    Stack(int s) {
        d = new int[s];
    }

    void shuffle() {
        Random r = new Random();
        for(int i = d.length-1; i > 0; i--) {
            int rand = r.nextInt(i);
            int temp = d[i];
            d[i] = d[rand];
            d[rand] = temp;
        }
    }
    void put(int n) {
        d[n] = n;
    }
    
    int get(int n) {
        return d[n];
    }
}