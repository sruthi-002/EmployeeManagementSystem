package com.example.demo.Controller;

import com.example.demo.Model.Desigination;
import com.example.demo.Service.DesiginationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/designations")
public class DesiginationController {
    @Autowired
    private DesiginationService Service;
    @PostMapping("")
    private Desigination add_desigination(@RequestBody Desigination d)
    {
        return Service.add_desigination(d);
    }

    @GetMapping("/{id}")
    private Desigination getdesigination(@PathVariable ("id") long id)
    {
        return Service.getdesignation(id);
    }
    @GetMapping("")
    private List<Desigination> display_desigination()
    {
        return Service.display_desigination();
    }
}