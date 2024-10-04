import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaMoneda consultaMoneda=new ConsultaMoneda();
        Scanner teclado=new Scanner(System.in);
        ConversionDeMonedas conversionDeMonedas=new ConversionDeMonedas();

        int opcion=0;
        while(opcion!=8){
            System.out.println("**********************************");
            System.out.println("Bienvenid@ al conversor de Moneda :)");
            System.out.println("1) Dólar --> Peso Argentino");
            System.out.println("2) Peso Argentino --> Dólar");
            System.out.println("3) Dólar --> Real Brasileño");
            System.out.println("4) Real Brasileño --> Dólar");
            System.out.println("5) Dólar --> Peso Colombiano");
            System.out.println("6) Peso Colombiano --> Dólar");
            System.out.println("7) Conversion de Monedas");
            System.out.println("8) Salir");
            opcion= Integer.valueOf(teclado.nextLine());
            try {
                switch (opcion){
                    case 1:
                        conversionDeMonedas.convertir("USD","ARS",consultaMoneda);
                        break;
                    case 2:
                        conversionDeMonedas.convertir("ARS","USD",consultaMoneda);
                        break;
                    case 3:
                        conversionDeMonedas.convertir("USD","BRL",consultaMoneda);
                        break;
                    case 4:
                        conversionDeMonedas.convertir("BRL","USD",consultaMoneda);
                        break;
                    case 5:
                        conversionDeMonedas.convertir("USD","COP",consultaMoneda);
                        break;
                    case 6:
                        conversionDeMonedas.convertir("COP","USD",consultaMoneda);
                        break;
                    case 7:
                        conversionDeMonedas.extras(consultaMoneda);
                        break;
                    case 8:
                        System.out.println("Saliendo del programa :(");
                        break;
                    default:
                        System.out.println("Opcion Invalida");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
