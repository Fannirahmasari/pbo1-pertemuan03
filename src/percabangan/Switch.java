package percabangan;

public class Switch {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 53000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        } else {
            System.out.println("Uang cukup, berelaanlah");
        }
    }
}
