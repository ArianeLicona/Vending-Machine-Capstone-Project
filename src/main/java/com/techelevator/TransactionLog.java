package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class TransactionLog {
        public static void log(String message) {
            File logFile = new File("logs/transactionlog.txt");
            try (PrintWriter historyLog = new PrintWriter(new FileOutputStream(logFile, true))) {
                historyLog.println(message);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);


            }
        }
    }

//    final File C_S_V = new File("vendingmachine.csv");
//
//    public static void log(String message) {
//        public static void main(String[] args) throws Exception {
//            boolean append = true;
//            FileHandler handler = new FileHandler("Log.txt" , append);
//            Logger logger = Logger.getLogger("com.techelevator");
//            logger.addHandler(handler);
//            logger.info("Purchase history");


//        try {
//            FileHandler handler = new FileHandler("Log.txt", true);
//            SimpleDateFormat logTime = new SimpleDateFormat("MM-DD-YYY HH:MM:SS");
//            Logger log = Logger.getLogger("log.txt");
//            log.addHandler(handler);
//            log.info("Purchase history");
//        } catch (IOException e) {
//            System.err.println("Unable to locate.");
//        }
//    }
//        Logger logger = Logger.getLogger("log.txt");
//        FileHandler handler;
//        SimpleDateFormat logTime = new SimpleDateFormat("MM-DD-YYY HH:MM:SS");
//        try {
//            handler = new FileHandler("log.txt");
//            logger.addHandler(handler);
//            SimpleDateFormat logTime = new SimpleDateFormat("MM-DD-YYY HH:MM:SS");
//            logger.info("Purchase history");

//            FileHandler handler = new FileHandler("log.txt", true);
//            Logger logger = Logger.getLogger("com.techelevator");
//            logger.addHandler(handler);
//            handler.setFormatter();
//                    (message + "\n");
//            pw.close();
//
//            File purchaseLog = new File("Log.txt");
//            SimpleDateFormat logTime = new SimpleDateFormat("MM-DD-YYY HH:MM:SS");
//            double moneyFed = 0;
//            double totalMoney = 0;
//            double leftoverMoney = 0;
//            boolean keepGoing = true;
//
//        try {
//            PrintWriter pw = new PrintWriter(new FileOutputStream("Log.txt", true));
//            pw.write(message + "\n");
//            pw.close();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//        }
//            File purchaseLog = new File("Log.txt");
//           SimpleDateFormat logTime = new SimpleDateFormat("MM-DD-YYY HH:MM:SS");
//            double moneyFed = 0;
//            double totalMoney = 0;
//            double leftoverMoney = 0;
//            boolean keepGoing = true;
//
//        try {
//            PrintWriter pw = new PrintWriter(new FileOutputStream("Log.txt", true));
//            SimpleDateFormat logTime = new SimpleDateFormat("MM-DD-YYY HH:MM:SS");
//            pw.write(message + "\n");
//            pw.close();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//        }
//    }

