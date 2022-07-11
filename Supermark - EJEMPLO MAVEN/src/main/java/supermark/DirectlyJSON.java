package supermark;

//EJEMPLO: CONSULTAS CON JSON

import org.json.JSONObject;
import org.json.JSONException;

public class DirectlyJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");
		System.out.println(jo);
	}

}