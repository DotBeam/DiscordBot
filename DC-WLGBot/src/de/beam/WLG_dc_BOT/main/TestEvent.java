package de.beam.WLG_dc_BOT.main;

import java.util.EventListener;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TestEvent extends ListenerAdapter{
	//RE:U+2705
	//869620851987841094
	@Override
	public void onMessageReactionAdd(MessageReactionAddEvent event) {
		//RE:U+2705
		if(event.getChannel().getId().contains("868936250147610675")) {
			
			if(event.getReactionEmote().getEmoji() == "RE:U+2705") {
				
			}
			
			System.out.print(event.getChannel().getId() +"\n");

			
			
			
		}
		
		System.out.print(event.getGuild().getId() +"\n");
	}
	
	

}
