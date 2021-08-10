package net.badbird5907.authlib;

import net.badbird5907.authlib.handlers.UserPassHandler;
import net.badbird5907.authlib.object.AuthResponse;

public class MinecraftAuthLib {
	public static String CLIENT_ID = "", CLIENT_SECRET = "", REDIRECT_URI = "https://redirect.auth.badbird5907.net"; // redirect isn't used

	public static void setup(String client, String secret) {
		CLIENT_ID = client;
		CLIENT_SECRET = secret;
	}

	public static void main(String[] args) {
		setup("013af036-dc22-47ba-ab1c-6aabec902cea", "3c13d7f6-477c-4eef-8b62-36d363fa2b0e");
		AuthResponse response = UserPassHandler.handle("eeeeeeee@e.com", "eeeeeeee");
		System.out.println(response);
	}
}
