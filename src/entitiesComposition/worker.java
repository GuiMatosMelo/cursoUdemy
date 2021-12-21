package entitiesComposition;


import entitiesEnum.workLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class worker {

    private String name;
    private workLevel level;
    private double baseSalary;

    private departament departament;
    private List<hourContract> contractList = new ArrayList<>();

    public worker(){

    }

    public worker(String name, workLevel level, double baseSalary, entitiesComposition.departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public workLevel getLevel() {
        return level;
    }

    public void setLevel(workLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public entitiesComposition.departament getDepartament() {
        return departament;
    }

    public void setDepartament(entitiesComposition.departament departament) {
        this.departament = departament;
    }

    public List<hourContract> getContractList() {
        return contractList;
    } 

    public void addContract(hourContract contract){
        contractList.add(contract);
    }

    public void removeContract(hourContract contract){
        contractList.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;

        Calendar cal = Calendar.getInstance();
        for (hourContract c : contractList) {
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            cal.setTime(c.getDate());
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
