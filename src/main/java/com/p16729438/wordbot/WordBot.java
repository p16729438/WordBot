package com.p16729438.wordbot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class WordBot {
	public static JDA jda;
	
	public static void main(String[] args) {
		try {
			jda = JDABuilder.createDefault(BotConfig.BOT_TOKEN).build();
		}
		catch(LoginException exception) {
			exception.printStackTrace();
		}
	}
}
