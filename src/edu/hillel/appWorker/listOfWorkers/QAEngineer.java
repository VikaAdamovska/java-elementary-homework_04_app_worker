package edu.hillel.appWorker.listOfWorkers;

public class QAEngineer extends Worker {

    private boolean automationQA;

    public QAEngineer(String workerId, String workerName, String workerSurname, boolean automationQA) {
        super(workerId, workerName, workerSurname);
        this.automationQA = automationQA;
    }

    public boolean isAutomationQA(){
        return automationQA;
    }

    @Override
    public String toString() {
        return "QAEngineer{" +
                "automationQA=" + automationQA +
                ", workerPosition='" + workerPosition + '\'' +
                ", workerId='" + workerId + '\'' +
                ", workerName='" + workerName + '\'' +
                ", workerSurname='" + workerSurname + '\'' +
                '}';
    }
}
