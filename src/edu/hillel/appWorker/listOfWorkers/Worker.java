package edu.hillel.appWorker.listOfWorkers;

public class Worker {
    protected String workerPosition = "Simple worker";
    protected final String workerId;
    protected final String workerName;
    protected final String workerSurname;

    public Worker(String workerId, String workerName, String workerSurname) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerSurname = workerSurname;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public String getWorkerId() {
        return workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public String getWorkerSurname() {
        return workerSurname;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerPosition='" + workerPosition + '\'' +
                ", workerId='" + workerId + '\'' +
                ", workerName='" + workerName + '\'' +
                ", workerSurname='" + workerSurname + '\'' +
                '}';
    }
}
