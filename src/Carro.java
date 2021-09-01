public class Carro {
    private String name;
    private int releaseYear;
    private double price;

    public Carro(String name, int releaseYear, double price) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", price=" + price +
                '}';
    }

    public int compareToPrice(Carro car) {
        if (this.price != car.getPrice()) {
            return (int) (this.price - car.getPrice());
        }
        return (this.releaseYear - car.getReleaseYear());

    }

    public int compareToYear(Carro car) {
        return (int) (this.releaseYear - car.getReleaseYear());
    }

    public int compareToName(Carro car) {
        return (this.name.compareTo(car.getName()));
    }

}
