package Principal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONObject;

public class Principal {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/831bb3a5db743e30edf1282d/latest/USD";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> monedas = new HashMap<>();
        monedas.put("1", "ARS");
        monedas.put("2", "CLP");
        monedas.put("3", "EUR");
        monedas.put("4", "GBP");
        monedas.put("5", "JPY");
        monedas.put("6", "BRL");
        monedas.put("7", "CAD");
        monedas.put("8", "AUD");
        monedas.put("9", "CNY");
        monedas.put("10", "INR");

        while (true) {
            System.out.println("""
                    ******************************************
                    1) de dolar a pesos argentinos
                    2) de dolar a pesos chilenos
                    3) de dolar a euros
                    4) de dolar a libras esterlinas
                    5) de dolar a yenes japoneses
                    6) de dolar a reales brasileños
                    7) de dolar a dólares canadienses
                    8) de dolar a dólares australianos
                    9) de dolar a yuanes chinos
                    10) de dolar a rupias indias
                    11) Salir
                    ******************************************
                    """);
            String monedaSolicitar = scanner.nextLine();

            if (monedas.containsKey(monedaSolicitar)) {
                System.out.print("Ingrese la cantidad en dólares a cambiar: ");
                double cantidadDolares = Double.parseDouble(scanner.nextLine());

                String codigoMoneda = monedas.get(monedaSolicitar);
                double tasa = obtenerTasaCambio(codigoMoneda);

                if (tasa != -1) {
                    double montoConvertido = cantidadDolares * tasa;
                    System.out.println("Monto convertido: " + montoConvertido + " " + codigoMoneda);
                } else {
                    System.out.println("Error al obtener la tasa de cambio. Intente de nuevo más tarde.");
                }
            } else if (monedaSolicitar.equals("11")) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    private static double obtenerTasaCambio(String moneda) {
        try {
            URI uri = URI.create(API_URL);
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            connection.disconnect();

            JSONObject jsonResponse = new JSONObject(content.toString());
            JSONObject rates = jsonResponse.getJSONObject("conversion_rates");

            return rates.getDouble(moneda);
        } catch (Exception e) {
            System.out.println("hubo algun error");;
            return -1;
        }
    }
}
