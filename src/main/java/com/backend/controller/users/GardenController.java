package com.backend.controller.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users/garden")
public class GardenController {
    @GetMapping("/map")
    public String map() {

        return "manager/users/garden_map";
    }

}
