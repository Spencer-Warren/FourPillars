package org.fourpillars;

public class Boss extends Person {
    private String bossId;

    public Boss(String name, int age, String bossId) {
        super(name, age);
        this.bossId = bossId;
    }

    @Override
    public void displayJob() {
        System.out.print("Job: Boss");
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "bossId='" + bossId + '\'' +
                "} " + super.toString();
    }
}
