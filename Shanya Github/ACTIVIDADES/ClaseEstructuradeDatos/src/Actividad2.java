import java.util.ArrayList;

    public class Actividad2 {
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();
            names.add("Yised");
            names.add("David");
            names.add("Shanya");
            names.add("Johan");
            names.add("Valery");
            System.out.println("Lista nombres:" + String.valueOf(names));
            System.out.println("Tamaño de la lista:" + names.size());
            System.out.println("Nombre:" + (String) names.get(3));

            ArrayList<Integer> num = new ArrayList<>();
            num.add(2);
            num.add(4);
            num.add(8);
            num.add(10);
            num.add(12);
            num.add(14);
            int acm = (Integer) num.get(0) * (Integer) num.get(1) + (Integer) num.get(2) + (Integer) num.get(3) + (Integer) num.get(4) + (Integer) num.get(5);
            System.out.println("Lista de números:" + String.valueOf(num));
            System.out.println("Contenido de la lista de números:" + num.size());
            System.out.println("Número selecionado:" + String.valueOf(num.get(2)));
            System.out.println("Sumatoria:" + acm);
        }
    }

