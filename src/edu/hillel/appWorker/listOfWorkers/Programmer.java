package edu.hillel.appWorker.listOfWorkers;

public class Programmer extends Worker {

    public static final String DEFAULT_PROGRAMMER_LANGUAGE = "Java";
    public static final String DEFAULT_PROGRAMMER_RATE = "Junior";
    private String language;
    private String rate;

   public Programmer(String workerId, String workerName, String workerSurname) {
        this(workerId, workerName, workerSurname, DEFAULT_PROGRAMMER_LANGUAGE, DEFAULT_PROGRAMMER_RATE);
    }

    public Programmer(String workerId, String workerName, String workerSurname, String language, String rate) {
        super(workerId, workerName, workerSurname);
        this.language = language;
        this.rate = rate;
    }

    public String getLanguage() {
        return language;
    }

    public String getRate() {
        return rate;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition();
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "language='" + language + '\'' +
                ", rate='" + rate + '\'' +
                ", workerPosition='" + workerPosition + '\'' +
                ", workerId='" + workerId + '\'' +
                ", workerName='" + workerName + '\'' +
                ", workerSurname='" + workerSurname + '\'' +
                '}';
    }
}


