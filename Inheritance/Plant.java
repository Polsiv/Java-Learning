public class Plant extends Teacher {
    private int classhours, investigationhours, adminhours;

    public Plant(String name, String lastName, String id, String docType, int class_hours, int inv_hours, int admin_hours){
        super(name, lastName, id, docType);

        this.classhours = class_hours;
        this. investigationhours = inv_hours;
        this.adminhours = admin_hours;
    }

    //getters
    
    public int getClasshours() {
        return classhours;
    }

    public int getInvestigationhours() {
        return investigationhours;
    }

    public int getAdminhours() {
        return adminhours;
    }

    //setters

    public void setClasshours(int classhours) {
        this.classhours = classhours;
    }

    public void setInvestigationhours(int investigationhours) {
        this.investigationhours = investigationhours;
    }

    public void setAdminhours(int adminhours) {
        this.adminhours = adminhours;
    }

    @Override
    public String toString() {
        return "Plant teacher" + super.toString() + "Classhours=" + classhours + ", investigationhours=" + investigationhours + ", adminhours=" + adminhours;
    }

    

    
}
