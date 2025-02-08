package _18_memento.ex01;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        GameCaretaker caretaker = new GameCaretaker();

        game.set("Level 1", 100);
        caretaker.add(game.save());

        game.set("Level 2", 200);
        caretaker.add(game.save());

        game.set("Level 3", 300);

        game.restore(caretaker.get(1));
        game.restore(caretaker.get(0));
    }

}
