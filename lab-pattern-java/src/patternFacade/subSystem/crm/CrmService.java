package patternFacade.subSystem.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String zipCode, String city, String country){
        System.out.println("Cliente salvo no CRM:");
        System.out.println(name);
        System.out.println(zipCode);
        System.out.println(city);
        System.out.println(country);
    }
}
