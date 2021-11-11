package random;


public class Random {

    public static void main(String[] args) {
   int arreglo [] = new int [100];
        for (int i = 0; i < 100; i++) {
            arreglo[i] = (int) (Math.random()*10);
        }
        System.out.println("Resultado");
        for (int i = 0; i < 100; i++) {
            System.out.println("["+i+"]="+arreglo[i]);
        }
    }
    
}
