class Phone {

    String ownerName;
    String countryCode;
    String cityCode;
    String number;

    public Phone(String ownerName, String number){
        this.ownerName = ownerName;
        this.number = number;
    }

    public Phone(String ownerName, String countryCode, String cityCode, String number){
        this.ownerName = ownerName;
        this.cityCode = countryCode;
        this.cityCode = cityCode;
        this.number = number;
    }
}