import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static String[] codeLine;

    public static void main(String[] argv) throws IOException {
        codeLine = new String[]{"define", "number", "nr1", "=", "10", ";"};
        Tree tree = new Tree();
        for (String s : codeLine) tree.insert(s);
        tree.inorderTraversal();
        System.out.println();
        detect();
    }

    public static void detect() throws IOException {
        File f1 = new File("C:\\Users\\fast\\IdeaProjects\\FLCD\\src\\main\\java\\token.in"); //Creation of File Descriptor for input file
        String[] words = null;  //Initialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr);//Creation of BufferedReader object

        for (int i = 0; i < codeLine.length; i++) {

            String s;
            String input = codeLine[i];   // Input word to be searched
            int count = 0;   //Initialize the word to zero
            while ((s = br.readLine()) != null)   //Reading Content from the file
            {
                words = s.split("\n");  //Split the word using space
                for (String word : words) {
                    if (word.equals(input))   //Search for the given word
                    {
                        count++;    //If Present increase the count by one
                    }
                }
            }

            if (count != 0)  //Check for count not equal to zero
            {
                System.out.println(input + " is in the token.in file");
            } else {
                System.out.println(input + " is not in the token.in file");
            }
        }
        fr.close();
    }


    public boolean isIdentifier(String token) {
        return token.matches("([a-zA-Z])");
    }

    public boolean isSeparator(char character) {
        return character == '{' || character == '}' || character == '(' ||
                character == ',' || character == ')' || character == ';' || character == ' ';
    }

    public boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%") ||
                token.equals("<") || token.equals("<=") || token.equals("==") || token.equals("!=") || token.equals(">") ||
                token.equals(">=");
    }

    private static boolean isConstant(){
        return true;
    }

    public static void clasify(){

    }
}