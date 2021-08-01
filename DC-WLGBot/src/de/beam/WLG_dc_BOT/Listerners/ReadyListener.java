package de.beam.WLG_dc_BOT.Listerners;

import java.awt.List;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter {
	

	  @Override
	    public void onReady(ReadyEvent event) {
		  StringBuilder sb = new StringBuilder();
		  
		  
		 
		  for (Guild g1 : event.getJDA().getGuilds()) {
			  
			 // if(g1.getId() == "868932155567403039") {
				TextChannel txChannel = g1.getTextChannelById("868936250147610675");
				
				System.out.print("Test MSG: "+txChannel.getLatestMessageId()+"\n");
				if (txChannel.hasLatestMessage()){
					txChannel.deleteMessageById(txChannel.getLatestMessageId().toString());
				}
				
				
				  
				  
				  
				  
				  
			  //}
			  //g.getTextChannelById("868936250147610675").sendMessage(new EmbedBuilder().setDescription("TEst").build()).complete();
			 // System.out.print(g.getMemberCount()+ "\n" );
				  
			  
		  }
		  
		  //guild.getTextChannelById("868936250147610675").sendMessage(new EmbedBuilder().setDescription("TEst").build()).complete()
		  //event.getJDA().getGuilds().forEach(guild -> sb.append("|  - \"" + guild.getName() + "\" - {@" + guild.getOwner().getUser().getName() +"#" + guild.getOwner().getUser().getDiscriminator() + "} - [" + guild.getId() + "] \n"));
		  
		  
	  }

}
