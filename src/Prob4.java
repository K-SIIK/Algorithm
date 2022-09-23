import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
// =====================================     못품        =============================
class Prob4 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        ArrayList<String> part = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> comp = new ArrayList<>(Arrays.asList(completion));

        Collections.sort(part);
        Collections.sort(comp);

        for (int i = comp.size() - 1; i >= 0; i--) {
            if (comp.get(i).equals(part.get(i))) {
                comp.remove(i);
                part.remove(i);
            }
        }



        if (answer.equals("")) {
            answer = part.get(part.size() - 1);
        }
        return answer;
    }
}

// ArrayList 오름차순 Collections.sort()
