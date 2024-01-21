class StringReplace{
    public static void main(String args[]) {
        String org = "Thwas was a test. Thwas was, too.";
        String search = "was";
        String sub = "is";
        String result = "";
        int i;
        do {
            i = org.indexOf(search);
            if(i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        } while(i != -1);
        System.out.println(org);
    }
}