public class ProbandoClaseString {
    public static void main(String args [])throws Exception{
        String frase = "Hoy es un estupendo dia para aprender a programar en Java";
        String fraseResumen = frase.substring(0, 29) +
         "irnos a la playa, olvidarnos de todo y " + 
         frase.substring(29, frase.length());
        System.out.println(fraseResumen);
    }
}