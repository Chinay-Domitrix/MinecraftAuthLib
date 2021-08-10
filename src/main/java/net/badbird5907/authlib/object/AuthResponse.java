package net.badbird5907.authlib.object;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.net.URL;
import java.util.UUID;

@RequiredArgsConstructor
@Getter
@Setter
public class AuthResponse {
	private final String accessToken, refreshToken, name, skinURL;
	private final UUID uuid;

	@Override
	public String toString() {
		return "AuthResponse{accessToken=\'" + accessToken + "\', refreshToken=\'" + refreshToken + "\', name='" + name + "\', skinURL=\'" + skinURL + "\', uuid=" + uuid + "}";
	}
}
