import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FiniteAutomata {
    private List<String> nonTerminals;
    private Set<String> terminals;
    private List<String> toString;
    private String startingSymbol;
    private String finalState;

    public FiniteAutomata() {
        this.nonTerminals = new LinkedList<>();
        this.terminals = new HashSet<>();
        this.toString = new ArrayList<>();
        getGrammarFromFile();
    }

    private void getGrammarFromFile() {
        try {
            int i = 0;
            for (String line : Files.readAllLines(Paths.get("C:\\Users\\fast\\IdeaProjects\\FLCDlab3Scanner\\src\\main\\java\\Inputs\\FA.in"))) {
                //"C:\Users\fast\IdeaProjects\FLCDlab3Scanner\src\main\java\Inputs\FA.in"
                if (i <= 10) {
                    String[] tokens = line.split(" ");
                    for (String token : tokens) {
                        if (i == 0) {
                            nonTerminals.add(token);
                        }
                        if (i == 1) {
                            terminals.add(token);
                        }
                        if (i == 2) {
                            startingSymbol = token;
                        }
                        if (i == 3) {
                            finalState = token;
                        }
                        if (i > 3) {
                            toString.add(token);
                        }
                    }
                }

                if (i > 3) {
                    String[] tokens = line.split(" ");
                    List<List<String>> rules = new ArrayList<>();
//                    for ( String rule: tokens[1].split(" \\| "))
//                         rules.add(Arrays.asList(rule.split(" ")));
//                    toString.add(new Rules(tokens[1],rules));
//
//                    for ( String rule: tokens[0].split(" \\| "))
//                        rules.add(Arrays.asList(rule.split(" ")));
//                    toString.add(new FAtoString(tokens[0], rules));
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getNonTerminals() {
        return nonTerminals;
    }

    public Set<String> getTerminals() {
        return terminals;
    }

    public List<String> getRules() {
        return toString;
    }

    public String getStartingSymbol() {
        return startingSymbol;
    }

    public String getFinalState() {
        return finalState;
    }


}
