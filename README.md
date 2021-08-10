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
		AuthResponse response = UserPassHandler.handle("name@email.com", "verysecurepassword123");
		String accessToken = response.getAccessToken();
		String refreshToken = response.getRefreshToken();
		String name = response.getName();
		String skinURL = response.getSkinURL();
		UUID uuid = response.getUuid();
	}
} 
```
Note: `UserPassHandler.handle` will return null if something goes wrong in the authentication process
## Azure (REQUIRED)
You'll need an Azure account to do this step. </br>
1. Go to [Azure App Registrations](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/RegisteredApps)
2. Click "New Registration" ![image](https://user-images.githubusercontent.com/50347938/128092602-76c4dfbb-362d-4cf3-ba6d-80e0c66f67ad.png)
3. Set the name and set the supported account type to personal only. ![image](https://user-images.githubusercontent.com/50347938/128092694-e7ea4a93-59b8-4061-bd63-a651e3948219.png)
4. Click register and you should see something like this. This is your CLIENT_ID ![image](https://user-images.githubusercontent.com/50347938/128092811-27ac20f1-562c-4498-9add-daf424a6af62.png)
5. Click client credentials ![image](https://user-images.githubusercontent.com/50347938/128092832-74b5be63-6ded-4c76-b4a9-86367a41780a.png)
6. Click new client secret ![image](https://user-images.githubusercontent.com/50347938/128092885-119c70e2-31e3-4e0e-995c-9d0050c147e8.png)
7. Then enter the description and set the expiry to 24 months. ![image](https://user-images.githubusercontent.com/50347938/128093378-efb0b1e6-ca96-4645-b2f6-001d732694ac.png)
8. Then, the "Secret ID" is your CLIENT_SECRET. ![image](https://user-images.githubusercontent.com/50347938/128093474-54753299-c203-4618-a8ab-b2d8df3b3b5a.png)
(see above examples on how to use the CLIENT_ID and CLIENT_SECRET)
