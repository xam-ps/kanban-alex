import java.util.ArrayList;

public class States {
    private String stateName;
    ArrayList<Tasks> tasksListe = new ArrayList<Tasks>();

    public void addTask(Tasks task){
        tasksListe.add(task);
    }


    States(String stateName){
        this.stateName = stateName;
    }

    public String getStateName(){
        return this.stateName;
    }


    public void showTasks(){
        for(int i=0; i<tasksListe.size(); i++) {
            System.out.println("=> " + tasksListe.get(i).getTask());
        }
    }


}
