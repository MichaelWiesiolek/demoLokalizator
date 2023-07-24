package pl.wiesiolek.michal.demolokalizator.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController <LocationData>{
    @PostMapping("/uploadLocation")
    public void uploadLocation(@RequestBody LocationData locationData){

        // tu otrzymam dane lokalizacji z urządzenia mobilnego
        //Można je zapisać w bazie danych
        //przekazujemy dane do formularza i korzystamy z sout do wypisania ic w konsoli.

        System.out.println("Otrzymane dane lokalizacji: ");
      //  System.out.println("Szerokość geograficzna: " + locationData.getLatitude());
      //  System.out.println("Długość geograficzna: " + locationData.getLongitude());
    }
}
