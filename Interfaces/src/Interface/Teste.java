package Interface;

public class Teste {

    public static void main(String[] args) {
        
        AreaCalculavel a = new Retangulo(3, 2);
        System.out.println("Área do retângulo: " + a.calculaArea());

        a = new Quadrado(6);
        System.out.println("Área do quadrado: " + a.calculaArea());

        a = new Circulo(4);
        System.out.println("Área do círculo: " + a.calculaArea());

    }
}
