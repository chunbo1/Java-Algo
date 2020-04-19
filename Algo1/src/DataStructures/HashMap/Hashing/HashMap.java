package DataStructures.HashMap.Hashing;


class HashMap {
    private int hsize;
    private LinkedList[] buckets;

    public HashMap(int hsize) {
        buckets = new LinkedList[hsize];
        for (int i = 0; i < hsize; i++) {
            buckets[i] = new LinkedList();
            // Java requires explicit initialisaton of each object
        }
        this.hsize = hsize;
    }

    public int hashing(int key) {
        int hash = key % hsize;
        if (hash < 0)
            hash += hsize;
        return hash;
    }

    public void insertHash(int key) {
        int hash = hashing(key);
        buckets[hash].insert(key);
    }


    public void deleteHash(int key) {
        int hash = hashing(key);

        buckets[hash].delete(key);
    }

    public void displayHashtable() {
        for (int i = 0; i < hsize; i++) {
            System.out.printf("Bucket %d :", i);
            buckets[i].display();
        }
    }

    public static void main(String args[]) {
    	System.out.println("Start");
    	HashMap h = new HashMap(10);
    	h.insertHash(1);
    	h.insertHash(2);
    	h.insertHash(2);
    	h.insertHash(3);
    	h.insertHash(333);
    	h.insertHash(33);
    	h.insertHash(4);
    	h.insertHash(4);
    	h.deleteHash(4);
    	h.displayHashtable();
    	System.out.println("End");
    }
}
