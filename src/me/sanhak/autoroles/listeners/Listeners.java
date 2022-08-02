package me.sanhak.autoroles.listeners;

import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.guild.member.*;
import net.dv8tion.jda.api.hooks.*;

public class Listeners extends ListenerAdapter { //Start
	
    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent e) {	
	//Roles 
	Role member = e.getJDA().getRoleById("Role-ID"); 
	Role bot = e.getJDA().getRoleById("Role-ID");
		
	//Check if the user is a bot or a player
        if (e.getMember().getUser().isBot()) { // Checking if the user is a bot will be given the role of bot
            e.getGuild().addRoleToMember(e.getMember(), bot).queue();      
        } else { // If the member is not a bot, the role of the member will be given
            e.getGuild().addRoleToMember(e.getMember(), member).queue();       
        }
    }
   
	
} //End
