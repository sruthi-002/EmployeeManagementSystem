package com.example.demo;

import com.example.demo.Model.Desigination;
import com.example.demo.Service.DesiginationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignationControllerTests {
    @Autowired
    private DesiginationService desiginationService;
    @Test
    private Desigination add_designation()
    {
        Desigination desigination =new Desigination(5,5,"Teacher",new Date());
        return desiginationService.add_desigination(desigination);
    }
    @Test
    private List<Desigination> all_designation()
    {
        return desiginationService.display_desigination();
    }

}
