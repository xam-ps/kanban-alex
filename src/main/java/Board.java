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


    public void addTasks(){
        waiting.addTask(new Tasks("Erstes Statment in Waiting."));
        waiting.addTask(new Tasks("Zweites Statment in Waiting."));

        inProgress.addTask(new Tasks("WAS"));
        inProgress.addTask(new Tasks("GEHT"));

        done.addTask(new Tasks("BEI"));
        done.addTask(new Tasks("EUCH"));
    }

    public void updateTasks(){
        System.out.println("\n" +
                "In which state is your Task?" +
                "\nW = Waiting \n" +
                "I = In Progress \n" +
                "D = Done");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        switch (input){
            case "w":
                System.out.println("Please give the number of the task you want to update.");
                int inputTaskW = scanner.nextInt();
                        inProgress.tasksListe.add(waiting.tasksListe.get(inputTaskW));
                        waiting.tasksListe.remove(inputTaskW);
                        break;
            case "i":
                System.out.println("Please give the number of the task you want to update.");
                int inputTaskI = scanner.nextInt();
                done.tasksListe.add(inProgress.tasksListe.get(inputTaskI));
                inProgress.tasksListe.remove(inputTaskI);
                break;
            case "d":
                System.out.println("Please give the number of the task you want to update.");
                int inputTaskD = scanner.nextInt();
                done.tasksListe.remove(inputTaskD);
                break;
                    }
                }
        }
