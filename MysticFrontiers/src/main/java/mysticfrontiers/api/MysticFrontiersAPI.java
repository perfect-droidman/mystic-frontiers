package main.java.mysticfrontiers.api;


import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class MysticFrontiersAPI {
    
    private final String apiKey;
    private final HttpClient httpClient;
    private final String engine;

    public MysticFrontiersAPI(String apiKey, String engine) {
        this.apiKey = apiKey;
        this.httpClient = HttpClient.newHttpClient();
        this.engine = engine;
    }

    public String generateText(String prompt) throws Exception {
        JSONObject payload = new JSONObject();
        payload.put("prompt", prompt);
        payload.put("max_tokens", 60); // Adjust as necessary for the length of text you want

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openai.com/v1/engines/" + engine + "/completions"))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(payload.toString(), StandardCharsets.UTF_8))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JSONObject jsonResponse = new JSONObject(response.body());
            return jsonResponse.getJSONArray("choices").getJSONObject(0).getString("text").trim();
        } else {
            throw new Exception("API request failed with status code " + response.statusCode() + ": " + response.body());
        }
    }
}
