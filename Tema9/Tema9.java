import java.util.*;

public class Tema9 {
    public static void main(String[] args) {
        String[] culori = {"rosu","galben","albastru"};
        List<String>ListaCulori = Arrays.asList(culori);
        System.out.println(ListaCulori);
        Queue<String>queueCulori=new LinkedList<>();
        queueCulori.add("negru");
        for(String element:culori){
           queueCulori.add(element);
        }
        queueCulori.add("alb");
        System.out.println(queueCulori);

        List<Queue<String>> reverse = Arrays.asList(queueCulori);
        Collections.reverse((List<?>) queueCulori);
        System.out.println(reverse);

        Set<String> setCulori = new HashSet<>() ;
        for (String element: queueCulori){
            setCulori.add(element);
        }
        System.out.println(setCulori);

        String[] arrayCulori=new String[setCulori.size()];
        setCulori.toArray(arrayCulori);
        for (int i=0; i<arrayCulori.length; i++){
            System.out.println("elementul cu indexul "+(i+1)+"este "+arrayCulori[i]);
        }
        System.out.println(arrayCulori);

        Map<Integer,String>mapCulori = new HashMap<>();
        for (int i=0; i<arrayCulori.length; i++){
            mapCulori.put(i,arrayCulori[i]);
        }
        System.out.println(mapCulori);

        // in cazul de fata nu se poate testa pct-ul 8 :)

    }

}
