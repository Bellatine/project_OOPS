package main.Bean.People;

import main.Bean.Place.Capital;

public class King extends People {
    private String kingName;
    private String startYear;
    private String endYear;
    private Capital capital;
    private String predecessor;
    private String successor;

    public King(String kingName, String startYear, String endYear, Capital capital, String predecessor, String successor, String s) {
        this.kingName = kingName;
        this.startYear = startYear;
        this.endYear = endYear;
        this.capital = capital;
        this.predecessor = predecessor;
        this.successor = successor;
    }

    public String getKingName() {
        return kingName;
    }

    public String getStartYear() {
        return startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public Capital getCapital() {
        return capital;
    }

    public String getPredecessor() {
        return predecessor;
    }

    public String getSuccessor() {
        return successor;
    }
}
