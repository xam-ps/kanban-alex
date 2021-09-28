import java.util.ArrayList;

public class State {
    private String stateName;
    ArrayList<Task> taskList = new ArrayList<Task>();

    State(String stateName) {
        this.stateName = stateName;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public String getStateName() {
        return this.stateName;
    }

    public void showTasks() {
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(i + " => " + taskList.get(i).getTask());
        }
    }
}
