public class Main {

    public static void main(String[] args) {
        Board kanban = new Board();
        kanban.addTasks();
        kanban.printBoard();
        kanban.checkUpdate();
        kanban.printBoard();
    }
}
