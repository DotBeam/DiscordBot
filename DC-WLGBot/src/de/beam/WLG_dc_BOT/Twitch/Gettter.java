package de.beam.WLG_dc_BOT.Twitch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

import de.beam.WLG_dc_BOT.utils.Token;



public class Gettter {
	
	public static String getUserID(String Name) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		URL url = new URL("https://api.twitch.tv/kraken/users?login="+Name);
		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
		con.setDoOutput(true);
		con.setDoInput(true);
		con.setRequestMethod("GET");
		con.setRequestProperty("Accept", "application/vnd.twitchtv.v5+json");
		con.setRequestProperty("Client-ID", Token.TwitchClientid);
		
		InputStream is = con.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);


        String[] b = br.readLine().split(",");
    	for(int i =0;i < b.length;i++) {
			 a.add(b[i]);
			 
		}
        return a.get(2).substring(7, 16);
	}

}
