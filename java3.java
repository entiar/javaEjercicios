public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Victor", "Alejandra", "Vanesa", "Elisa", "Matias"};
        String cadena = "";
        for(String nombre : nombres){

            cadena += nombre + " ";

        }
        System.out.println(cadena);

    }
}
