import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Monedas consultarMoneda(String monedaBase, String monedaTarjet){
        URI direccion=URI.create("https://v6.exchangerate-api.com/v6/57989fef7194d4a74f773886/pair/" +
                monedaBase+
                "/" +
                monedaTarjet);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response  = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No se Logro encontrar la conversion de moneda");
        }
    }

}
