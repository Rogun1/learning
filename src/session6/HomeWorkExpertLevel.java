package session6;

import java.util.Scanner;

public class HomeWorkExpertLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Scrie Text-ul: ");
        StringBuilder text = new StringBuilder(scanner.next());
        System.out.print("Cate shifturi sa aibe: ");
        int shift = scanner.nextInt();
        System.out.print("Apasa 1 pentru Codare sau 2 pentru Decodare: ");
        int encodeOrDecode = scanner.nextInt();
        StringBuilder textEncoded = new StringBuilder("");
        StringBuilder textDecoded = new StringBuilder("");

        switch (encodeOrDecode){
            case 1 ->{
                for (int i = 0; i < text.length(); i++){
                    if (!Character.isLetter(text.charAt(i))){
                        continue;
                    }else {
                        textEncoded.append(letterEncode(text.charAt(i), shift));
                    }
                }
                System.out.println(textEncoded);
            }
            case 2 ->{
                for (int i = 0; i < text.length(); i++){
                    if (!Character.isLetter(text.charAt(i))){
                        continue;
                    }else {
                        textDecoded.append(letterDecode(text.charAt(i), shift));
                    }
                }
                System.out.println(textDecoded);
            }
            default -> System.out.println("Eroare");
        }

    }
    public static char letterEncode(char c, int shifts){

        if (!Character.isLetter(c)) return c;
        char baza = (Character.isUpperCase(c))? 'A' : 'a';
        char nouaLitera = (char) (baza + (c - baza + shifts) % 26);

        return nouaLitera;
    }
    public static char letterDecode(char c, int shifts){

        if (!Character.isLetter(c)) return c;
        char baza = (Character.isUpperCase(c))? 'A' : 'a';
        char nouaLitera = (char) (baza + (c - baza - shifts + 26) % 26);

        return nouaLitera;
    }
}
