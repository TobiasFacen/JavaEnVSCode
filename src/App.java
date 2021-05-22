public class App {
    public static void main(String[] args) throws Exception {
       
        System.out.println("vamos a probar la clase math");
        double base = 3;
        double exponente = 5;
        int resultado = (int)Math.pow(base, exponente);
        System.out.print("el resultado de " + base + " elevado a la ");
        System.out.println(exponente + " es igual a " + resultado);
        System.out.println("probamos la clase String");
        String nombre = "Tobias";
        System.out.println("mi nombre es " + nombre);
        System.out.println("mi nombre tiene " + nombre.length() + " letras.");
        System.out.println("la primera letra de mi nombre es " + nombre.charAt(0));
        int ultimaLetra = nombre.length();
        System.out.println("y la ultima letra es " + nombre.charAt(ultimaLetra-1));

    }
}