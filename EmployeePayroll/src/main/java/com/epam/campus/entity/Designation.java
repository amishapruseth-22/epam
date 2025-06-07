package com.epam.campus.entity;

public class Designation {
    private String designation;
    private double baseSalary;
    private String level;

    public Designation(String designation,String level) {
        this.designation = designation;
        this.level=level;
        this.baseSalary=assignSalary(designation,level);
    }

   public double assignSalary(String designation,String level){
        if (designation.equals("Developer")){
            switch (level){
                case "junior":return 30000;
                case "senior":return 60000;
            }
        } else if (designation.equals("HR")) {
            switch (level){
                case "junior":return 40000;
                case "senior":return 70000;
            }

        }
       return 0;
   }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getLevel() {
        return level;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Designation{" +
                " designation='" + designation + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
