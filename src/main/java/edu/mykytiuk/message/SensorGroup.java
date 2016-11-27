package edu.mykytiuk.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SensorGroup {
    private Long id;
    private String type;
    private Sensor[] sensors;

    public SensorGroup() {
    }

    public SensorGroup(Long id, String type, Sensor[] sensors) {
        this.id = id;
        this.type = type;
        this.sensors = sensors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sensor[] getSensors() {
        return sensors;
    }

    public void setSensors(Sensor[] sensors) {
        this.sensors = sensors;
    }

    @Override
    public String toString() {
        return "SensorGroup{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", sensors=" + Arrays.toString(sensors) +
                '}';
    }
}
