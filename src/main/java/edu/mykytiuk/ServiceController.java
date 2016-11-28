package edu.mykytiuk;

import edu.mykytiuk.message.Reading;
import edu.mykytiuk.message.Sensor;
import edu.mykytiuk.message.SensorGroup;
import edu.mykytiuk.message.Unit;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ServiceController {
    private final String apiURL = "https://hiring.easycoremedia.com/exam/backend/api/sensors/";

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @RequestMapping("/")
    public Unit getUnit(){
        RestTemplate temp = new RestTemplate();
        SSLCertificateValidation.disable();
        return temp.getForObject(apiURL, Unit.class);
    }

    @RequestMapping("/temperature")
    public List showTemperature(){
        ArrayList<Reading> tempList = new ArrayList<>();
        Unit unit = getUnit();
        for (SensorGroup sensorGroup : unit.getMeasurements().getSensors()) {
            for (Sensor sensor :sensorGroup.getSensors()) {
                for (Reading reading: sensor.getReadings()) {
                    tempList.add(reading);
                }
            }
        }

        return tempList;
    }
}
