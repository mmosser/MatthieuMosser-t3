/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.GlobalWeather;
import net.webservicex.AirportSoap;
import net.webservicex.GlobalWeatherSoap;



/**
 *
 * @author Matthieu
 */
@WebService(serviceName = "paises")
public class paises {

    /**
     * This is a sample web service operation
     * @param pais
     * @return 
     */
    @WebMethod(operationName = "service")
    public String[] service(@WebParam(name = "pais") String pais) {
        //se crea cliente para servicio GlobalWeather
        GlobalWeather gw = new GlobalWeather();    
        //se obtiene cliente soap
        GlobalWeatherSoap gws = gw.getGlobalWeatherSoap();
        
        String cities = gws.getCitiesByCountry(pais);
        
        Airport a = new Airport();   
        AirportSoap as = a.getAirportSoap();
        
        String airports = as.getAirportInformationByCountry(pais);
        
        String [] result={cities,airports};     
        
        return result;
    }
}