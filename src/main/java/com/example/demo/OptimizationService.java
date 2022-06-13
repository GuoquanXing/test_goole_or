package com.example.demo;

import com.example.demo.custom.CustomLinearProgramming;
import com.example.demo.model.OptimizationResult;
import org.springframework.stereotype.Service;

@Service
public class OptimizationService {

    public OptimizationResult callLinearProgramming(){
        CustomLinearProgramming clp = new CustomLinearProgramming();
        clp.runLinearProgrammingExample("GLOP", true);
        return new OptimizationResult(clp.model, clp.result);
    }
}
