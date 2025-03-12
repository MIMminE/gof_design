package gof.designpatterns._01_creational_patterns._04_builder;

public class DetailPlan {

    private int day;

    private String plan;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }

    public int getDay() {
        return day;
    }

    public String getPlan() {
        return plan;
    }
}
