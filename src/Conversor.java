public class Conversor {
    private double numero;
    private String unidad1;

    public Conversor(double numero, String unidad1){
        this.numero = numero;
        this.unidad1 = unidad1;
    }

    public void convertir(String unidad2) {
        if (this.unidad1 == "kilometros" && unidad2 == "metros") {
            this.numero = this.numero * 1000;
            this.unidad1 = unidad2;
        } else if (this.unidad1 == "kilometros" && unidad2 == "centimetros") {
            this.numero = this.numero * 100000;
            this.unidad1 = unidad2;
        } else if (this.unidad1 == "metros" && unidad2 == "kilometros") {
            this.numero = this.numero / 1000;
            this.unidad1 = unidad2;
        } else if (this.unidad1 == "metros" && unidad2 == "centimetros") {
            this.numero = this.numero * 100;
            this.unidad1 = unidad2;
        } else if (this.unidad1 == "centimetros" && unidad2 == "metros") {
            this.numero = this.numero / 100;
            this.unidad1 = unidad2;
        } else if (this.unidad1 == "centimetros" && unidad2 == "kilometros") {
            this.numero = this.numero / 100000;
            this.unidad1 = unidad2;
        } else {
            System.out.println("ERROR");
        }
    }

    public void decirDatos(){
        System.out.println("El valor tras convertir es: "+this.numero+" "+this.unidad1);
    }
}
