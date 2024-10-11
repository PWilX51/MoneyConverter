package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class Conexion {
	Moneda conv=null;
	
	public Conexion(String api_key, String moneda) throws IOException, InterruptedException {
		String conexio="https://v6.exchangerate-api.com/v6/"+api_key+"/latest/"+moneda;
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(conexio)).build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();
		
		Gson gson = new Gson();
		
		this.conv = gson.fromJson(json, Moneda.class);
	}
	
	public double ars_usd(double usd) {
		return usd*Double.parseDouble(conv.conversion_rates.get("USD").toString());
	}
	
	public double usd_ars(double ars) {
		return ars*Double.parseDouble(conv.conversion_rates.get("ARS").toString());
	}
	
	public double dop_usd(double usd) {
		return usd*Double.parseDouble(conv.conversion_rates.get("USD").toString());
	}
	
	public double usd_dop(double dop) {
		return dop*Double.parseDouble(conv.conversion_rates.get("DOP").toString());
	}
	
	public double brl_usd(double usd) {
		return usd*Double.parseDouble(conv.conversion_rates.get("USD").toString());
	}
	
	public double usd_brl(double brl) {
		return brl*Double.parseDouble(conv.conversion_rates.get("BRL").toString());
	}
	
	public double usd_clp(double clp) {
		return clp*Double.parseDouble(conv.conversion_rates.get("CLP").toString());
	}
	
	public double clp_usd(double clp) {
		return clp*Double.parseDouble(conv.conversion_rates.get("USD").toString());
	}
	
	public double usd_cop(double usd) {
		return usd*Double.parseDouble(conv.conversion_rates.get("COP").toString());
	}
	
	public double cop_usd(double usd) {
		return usd*Double.parseDouble(conv.conversion_rates.get("USD").toString());
	}
	
	public double usd_bob(double ars) {
		return ars*Double.parseDouble(conv.conversion_rates.get("BOB").toString());
	}
	
	public double bob_usd(double usd) {
		return usd*Double.parseDouble(conv.conversion_rates.get("USD").toString());
	}
}