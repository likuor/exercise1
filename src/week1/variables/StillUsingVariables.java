package week1.variables;

public class StillUsingVariables {

    String myName;
    int yearOfGraduation;

    StillUsingVariables(String myName, int yearOfGraduation){
        this.myName = myName;
        this.yearOfGraduation = yearOfGraduation;
    }

    public void printNameAndYear(){
        String result = String.format("My name is %s and I'll graduate in %s.", myName, yearOfGraduation);
        System.out.println(result);
    }
}
