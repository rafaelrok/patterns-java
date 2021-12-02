package patternFacade;

import patternFacade.subSystem.cep.ApiZipCode;
import patternFacade.subSystem.crm.CrmService;

public class Facade {

    public void migrationClient(String name, String zipCode){
        String city = ApiZipCode.getInstance().returnCity(zipCode);
        String country = ApiZipCode.getInstance().returnCountry(zipCode);

        CrmService.saveClient(name, zipCode, city, country);
    }
}
