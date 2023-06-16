package strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClienteEstrategia {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) { 

        ContextoPago contexto = new ContextoPago();

        System.out.print("Seleccione un metodo de pago: " + "\n" +
        "1 - MercadoPago" + "\n" +
        "2 - PagoFacil" + "\n" +
        "3 - Paypal" + "\n\n" +
        "Su opción: ");

        try {
            int opcion = Integer.parseInt(reader.readLine());
            switch (opcion) {
                case 1:
                   contexto.setEstrategia(new EstrategiaMercadoPago());
                  break;
                case 2:
                  contexto.setEstrategia(new EstrategiaPagoFacil());
                  break;
                case 3:
                  contexto.setEstrategia(new EstrategiaPaypal());
                  break;
                default:
                  contexto.setEstrategia(new EstrategiaMercadoPago());
                }

            contexto.ejecutar();
           } catch (NumberFormatException e) {
            e.printStackTrace();
           } catch (IOException e) {
            e.printStackTrace();
            }
    }

}