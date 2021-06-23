package fs.apidef.identifyservice.java.BT_test;

public class Teacher extends Class {
    public static final String FullTime = "fullTime";
    public static final String CTV = "CTV";
    public static final String ThinhGiang = "thinhGiang";
    public Teacher() {
        super();
    }

    @Override
    public String toString() {
        return "Teacher{" + FullTime + " - " + CTV + " - " + ThinhGiang +
                '}';
    }
}
