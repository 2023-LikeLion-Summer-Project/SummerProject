package dev.likelion.summer.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
@Getter
@Setter
public class KakaoService {
    public String getAccessToken(String code) throws IOException { // access token을 인가 코드를 카카오에 넘겨 다시 받아오는 역할을 수행
        String reqURL = "https://kauth.kakao.com/oauth/token";
        String access_token = "";
        String refresh_token = "";
        URL url = new URL(reqURL);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        try {
            urlConnection.setDoOutput(true);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");
            sb.append("&client_id=설정 해줘야 함");
            sb.append("&redirect_uri=설정 해줘야 함");
            sb.append("&code=" + code);

            bw.write(sb.toString());
            bw.flush();

            int responseCode = urlConnection.getResponseCode();
            System.out.println("responseCode = " + responseCode);

            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line = "";
            String result = "";
            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println("result = " + result);

            // json parsing
            JsonParser parser = new JsonParser();
            JsonElement elem = parser.parse(result);

            access_token = elem.getAsJsonObject().get("access_token").getAsString();
            refresh_token = elem.getAsJsonObject().get("refresh_token").getAsString();
            System.out.println("refresh_token = " + refresh_token);
            System.out.println("access_token = " + access_token);

            String token = access_token;

            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return access_token;
    }
}
