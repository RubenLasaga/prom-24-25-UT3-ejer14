public class Main {
    public static void main(String[] args) {

        Conversor conversor1 = new Conversor(1000,"metros");
        Conversor conversor2 = new Conversor(100,"centimetros");
        Conversor conversor3 = new Conversor(1,"metros");

        conversor1.convertir("kilometros");
        conversor2.convertir("metros");
        conversor3.convertir("centimetros");

        conversor1.decirDatos();
        conversor2.decirDatos();
        conversor3.decirDatos();
    }
}