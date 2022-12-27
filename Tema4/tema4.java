package Curs4;


import java.util.Scanner;

public class tema4 {
    public static void main(String[] args) {
        {   // problema 1 user&parola
            String user = "marius";
            String parola = "parola";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti userul: ");
            String user1 = scanner.nextLine();
            System.out.println("Introduceti parola: ");
            String parola1 = scanner.nextLine();
            // if (user.equals(user1) || parola.equals(parola1)) {  -gresit
            if (!user.equals(user1) || !parola.equals(parola1)) {
                System.out.println("Credentilale gresite");
            } else {
                System.out.println("Userul intordus este: " + user1);
                System.out.println("Parola intordusa este: " + parola1);
            }
        }
        {// problema 2
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numele candidatului: ");
            String nume = scanner.nextLine();
            if (nume.length()>25){
                System.out.println("Numele introdus este prea lung pentru sistem");
                }else{
                System.out.println("Numele introdus este: "+nume);
            }
        }
        {//problema 3
            Scanner scanner = new Scanner(System.in);
            System.out.print("Numele Produsului:");
            String numeProdus = scanner.nextLine();
            System.out.print("Cantitate:");
            int cantinate = scanner.nextInt();
            System.out.print("Pretul este de: ");
            double pret = scanner.nextDouble();

            System.out.println("Pentru produsele de tip " + numeProdus+ " cu cantitatea " + cantinate + ", pretul este de "+ pret*cantinate);

        }
        {//problema 4
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti textul: ");
            String text = scanner.next();
            //am schimbat conditia din while in do
            do{
                    System.out.print("Introduceti textul: ");
                    text = scanner.next();
                }while (!text.equalsIgnoreCase("stop"));
        }
        {//problema 5
         String text = "Nu o sa mai fiu obraznic";
         int i;
         for (i=0;i<=100;i++){
             System.out.println(text);
         }
        }
        {//problema 6
            String text = "Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook.";
            Scanner scanner=new Scanner(System.in);
            System.out.print("Nume&Prenume: ");
            String numePrenume = scanner.next();
            System.out.print("Cursul la care participati: ");
            String curs = scanner.next();
            System.out.print("Compania la care face-ti cursul: ");
            String firma = scanner.next();

            text = text.replace("NumePrenume", numePrenume);
            text = text.replace("testare",curs);
            text = text.replace("facebook",firma);
            System.out.println(text);
        } // am scris asta pentru ca aici am ???? cu imutabilitatea -
            // in sensul ca daca reinitializez acelasi text atunci nu mai este imutabil
        // la curs era vb de un alt string de ex text2 dar daca il re-initializez pe el insusi?? (System.out.println(text)- printeaza ce vreau eu - nu modifica variabila
        {//problema 7
            String text = "avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina";
            // am scos substring de la 0->29 si am inlocuit avion cu racheta
            String text1 = text.substring(0,29).replace("avion","racheta");
            // la fel cu masina
            String text2 = text.substring(50,71).replace("masina","autobuz");
            System.out.println(text1);
            System.out.println(text2);

            //am concatenat string-urile adica la text1 am pus ce a ramas din text (avion) + masina inlocuita cu autobuz si e a ramas din text pana la final indexul final
            //pe care l-am aflat cu System.out.println(text.length())
            System.out.println(text1.concat(text.substring(29,50))+text2+text.substring(71,98));
            // se putea face si mai general - aici recunosc am numarat indecsii :))
        }
        {//problema 8
            String text = "Am DecIs Sa ImI faC TeMa AstAzI";
            System.out.println(text.toLowerCase());
            System.out.println(text.toUpperCase());
        }
        {//optional probl1
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti textul: ");
            String text = scanner.next();
            int litMici = 0;
            int litMari = 0;
            for (int i=0; i<text.length();i++){
                char litera = text.charAt(i);
                if(litera>=65 && litera<=90){
                    litMari++;
                }else if(litera>=97 && litera<122){
                    litMici++;
                }
            }
            System.out.println("Litere mari: "+litMari);
            System.out.println("Litere mici: "+litMici);
        }
        {//optional probl 2
            Scanner scanner = new Scanner(System.in);
            System.out.print("Scrie textul: ");
            String text = scanner.next();
            System.out.print("Scrie keyword: ");
            String keyword = scanner.next();
            System.out.println(text.split(keyword,-1).length-1);

        }
        {//optional 3
            Scanner scanner=new Scanner(System.in);
            System.out.print("Scrie un cuvant: ");
            String text = scanner.nextLine();
            String text2 = text.substring(text.length()-2);
            System.out.println(text2);
            do{
                    System.out.print("Scrie cuvantul care incepe cu: " + text2 + " : ");
                    text = scanner.nextLine();
                    if (!text.substring(0,2).equals(text2)) {
                        System.out.println("Cuvant Gresit!");
                        break;
                    }
                    text2 = text.substring(text.length() - 2);
                    System.out.println(text2);
            }while (!text2.equals("nt"));
            System.out.println("Esti Fazan!");
        }
    }


}




