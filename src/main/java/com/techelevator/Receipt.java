package com.techelevator;
import java.util.Map;


public interface Receipt {

    double getReceipt(Map<String, Double> servicesRendered);

}