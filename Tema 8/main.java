import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        Set<PFA> coduriCaen = new HashSet<>();
        coduriCaen.add(new PFA("123", "firma1", "23"));
        coduriCaen.add(new PFA("321", "firma2", "24"));
        coduriCaen.add(new PFA("213", "firma3", "23"));

        Set<Factura> Facturi = new HashSet<>();
        Facturi.add(new Factura("123", 1, 100, "cui", "23/12/2022"));
        Facturi.add(new Factura("123", 2, 150, "ac", "23/11/2022"));
        Facturi.add(new Factura("213", 3, 20, "mar", "23/10/2022"));
        Facturi.add(new Factura("321", 4, 300, "par", "23/09/2022"));
        System.out.println(coduriCaen);
        System.out.println(Facturi);
       Map<PFA, Factura> list = new HashMap<>();
//        list.put("123",new Factura("123",1, 100, "cui", "23/12/2022"));
//        list.put("321",new Factura("321",4, 300, "cui", "23/12/2022"));
        list.put(new PFA("123", "firma1", "23"), new Factura("123", 1, 100, "cui", "23/12/2022"));
        list.put(new PFA("124", "firma2", "24"), new Factura("124", 2, 150, "ac", "23/11/2022"));
        list.put(new PFA("321", "firma3", "23"), new Factura("123", 3, 20, "mar", "23/10/2022"));
        list.put(new PFA("123", "firma4", "26"), new Factura("123", 4, 300, "par", "20/12/2022"));
        System.out.println(list);
        for (Map.Entry<PFA, Factura> entry : list.entrySet()) {
            Set<Factura> setFacturi = (Set<Factura>) entry.getValue();
            System.out.println(setFacturi);
        }
//        for (PFA k : Set<Factura>) {
//            if (list.containsValue("123")) {
//                System.out.println(list);
//            }


        }
    }


