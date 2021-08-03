# MCAuthLib
Note: I haven't fully tested this, this is a fork of [Minecraft_MSAuth](https://github.com/charlie353535/Minecraft_MSAuth/)

Usage:

```java
import net.badbird5907.authlib.MinecraftAuthLib;
import net.badbird5907.authlib.handlers.UserPassHandler;
import net.badbird5907.authlib.object.AuthResponse;

public class MyClass {
    public static void main(String[] args) {
        MinecraftAuthLib.setup("CLIENT_ID", "CLIENT_SECRET");
        AuthResponse response = UserPassHandler.handle("name@email.com","verysecurepassword123");
        String accessToken = response.getAccessToken();
        String refreshToken = response.getRefreshToken();
        String name = response.getName();
        String skinURL = response.getSkinURL();
        UUID uuid = response.getUuid();
    }
} 
```