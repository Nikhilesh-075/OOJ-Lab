public class StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        System.out.println("Original StringBuffer: " + stringBuffer);
        stringBuffer.setLength(5);
        System.out.println("After setLength(5): " + stringBuffer);

        char charAtIndex = stringBuffer.charAt(1);
        System.out.println("Character at index 1: " + charAtIndex);

        stringBuffer.setCharAt(1, 'a');
        System.out.println("After setCharAt(1, 'a'): " + stringBuffer);

        char[] destination = new char[5];
        stringBuffer.getChars(0, 5, destination, 0);
        System.out.println("Characters from index 0 to 5: " + new String(destination));

        stringBuffer.append(" Greetings!");
        System.out.println("After append(\" Greetings!\"): " + stringBuffer);

        stringBuffer.insert(7, " Awesome");
        System.out.println("After insert(7, \" Awesome\"): " + stringBuffer);

        stringBuffer.reverse();
        System.out.println("After reverse(): " + stringBuffer);

        stringBuffer.delete(3, 9);
        System.out.println("After delete(3, 9): " + stringBuffer);

        stringBuffer.deleteCharAt(5);
        System.out.println("After deleteCharAt(5): " + stringBuffer);

        stringBuffer.replace(0, 5, "Hola");
        System.out.println("After replace(0, 5, \"Hola\"): " + stringBuffer);

        String substring = stringBuffer.substring(5, 10);
        System.out.println("Substring from index 5 to 10: " + substring);
    }
}
