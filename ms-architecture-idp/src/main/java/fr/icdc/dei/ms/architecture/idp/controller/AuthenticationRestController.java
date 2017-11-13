package fr.icdc.dei.ms.architecture.idp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationRestController {

	@GetMapping(value = {"/info", "/"})
    public String getInfo()
    {
        return "Identity Provider";
    }
}
