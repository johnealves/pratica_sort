public class Main {
    public static void main(String[] args) {
        ConcessionariaDoZe concessionaria = new ConcessionariaDoZe();
        concessionaria.addcar("Corvette Stingray", 1972, 249900);
        concessionaria.addcar("Alfa Romeo GTV", 1972, 179900);
        concessionaria.addcar("Pontiac Firebird", 1968, 289900);
        concessionaria.addcar("Ford Mustang Hard Top", 1969, 229900);

        concessionaria.listCarsByPrice();
        concessionaria.listCarsByYear();
        concessionaria.listCarsByName();
    }
}
