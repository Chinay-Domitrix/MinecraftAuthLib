package net.badbird5907.authlib.handlers;

import lombok.SneakyThrows;
import net.badbird5907.authlib.object.AuthResponse;
import net.badbird5907.authlib.requestors.*;
import org.json.JSONObject;

import java.util.UUID;

public class UserPassHandler {
    @SneakyThrows
    public static AuthResponse handle(String username, String password){
        try {
            String code = UserAuthRequestor.getTokenFor(username,password);

            System.out.println("> Requesting TOKEN");
            MSTokenRequestor.TokenPair authToken = MSTokenRequestor.getForUserPass(code);

            System.out.println("> Authenticating with XBL");
            XBLTokenRequestor.XBLToken xblToken = XBLTokenRequestor.getForUserPass(authToken.token);

            System.out.println("> Authenticating with XSTS");
            XSTSTokenRequestor.XSTSToken xstsToken = XSTSTokenRequestor.getFor(xblToken.token);

            System.out.println("> Authenticating with Minecraft");
            MinecraftTokenRequestor.MinecraftToken minecraftToken = MinecraftTokenRequestor.getFor(xstsToken);

            System.out.println("> Checking ownership and getting profile");
            MinecraftTokenRequestor.checkAccount(minecraftToken);
            MinecraftTokenRequestor.MinecraftProfile minecraftProfile = MinecraftTokenRequestor.getProfile(minecraftToken);

            return new AuthResponse(minecraftToken.accessToken,authToken.refreshToken,minecraftProfile.name,minecraftProfile.skinURL, UUID.fromString(minecraftProfile.uuid));
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return null;
        }
    }
}
