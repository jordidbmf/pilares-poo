package automoveis;
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        //jeep.ligar();
        jeep.setChassi("890");

        Moto z400 = new Moto();
        //z400.ligar();
        z400.setChassi("123");

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}
