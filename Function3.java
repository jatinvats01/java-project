 class MiddleCharacter {

    public static void printMiddleCharacter(String str) {
        int len = str.length();
      
        int mid = len / 2;
        if (len % 2 == 1) {
            System.out.println(str.charAt(mid));
        }
       
        else {
            System.out.println(str.substring(mid - 1, mid + 1));
        }
    }

    public static void main(String[] args) {
        printMiddleCharacter("Java");
        printMiddleCharacter("jatinvts");
        printMiddleCharacter("Hello");
        printMiddleCharacter("World");
    }
}
