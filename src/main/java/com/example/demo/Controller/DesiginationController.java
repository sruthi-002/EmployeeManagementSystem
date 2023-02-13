package com.example.demo.Controller;

import com.example.demo.Model.Desigination;
import com.example.demo.Service.DesiginationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DesiginationController {
    @Autowired
    private DesiginationService Service;
    @PostMapping("/adddesig")
    private Desigination add_desigination(@RequestBody Desigination d)
    {
        return Service.add_desigination(d);
    }
    @GetMapping("/desiginations")
    private List<Desigination> display_desigination()
    {
        return Service.display_desigination();
    }
}
