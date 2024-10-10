package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class Conexion {
	public Conexion(String api_key) throws IOException, InterruptedException {
		String conexio="https://v6.exchangerate-api.com/v6/"+api_key+"/latest/USD";
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(conexio)).build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();
		
		Gson gson = new Gson();
		
		TiposMonedas conversor = gson.fromJson(json, TiposMonedas.class);
		
		System.out.println(conversor.pesoDominicano.peso);
	}
}