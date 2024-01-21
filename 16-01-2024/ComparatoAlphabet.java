class ComparatoAlphabet{
    static String arr[] = {"van", "watch", "ball", "cat", "xmas", "yatch", "zee", "apple", "ice", "jug", "kite", "lift", "man", "net", "orange", "dog", "ent", "free", "gun", "hen", "parrot", "queen", "ring", "star", "tree", "umbrella"};
    public static void main(String args[]) {
	System.out.println("Sorted alphabets");
        for(int j = 0; j < arr.length; j++) {
            for(int i = j + 1; i < arr.length; i++) {
                if(arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i]; arr[i] = t;
                }
            }
            System.out.print(arr[j]+", ");
        }
    }
}


