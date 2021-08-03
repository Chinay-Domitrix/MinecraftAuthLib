package net.badbird5907.authlib;

public class MinecraftAuthLib {
    public static String CLIENT_ID = "",CLIENT_SECRET = "",REDIRECT_URI = "https://redirect.auth.badbird5907.net"; //redirect isn't used
    public static void setup(String client,String secret){
        CLIENT_ID = client;
        CLIENT_SECRET = secret;
    }

}