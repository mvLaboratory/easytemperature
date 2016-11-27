package edu.mykytiuk;

import edu.mykytiuk.message.Unit;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {
    private final String apiURL = "https://hiring.easycoremedia.com/exam/backend/api/sensors/";

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @RequestMapping("/")
    public Unit showUnit(){
        RestTemplate temp = new RestTemplate();
        return temp.getForObject(apiURL, Unit.class);
    }
}
