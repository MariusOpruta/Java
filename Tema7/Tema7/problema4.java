package Tema7;

import java.util.*;

    class ProblemaArray{
        public static void main(String[] args) {
            List<String> array1 = new ArrayList<>(4);
            List<String> array2 = new ArrayList<>(4);
            Scanner scanner = new Scanner(System.in);
            int i;

            for (i = 0; i < 4; i++) {
                System.out.println("Valoarea indexului " + i + " este: ");
                String j = scanner.nextLine();
                array1.add(j);
            }
            System.out.println("Array-ul este: " + array1);
            //Collections.swap(simpla, 0, 3);
            // SE PUTEA FACE SI MAI SIMPLU CU Collection.swap si o singura lista dar nu era in enunt :)

            int k;
            for (k=3;k>=0;k--){
                array2.add(array1.get(k));
            }
            System.out.println("Rasturnat: " + array2);
        }
    }
    class ProblemaListe {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random j = new Random();
        int i= j.nextInt(30);
        while (i>0 && i<30){
            if(i==10) {
                break;
            }
            lista.add(i);
            i++;

            System.out.println(lista);
        }
        //System.out.println(lista);
        }
    }




