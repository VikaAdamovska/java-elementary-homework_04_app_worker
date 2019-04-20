package edu.hillel.appWorker.employmentOfStore;

import edu.hillel.appWorker.listOfWorkers.*;

import java.util.Scanner;

public class WorkerStoreUse {
    public static void main(String[] args) {
        Scanner consoleInputReader = new Scanner(System.in);
        String command = null;
        WorkerStoreUse workerStoreUse = new WorkerStoreUse();

        while (command == null || !command.equals("exit")) {
            command = workerStoreUse.readLineFromConsole(consoleInputReader, "Please enter command (add, view, exit)");
            workerStoreUse.executeCommand(command);
        }
    }

    public void executeCommand(String command) {
        switch (command) {
            case "add":
                Worker newWorker = getNewWorker();
                WorkerInfoStore.getWorkerStore().add(newWorker);
                return;
            case "view":
                System.out.println("This feature is not implemented");
                return;
            case "exit":
                return;
            default:
                System.out.println("Unknown command. Please try again.");
        }
    }

    public Worker getNewWorker() {
        Scanner consoleInputReader = new Scanner(System.in);

        String id = readLineFromConsole(consoleInputReader, "Please enter worker id: ");
        String name = readLineFromConsole(consoleInputReader, "Please enter worker name: ");
        String surname = readLineFromConsole(consoleInputReader, "Please enter worker surname: ");
        String type = readLineFromConsole(consoleInputReader, "Please enter worker type (p, m, q): ");
        return getSpecificWorkerByType(type, new Worker(id, name, surname), consoleInputReader);
    }

    private Worker getSpecificWorkerByType(String type, Worker baseWorker, Scanner concoleInputReader) {
        switch (type) {
            case "p":
                String language = readLineFromConsole(concoleInputReader, "Please enter language");
                String rate = readLineFromConsole(concoleInputReader, "Please enter rate");
                if (language.equals("") || rate.equals("")) {
                    return new Programmer(baseWorker.getWorkerId(), baseWorker.getWorkerName(), baseWorker.getWorkerSurname());
                }
                return new Programmer(baseWorker.getWorkerId(), baseWorker.getWorkerName(), baseWorker.getWorkerSurname(), language, rate);
            case "m":
                String project = readLineFromConsole(concoleInputReader, "Please enter project");
                String experience = readLineFromConsole(concoleInputReader, "Please enter experience");
                return new Manager(baseWorker.getWorkerId(), baseWorker.getWorkerName(), baseWorker.getWorkerSurname(), project, experience);
            case "q":
                return new QAEngineer(baseWorker.getWorkerId(), baseWorker.getWorkerName(), baseWorker.getWorkerSurname(), true);
            default:
                System.out.println("Type " + type + " is unknown. Please try again.");
                return null;
        }
    }

    private String readLineFromConsole(Scanner consoleInputReader, String message) {
        System.out.println(message);
        return consoleInputReader.nextLine();
    }
}
