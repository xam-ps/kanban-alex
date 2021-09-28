import java.util.Scanner;

public class Board {
    State waiting = new State("Waiting");
    State inProgress = new State("In Progress");
    State done = new State("Done");
    Scanner scanner = new Scanner(System.in);


    public void mainMenu() {
        while (true) {
            System.out.println(
                    "\nWelcome to your personal kanban-board" +
                            "\nTo look at your board, press k \n" +
                            "To add a new task, press t\n" +
                            "If you want to update a task, press u\n" +
                            "If you are done, press e");
            String function = scanner.next();
            switch (function) {
                case "k":
                    printBoard();
                    break;
                case "t":
                    System.out.print("Insert a task: ");
                    String insertTask = scanner.next();
                    addTasks(insertTask);
                    break;
                case "u":
                    updateTasks();
                    break;
                case "e":
                    System.out.println("Have a good day!");
                    return;
                default:
                    System.out.println("Invalid input, please check it.");
                    break;
            }
        }
    }

    public void printBoard() {
        System.out.println(waiting.getStateName() + ":");
        waiting.showTasks();
        System.out.println(inProgress.getStateName() + ":");
        inProgress.showTasks();
        System.out.println(done.getStateName() + ":");
        done.showTasks();
    }

    public void addTasks(String insertTask) {
        waiting.addTask(new Task(insertTask));
    }

    private void updateTasks() {
        System.out.println("\n" +
                "In which state is the task you want to update?" +
                "\nw = Waiting \n" +
                "i = In Progress \n" +
                "d = Done");
        String input = scanner.next();
        switch (input) {
            case "w":
                System.out.print("Please give the number of the task you want to update: ");
                int inputTaskW = scanner.nextInt();
                inProgress.taskList.add(waiting.taskList.get(inputTaskW));
                waiting.taskList.remove(inputTaskW);
                break;
            case "i":
                System.out.print("Please give the number of the task you want to update: ");
                int inputTaskI = scanner.nextInt();
                done.taskList.add(inProgress.taskList.get(inputTaskI));
                inProgress.taskList.remove(inputTaskI);
                break;
            case "d":
                System.out.print("Please give the number of the task you want to update: ");
                int inputTaskD = scanner.nextInt();
                done.taskList.remove(inputTaskD);
                break;
            default:
                System.out.println("You insert an invalid input.");
                break;
        }
    }
}