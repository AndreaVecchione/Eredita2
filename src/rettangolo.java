public class Rettangolo extends Forma{

    private double lunghezza;
    private double larghezza;
    //override del metodo calcolo area creato su forma
    @Override
    public void calcolaArea() {
        double area = lunghezza * larghezza;
        System.out.println("l'area è: " + area);
    }
    public  Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }
}
