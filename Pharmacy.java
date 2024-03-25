
public class Pharmacy{
    private final String name;
    private final Drug[] drugs;
    private final String[][] employees;
    private int dr_count=0,em_count=0;

    public Pharmacy(String name,int drug_num, int employee_num){
        this.name=name;
        drugs = new Drug[drug_num];
        employees = new String[employee_num][3];
    }

    public void add_drug(Drug dr){
        drugs[dr_count]=dr;
        dr_count++;
    }

    public void add_employee(String first_name, String last_name, String age){
        String[] E=new String[3];
        E[0]=first_name;
        E[1]=last_name;
        E[2]=age;
        employees[em_count]=E;
        em_count++;
    }

    public int total_value(){
        int sum=0;
        for(int k=0;k<dr_count;k++){
            sum+=(drugs[k].price)*(drugs[k].amount);
        }
        return sum;
    }
    public void employees_summary(){
        System.out.println("Employees:");
        for(int i=0;i<em_count;i++){
            System.out.format("The employee number %d is %s %s who is %s years old.\n", i+1, employees[i][0],
                    employees[i][1],employees[i][2]);
        }
    }
    public static void main(String[] args) {
        Pharmacy my_ph= new Pharmacy("Dr.Mohsen",5,3);
        Drug dr1=new Drug("Acetaminophen325(20tablets)",25800,1000);
        Drug dr2=new Drug("Diphenhydramine(60ml)",19620,200);
        Drug dr3=new Drug("Antihistamines(100tablets)",60000,200);
        Drug dr4=new Drug("Expectorant(140ml)",42080,150);
        Drug dr5=new Drug("AdultCold(20tablets)",33920,900);
        String dr_name=dr1.Name;
        my_ph.add_drug(dr1);
        my_ph.add_drug(dr2);
        my_ph.add_drug(dr3);
        my_ph.add_drug(dr4);
        my_ph.add_drug(dr5);
        my_ph.add_employee("Ali","Najib","20");
        my_ph.add_employee("Sara","Sae","19");
        my_ph.add_employee("Alireza","Hosseini","24");
        System.out.println(my_ph.name);
        System.out.println(dr_name);
        System.out.println(my_ph.total_value());
        my_ph.employees_summary();
    }
}

