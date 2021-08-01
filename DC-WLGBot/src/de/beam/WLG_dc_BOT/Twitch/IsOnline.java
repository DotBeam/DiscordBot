package de.beam.WLG_dc_BOT.Twitch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;
import de.beam.WLG_dc_BOT.utils.Token;


public class IsOnline extends Thread{

	
	@Override
	public void run() {
	
			try {
				check_online("bd_beam");
				sleep(300000);
				
			} catch (InterruptedException e) {
				System.out.print("IsOnline konnte nicht ausgefürtwerden");
				e.printStackTrace();
			}
		
	}
	public static void check_online(String Name) {
		HttpsURLConnection con = null;
		try {
			URL url = new URL("https://api.twitch.tv/kraken/channels/"+Gettter.getUserID(Name));
		    con = (HttpsURLConnection) url.openConnection();
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestMethod("GET");
			
			con.setRequestProperty("Accept", "application/vnd.twitchtv.v5+json");
			con.setRequestProperty("Client-ID", Token.TwitchClientid);
			
			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
	        BufferedReader br = new BufferedReader(isr);
	       

	        String inputLine;

	        while ((inputLine = br.readLine()) != null) {
	        	System.out.print(inputLine);
	        }
	        
	        
			
				
			
		} catch (IOException e) {
			 return;
		
		}

        
     
	}
	
}
