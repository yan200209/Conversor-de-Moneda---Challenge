import java.util.Scanner;

public class ConversionDeMonedas {
    public Scanner teclado=new Scanner(System.in);

    public void convertir(String base,String tarjet,ConsultaMoneda consultaMoneda){
        double convertido;
        double saldo;

        Monedas conversion=consultaMoneda.consultarMoneda(base,tarjet);
        System.out.println("El Factor de Conversion de Monedas es el siguiente: ");
        System.out.println("1 ["+base+"]"+" --> "+conversion.conversion_rate()+" ["+tarjet+"]");

        System.out.println("Digite el valor a Convertir: ");
        saldo=Double.parseDouble(teclado.nextLine());
        convertido=conversion.conversion_rate()*saldo;

        System.out.println("El Valor de "+saldo+"["+
                base+"]"+
                " corresponde al valor final de "+convertido+"["+
                tarjet+"]\n");

    }

    public void extras(ConsultaMoneda consultaMoneda){
        System.out.println("*******************************");
        System.out.println("Elige el Tipo de Moneda base a Convertir:");
        String base=teclado.nextLine();

        System.out.println("Elige el Tipo de Moneda Final a Convertir:");
        String tarjet=teclado.nextLine();
        convertir(base,tarjet,consultaMoneda);
    }
}
