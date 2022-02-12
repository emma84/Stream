import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsApp {

    private List<String> nombres;
    private List<String> numeros;

    public StreamsApp(){
        nombres = new ArrayList<>();
        nombres.add("Eliana");
        nombres.add("Emmanuel");
        nombres.add("Homero");
        nombres.add("Noah");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
    }

    public void filtrar(){
     nombres.stream().filter(x -> x.contains("e") || x.contains("E")).forEach(System.out::println);
    }

    public void ordenar(){
        //nombres.stream().sorted().forEach(System.out::println);
        nombres.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public void transformar(){
        numeros.stream().map(x -> Integer.parseInt(x)+1).forEach(System.out::println);
    }

    public void limitar(){
        nombres.stream().limit(2).forEach(System.out::println);
    }

    public static void main(String[] args) {
        StreamsApp streamsApp = new StreamsApp();
        streamsApp.filtrar();
        System.out.println("----------------------------------------------");
        streamsApp.ordenar();
        System.out.println("----------------------------------------------");
        streamsApp.transformar();
        System.out.println("----------------------------------------------");
        streamsApp.limitar();
    }
}
