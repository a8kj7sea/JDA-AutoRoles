package me.sanhak.autoroles.methods;

import javax.security.auth.login.*;

import me.sanhak.autoroles.listeners.*;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.requests.*;

public class Methods { //Start
	
	
	
	public static String Token = "Bot-Token"; // Put your bot token here
	
	public static void Start() throws LoginException { //Start of Start Method
		JDABuilder b = JDABuilder.createDefault(Token);
		b.enableIntents(GatewayIntent.GUILD_MEMBERS);
		b.addEventListeners(new Listeners());
		b.build();
	} //End of Start Method
	
	
} //End
