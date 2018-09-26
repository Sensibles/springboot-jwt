package pl.artur.microservice.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @RequestMapping(value="/helloThere", method = RequestMethod.GET)
    @ResponseBody
    public String generalKenobiApi(){
        return "General Kenobi";
    }
}
