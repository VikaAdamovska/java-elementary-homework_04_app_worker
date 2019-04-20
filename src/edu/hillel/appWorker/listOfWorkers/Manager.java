package edu.hillel.appWorker.listOfWorkers;

public class Manager extends Worker {

    private String project;
    private String experience;

    public Manager(String workerId, String workerName, String workerSurname, String project, String experience) {
        super(workerId, workerName, workerSurname);
        this.project = project;
        this.experience = experience;
    }

    public String getProject() {
        return project;
    }

    public String getExperience() {
        return experience;
    }

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition() + "Manager";
    }

    @Override
    public String toString() {
        return "Manager{" +
                "project='" + project + '\'' +
                ", experience='" + experience + '\'' +
                ", workerPosition='" + workerPosition + '\'' +
                ", workerId='" + workerId + '\'' +
                ", workerName='" + workerName + '\'' +
                ", workerSurname='" + workerSurname + '\'' +
                '}';
    }
}
