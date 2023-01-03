package curs7;

import java.util.*;

import static java.lang.Integer.parseInt;


    class ProblemaArray{
        public static void main(String[] args) {
            List<Integer> rasturnat = new ArrayList<>(4);
            List<Integer> simpla = new ArrayList<>(4);
            Scanner scanner = new Scanner(System.in);
            int i;
            int j;
            for (i = 0; i < 4; i++) {
                System.out.println("Valoarea indexului " + i + " este: ");
                j = parseInt(scanner.nextLine());
                simpla.add(j);
            }
            System.out.println("Array-ul este: " + simpla);
            //Collections.swap(simpla, 0, 3);
            // SE PUTEA FACE SI MAI SIMPLU CU Collection.swap si o singura lista dar nu era in enunt :)

            int k;
            for (k=3;k>=0;k--){
                rasturnat.add(simpla.get(k));
            }
            System.out.println("Rasturnat: " + rasturnat);
        }
    }
    class ProblemaListe {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int i = 0;
        while (i != 10) {
            Random j = new Random();
            lista.add(j.nextInt(30));
            i++;
            //System.out.println(lista);
        }

        System.out.println(lista);

        }
    }




