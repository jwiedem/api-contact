package org.example;

import java.net.URI;
import java.net.http.HttpRequest;

public class Main {
    public static void main(String[] args) throws Exception {

        Transcript transcript = new Transcript();
        transcript.setAudio_url();
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", "488c1ae53c7b485aa434d9d63ff36327")
                .POST(HttpRequest.BodyPublishers.ofString(""))
    }
}