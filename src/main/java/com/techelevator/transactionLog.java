package com.techelevator;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class transactionLog {
    public static void main(String[] args) throws Exception {
        boolean append = true;
        FileHandler handler = new FileHandler("Log.txt" , append);
        Logger logger = Logger.getLogger("com.techelevator");
        logger.addHandler(handler);
        logger.info("Purchase history");
    }
}
