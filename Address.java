public class Address {
    public String cityName;
    public String streetName;
    public String pincode;

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPincode() {
        return pincode;
    }

    public Address(String cityName, String streetName, String pincode) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.pincode = pincode;
    }
}
