import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EncryptionProgram {

    private Scanner scanner;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private char[] letters;

    EncryptionProgram(){
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        shuffledList= new ArrayList<>();
        character = ' ';

        newKey();
        askQuestion();

    }

    private void askQuestion(){
        while (true) {
            System.out.println("*********************************************************");
            System.out.println("You want to: ");
            System.out.println("(N)ewKey");
            System.out.println("(G)etKey");
            System.out.println("(E)ncrypt");
            System.out.println("(D)ecrypt");
            System.out.println("(Q)uit");
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (response) {
                case 'N':
                    newKey();
                    break;
                case 'G':
                    getKey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                System.out.println("Invalid !!!");
                    break;
            }
        }
    }

    private void newKey(){
        character = ' ';
        list.clear();
        shuffledList.clear();

        for(int i = 32; i<127;i++){
            list.add(Character.valueOf(character));
            character++;
        }

        shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("A new key has been generated");
    }

    private void getKey(){
        System.out.println("Key: ");
        for(Character x:list)
            System.out.print(x);
        System.out.println();
       
        for(Character x:shuffledList)
            System.out.print(x);
        System.out.println();
    }

    private void encrypt(){
        System.out.println("Message to encrypted: ");
        String message = scanner.nextLine();

        letters = message.toCharArray();

        for(int i =0;i<letters.length;i++){
            for(int j =0;j<list.size();j++){
                if(letters[i] == list.get(j)){
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted:");
        for(char x:letters){
            System.out.print(x);
        }
        System.out.println();
    }

    private void decrypt(){
        System.out.println("Message to decrypted: ");
        String message = scanner.nextLine();

        letters = message.toCharArray();

        for(int i =0;i<letters.length;i++){
            for(int j =0;j<shuffledList.size();j++){
                if(letters[i] == shuffledList.get(j)){
                    letters[i] = list.get(j);
                    break;
                }
            }
        }
        System.out.println("Decrypted:");
        for(char x:letters){
            System.out.print(x);
        }
        System.out.println();
    }

    private void quit(){
        System.out.println("Good bye");
        System.exit(0);
    }
}
