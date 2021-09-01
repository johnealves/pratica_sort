import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcessionariaDoZe {
    List<Carro> cars= new ArrayList<>();

    public void addcar(String name, int releaseYear, double price) {
        Carro car = new Carro(name, releaseYear, price);
        cars.add(car);
    }

    public void listCars() {
        System.out.println("_________________________________");
        System.out.println("LISTA DE CARROS");
        System.out.println();
        printList(cars);
        System.out.println("_________________________________");
    }

    public void listCarsByPrice() {
        cars.sort(Carro::compareToPrice);
        System.out.println("_________________________________");
        System.out.println("LISTA DE CARROS POR PREÇO");
        System.out.println();
        printList(cars);
        System.out.println("_________________________________");
    }

    public void listCarsByYear() {
        cars.sort(Carro::compareToYear);
        System.out.println("_________________________________");
        System.out.println("LISTA DE CARROS POR ANO");
        System.out.println();
        printList(cars);
        System.out.println("_________________________________");
    }

    public void listCarsByName() {
        cars.sort(Carro::compareToName);
        System.out.println("_________________________________");
        System.out.println("LISTA DE CARROS POR NOME");
        System.out.println();
        printList(cars);
        System.out.println("_________________________________");
    }

    private void printList(List<Carro> list) {
        for (Carro car:list) {
            System.out.println(
                    "" + car.getName() + " " + car.getReleaseYear() + " Preço: R$ " + car.getPrice()
            );
        }
    }
}
