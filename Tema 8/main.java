package curs8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        Set<String> coduriCaen=new HashSet<>();
        coduriCaen.add("5000");
        coduriCaen.add("5000");
        coduriCaen.add("6000");
        System.out.println(coduriCaen);

        Set<PFA> coduri = new HashSet<>();
        coduri.add(new PFA("123", "firma1",coduriCaen));
        coduri.add(new PFA("321", "firma2",coduriCaen));
        coduri.add(new PFA("213", "firma3",coduriCaen));
        System.out.println(coduri);

        Set<Factura> Facturi = new HashSet<>();
        Facturi.add(new Factura(123,1,100,"apa plata","23/10/2022"));
        Facturi.add(new Factura(123, 3, 20, "mere", "23/10/2022"));
        Facturi.add(new Factura(213, 4, 30, "pere", "23/09/2022"));
        Facturi.add(new Factura(213,2,150,"apa minerala","23/11/2022"));
        System.out.println(Facturi);

        Map<PFA, Set<Factura>> list = new HashMap<>();
        list.put(new PFA("123","firma1",coduriCaen),Facturi);
        list.put(new PFA("213","firma1",coduriCaen),Facturi);
        //list.put(PFA,Facturi);
        System.out.println(list);

//        }
//        list.put(new PFA(123,"qw",))
//        for(Factura cui :Facturi){
//            System.out.println(Facturi.equals(cui));
//        }
//        System.out.println(list);

        for (Map.Entry<PFA, Set<Factura>> entry : list.entrySet()) {
//            Set<Factura> value = entry.getValue();
            Map.Entry<PFA, Set<Factura>> value = (Map.Entry<PFA, Set<Factura>>) entry.getValue();
            System.out.println(value);
            // aici va rog sa parcurgeti si setul si adunati pentru fiecare PFA valoarea totala pe care au de incasat de pe facturile lor
        }

        //  list.put((PFA) coduri,(Factura)Facturi);
//        list.put("321",new Factura("321",4, 300, "cui", "23/12/2022"));
//        list.put(new PFA("123", "firma1", "23"), new Factura((PFA) coduri,1, 100, "cui", "23/12/2022"));
//        list.put(new PFA("124", "firma2", "24"), new Factura((PFA) coduri, 2, 150, "ac", "23/11/2022"));
//        list.put(new PFA("321", "firma3", "23"), new Factura((PFA) coduri, 3, 20, "mar", "23/10/2022"));
//        list.put(new PFA("123", "firma4", "26"), new Factura((PFA) coduri, 4, 300, "par", "20/12/2022"));
        // System.out.println(list);
//        for (Map.Entry<PFA, Factura> entry : list.entrySet()) {
//            Factura setFacturi = entry.getValue();
//            System.out.println(entry);
//        }
//        for (PFA k : Set<Factura>) {
//            if (list.containsValue("123")) {
//                System.out.println(list);
//            }
    }

}