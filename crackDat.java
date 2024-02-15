public class crackDat {
    public static void main(String[] args) {
        final int target = 89020737;
        boolean found = false;

        for (int i = 32; i < 127; i++) {
            for (int j = 32; j < 127; j++) {
                for (int k = 32; k < 127; k++) {
                    String input = Character.forDigit(i) + Character.forDigit(j) + Character.forDigit(k);

                    if (target == hashCode(input)) {
                        System.out.println("We got it! Password is: " + input);
                        found = true;
                        return;
                    }
                }
                if (found) { return; }
            }
            if (found) { return; }
        }

        if (!found) { System.out.println("Failure :'("); }
    }

    public int hashCode(String input) {
    int hash = 5;
    for (int i = 0; i < input.length(); i += 1)
        hash = (hash << 8) + input.charAt(i);
    return hash;
    }
}