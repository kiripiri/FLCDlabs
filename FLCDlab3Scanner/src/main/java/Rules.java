import java.util.List;

public class Rules {
    private String start;
    private List<List<String>> rules;

    Rules(String start, List<List<String>> rules) {
        this.start = start;
        this.rules = rules;
    }

    List<List<String>> getRules() {
        return rules;
    }

    String getStart() {
        return start;
    }

//    public String toString() {
//        StringBuilder sb = new StringBuilder(start + " - " + rules);
//        for (List<String> rule : rules) {
//            for (String element: rule)
//                sb.append(element).append(" ");
//
//        }
//       // sb.replace(sb.length() - 3, sb.length() - 1, "");
//        return sb.toString();
//    }
}