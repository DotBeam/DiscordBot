package de.beam.WLG_dc_BOT.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.EventListener;
import java.util.List;

import javax.security.auth.login.LoginException;

import org.apache.commons.collections4.bag.TreeBag;

import ch.qos.logback.core.read.ListAppender;
import de.beam.WLG_dc_BOT.Listerners.ReadyListener;
import de.beam.WLG_dc_BOT.Twitch.Gettter;
import de.beam.WLG_dc_BOT.Twitch.IsOnline;
import de.beam.WLG_dc_BOT.utils.Token;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.MessageReaction.ReactionEmote;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class main {

	public static void main(String[] args) throws LoginException {
		
	
		JDA jda = JDABuilder.createDefault(Token.TOKEN_STRING).build();
		
	
		 jda.addEventListener(new TestEvent());
		 jda.addEventListener(new ReadyListener());
		
		 
		 
		
		 
		 
		 
		 //jda.getTextChannelById("868936250147610675").sendMessage("test");
		 
		 
		 
		 //jda.getGuildById("868932155567403039").getChannels()
		 //.getTextChannelById("868936250147610675").sendMessage("test").queue();
		 
		 //jda.getTextChannelById(Long.parseLong("868936250147610675")).sendMessage("TEst");
	
		 //jda.getTextChannelById(2).sendMessageEmbeds(embed, other);
		//System.out.print(Gettter.getUserID("bd_beam"));
	
		
		
		
		//IsOnline.check_online("derGSP");
		//new IsOnline().start();
		
		
		 }
	

}
