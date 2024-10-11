package api;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TiposMonedas {
	@SerializedName("conversion_rates")
	public static List<Moneda> Monedas;
	
	public TiposMonedas(List<Moneda> Monedas) {
		this.Monedas = Monedas;
	}
}
