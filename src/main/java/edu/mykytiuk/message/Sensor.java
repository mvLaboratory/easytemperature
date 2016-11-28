package edu.mykytiuk.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sensor {
    private String id;
    private String type;
    private String unit;
    private String outdoors;
    private String balcony;
    private Reading[] readings;

    public Sensor() {
    }

    public Sensor(String id, String type, String unit, String outdoors, String balcony, Reading[] readings) {
        this.id = id;
        this.type = type;
        this.unit = unit;
        this.outdoors = outdoors;
        this.balcony = balcony;
        this.readings = readings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOutdoors() {
        return outdoors;
    }

    public void setOutdoors(String outdoors) {
        this.outdoors = outdoors;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    public Reading[] getReadings() {
        if (readings == null) {
            Reading[] temp = new Reading[0];
            return temp;
        }
        return readings;
    }

    public void setReadings(Reading[] readings) {
        this.readings = readings;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", unit='" + unit + '\'' +
                ", outdoors='" + outdoors + '\'' +
                ", balcony='" + balcony + '\'' +
                ", readings=" + Arrays.toString(readings) +
                '}';
    }
}
