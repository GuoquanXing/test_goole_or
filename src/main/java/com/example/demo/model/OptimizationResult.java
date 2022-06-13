package com.example.demo.model;

public class OptimizationResult {
    private String model;
    private String result;

    public OptimizationResult(String model, String result) {
        this.model = model;
        this.result = result;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
