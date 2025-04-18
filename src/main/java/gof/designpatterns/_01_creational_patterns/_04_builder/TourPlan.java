package gof.designpatterns._01_creational_patterns._04_builder;

import java.time.LocalDate;
import java.util.List;

public class TourPlan {

    private String title;
    private int night;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> plans;

    public TourPlan(String title, int night, int days, LocalDate startDate, String whereToStay, List<DetailPlan> plans) {
        this.title = title;
        this.night = night;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }
    public void addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
    }
}
