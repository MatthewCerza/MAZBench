package com.NineTwoDoubleOSeven;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final double version = 1.0;
        System.out.println("MAZBench -- ver "+version);
        Scanner s = new Scanner(System.in);
        System.out.println("1 to perform a benchmark test");
        System.out.println("2 to have Jerry torture your system");
        System.out.println("3 to list known system specs");
        System.out.println();
        int decision = s.nextInt();
        if (decision == 2){
            System.out.println("Type 'ok' to begin Single threaded torture test.");
            System.out.println("I mean it'll use some of your other threads but java is lazy so mostly one thread.");
            System.out.println("and in all honesty java isnt allowed to use more than a certain amount of your cpu");
            System.out.println("either that or i'm just bad at writing tests");
            System.out.println();
            if (s.next().equals("ok")){
                while (1==1){
                    double chaos = Math.random()*763/Math.PI*Math.random(); //getting some number crunching in there to deal some damage.
                    System.out.println("Chaos, chaos! "+chaos);
                }
            }
        }else if (decision == 1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println();
            System.out.println("ver "+version);
            System.out.println("This benchmark will give your computer a score on how quickly it is able to crunch various equations");
            System.out.println("A higher score is better.");
            System.out.println();
            System.out.println("NOTE that this benchmark may under-represent your system if your java client limits CPU or RAM usage.");
            System.out.println("Keep in mind that this benchmark makes use of Math.random, and therefore scores may vary slightly between each run.");
            System.out.println();
            System.out.println("Type 'ok' to begin the benchmark.");
            if (s.next().equals("ok")) {
                final long start = System.currentTimeMillis();
                final int difficulty = 2000000;
                for (int i = 0; i < difficulty; i++) {
                    double chaos = Math.random() * 763 / Math.PI * Math.random(); //getting some number crunching in there to deal some damage.
                    System.out.println("Benchmarking Number Crunch... " + chaos);
                }
                for (int i = 0; i < difficulty; i++) {
                    double chaosChaos = Math.random() * 763 / Math.PI * Math.random();
                    chaosChaos *= Math.E;
                    System.out.println("Benchmarking Number Crunch Test 2... " + chaosChaos);
                }
                System.out.println();
                final long end = System.currentTimeMillis();
                final double diff = end - start;
                System.out.println("Your Score is " + (30000 - diff) + ".");
                System.out.println();
                System.out.println("Would you like your results saved? (yes/no)");
                System.out.println("If there is an existing benchmark file it will be overwritten.");
                String saveYN = s.next();
                if (saveYN.equals("yes")||saveYN.equals("y")){
                    try {
                        File results = new File ("MAZBenchResults.txt");
                        if (results.createNewFile()) {
                            System.out.println("File created: " + results.getName());
                        } else {
                            System.out.println("File already exists. Overwriting previous results.");
                        }
                        FileWriter writer = new FileWriter("MAZBenchResults.txt");
                        writer.write("Operating System: " + System.getProperty("os.name"));
                        writer.write(System.lineSeparator());
                        writer.write("Java Version: " + System.getProperty("java.version"));
                        writer.write(System.lineSeparator());
                        writer.write("Available processors (threads): " + Runtime.getRuntime().availableProcessors());
                        writer.write(System.lineSeparator());
                        writer.write("Free memory (GB): " + Runtime.getRuntime().freeMemory() / 1000000000.0);
                        writer.write(System.lineSeparator());
                        writer.write("Total memory available to Java (GB): " + Runtime.getRuntime().totalMemory() / 1000000000.0);
                        writer.write(System.lineSeparator());
                        writer.write(System.lineSeparator());
                        writer.write("Your Score is " + (30000 - diff) + ".");
                        writer.write(System.lineSeparator());
                        writer.write(System.lineSeparator());
                        writer.write(System.lineSeparator());
                        writer.close();

                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
            }
        } else if (decision == 3) {
            System.out.println("Operating System: " + System.getProperty("os.name"));
            System.out.println("Java Version: " + System.getProperty("java.version"));
            System.out.println("Available processors (threads): " +
                    Runtime.getRuntime().availableProcessors());
            System.out.println("Free memory (GB): " +
                    Runtime.getRuntime().freeMemory() / 1000000000.0);
            System.out.println("Total memory available to Java (GB): " +
                    Runtime.getRuntime().totalMemory() / 1000000000.0);
        } else {
            System.out.println("Stop looking for secrets.");
            System.exit(666);
        }


    }
}

