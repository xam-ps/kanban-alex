import java.util.Scanner;

public class Board {
    States waiting = new States("Waiting");
    States inProgress = new States("In Progress");
    States done = new States("Done");

    public void printBoard(){

        System.out.println(waiting.getStateName()+":");
        waiting.showTasks();
        System.out.println(inProgress.getStateName()+":");
        inProgress.showTasks();
        System.out.println(done.getStateName()+":");
        done.showTasks();

    }


    public void updateTasks(String inputTask){
        for(int i=0; i<waiting.tasksListe.size(); i++) {
            if(inputTask.equals(waiting.tasksListe.get(i).getTask())){
                waiting.tasksListe.remove(waiting.tasksListe.remove(inputTask));
            } else {
                System.out.println("NO TASK FOUNDtt");
            }
        }
    }


    public void addTasks(){
        waiting.addTask(new Tasks("HALLO"));
        waiting.addTask(new Tasks("SERS"));

        inProgress.addTask(new Tasks("WAS"));
        inProgress.addTask(new Tasks("GEHT"));

        done.addTask(new Tasks("BEI"));
        done.addTask(new Tasks("EUCH"));
    }

    public void checkUpdate(){
        System.out.println("TO UPDATE TASKS PRESS -m- ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        switch (input){
            case "m":
                System.out.println("Please give the name of the task you want to update");
                String inputTask = scanner.next();
                updateTasks(inputTask);
        }
    }
}
