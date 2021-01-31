public class ReverseStroki {
    public ReverseStroki(String s) {
        char [] word = new char[s.length()];
        int wordIndex = 0;
        for (int i = s.length() - 1; i >= 0; i = i-1) {
            word[wordIndex] = s.charAt(i);
            wordIndex = wordIndex+1;
        }
        String reverse = "";
        for (int i = 0; i < s.length(); i = i+1){
            reverse = reverse + word[i];
        }
        System.out.print("Инвертированная строка: ");
        System.out.print(reverse);
    }
}