import java.util.Arrays;

public class Histogram {

    private static int[] numberHeist(String anumberArray) {
        int[] numbers = new int[10];
        for (int i = 0; i < anumberArray.length(); i++) {
            char singleNumber = anumberArray.charAt(i);
            if ('0' <= singleNumber && '9'>=singleNumber) {
                numbers[singleNumber - '0']++;
            }
        }
        return numbers;
    }

    // In ASCII Table char values of numbers between 0 and 9 are between 48 and 57.

    private static int[] letterHist(String acharArray) {
        int[] alphabet = new int[26];

        for (int i = 0; i < acharArray.length(); i++) {
            char singleChar = acharArray.toLowerCase().charAt(i);

            if ('a' <= singleChar && 'z' >= singleChar) {
                alphabet[singleChar - 'a']++;
            }
        }
        return alphabet;
    }

    // In ASCII Table char values of letters between a and z are between 97 and 122. In this project capital letters are ignored.

    public static void main(String[] args) {
        String charArray = "aBbCccDdddeFfGggHhhhXYZ";
        System.out.println("Histogram for the word entered.");
        System.out.println(Arrays.toString(letterHist(charArray)));

        String numberArray = "0123456789";
        System.out.println("\nHistogram for the number entered.");
        System.out.println(Arrays.toString(numberHeist(numberArray)));
    }
}





/*
W metodzie letterHist tworze tabele int która ma rozmiar długosci alfabetu.  Następenie tworze pętle długą tak jak wprowadzony parametr aciagZnakow.length().
W tej pętli przez metode toLoweCase i charAt[i] ustalam że cały ciagZnaków ma byc zrownany do malych liter a ja pobieram ten znak o pozycji numer i.
Wiedząc że każdy char ma swoj odpowiednik w liczbach naturalnych wykorzystuje to w funkcji warunkowej sprawdzając czy mieści się on pomiędzy a i z.
Gdy tak jest to znaczy że wprowadzony znak musi znajdować sie w alfabecie. Przez co wystarczy odjąc od niego wartosc litery a co ustala odpowienie miejsce dla danej litery w tabeli alfabetu.
Dla nowego rekordu pojawiajacego sie dla danego pola tabeli nastepuje inkrementacja jego wartosci (pola).

 */
