package edu.hillel.appWorker.employmentOfStore;

import edu.hillel.appWorker.listOfWorkers.*;

public class WorkerInfoStore {
    private static final int ARRAY_SIZE = 1;
    private static final int INCREASE_ARRAY_BY = 2;

    private Worker[] managers = new Manager[ARRAY_SIZE];
    private Worker[] programmers = new Programmer[ARRAY_SIZE];
    private Worker[] qaEngineers = new QAEngineer[ARRAY_SIZE];

    private int managersCount;
    private int programmersCount;
    private int qaEngineersCount;

    public static final WorkerInfoStore workerStore = new WorkerInfoStore();

    private WorkerInfoStore() {
    }

    public static WorkerInfoStore getWorkerStore() {
        return workerStore;
    }

    public void add(Manager worker) {
        if (managers.length <= managersCount) {
            managers = extendArrayLength(managers);
        }

        managers[managersCount] = worker;
        managersCount += 1;
    }

    public void add(Programmer worker) {
        if (programmers.length <= programmersCount) {
            programmers = extendArrayLength(programmers);
        }
        programmers[programmersCount] = worker;
        programmersCount += 1;
    }

    public void add(QAEngineer worker) {
        if (qaEngineers.length <= qaEngineersCount) {
            qaEngineers = extendArrayLength(qaEngineers);
        }
        qaEngineers[qaEngineersCount] = worker;
        qaEngineersCount += 1;
    }

    public void add(Worker worker) {
        if (worker == null) {
            return;
        }
        if (worker instanceof Manager) {
            add((Manager) worker);
        } else if (worker instanceof Programmer) {
            add((Programmer) worker);
        } else if (worker instanceof QAEngineer) {
            add((QAEngineer) worker);
        } else {
            System.out.println("It is unknown worker class");
        }
        System.out.println("This worker added successfully: " + worker);
    }

    private Worker[] extendArrayLength(Worker[] initial) {
        Worker[] extendableArray = new Worker[initial.length * INCREASE_ARRAY_BY];
        int firstElementPosition = 0;
        System.arraycopy(initial, firstElementPosition, extendableArray, firstElementPosition, initial.length);
        System.out.println("Source array was extended from " + initial.length + " to " + extendableArray.length);
        return extendableArray;
    }
}
