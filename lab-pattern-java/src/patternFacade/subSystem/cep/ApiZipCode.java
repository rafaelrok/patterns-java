package patternFacade.subSystem.cep;

public class ApiZipCode {
    private static ApiZipCode instance = new ApiZipCode();

    public ApiZipCode() {
        super();
    }

    public static ApiZipCode getInstance() {
        return instance;
    }

    public String returnCity(String zipCode) {
        return "Araruama";
    }
    public String returnCountry(String zipCode) {
        return "Rio de Janeiro";
    }

}
