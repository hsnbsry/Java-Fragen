import java.util.ArrayList;
import java.util.Arrays;

public class Frage00015 {
    public static void main(String[] args) {
        // String array icerisindeki 4 harfli kelimeleri return eden bir method yazalim.
        String []str ={"sali","cuma","pazar","persembe","pers"};
        System.out.println(Arrays.toString(str));

        System.out.println(Arrays.toString(dortHarfli(str)));


    }
    public static String[] dortHarfli(String []str) {
        ArrayList<String> list = new ArrayList<>();

        for (String w : str) {
            if(w.length()==4) {
                list.add(w);
            }

        }
        String [] result = list.toArray(new String[(list.size())]);
        return result;
    }
}
