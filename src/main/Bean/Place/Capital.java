package main.Bean.Place;

public class Capital extends Place {
    private int startYear;
    private int endYear;

    public Capital(String name) {
        super(name);
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }
}
