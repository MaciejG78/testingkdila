package Labs.ApplicationKnight;/* Przed tobą nietypowe zadanie. Tym razem twoim celem będzie napisanie programu,
który wyświetla informację o wykonaniu określonych zadań (ang. quest) przez pewnego
rycerza (knight). W tym celu w swojej aplikacji stwórz następujące elementy programu:

Interfejs Quest, który będzie zawierał w metodę process().
Dwie klasy zadań - DeadIslandQuest i EliteKnightQuest, kktóre implementują interfejs Quest.
Wykorzystaj polecenie System.out.println().
Stwórz klasę Knight, która w konstruktorze przyjmie różne zadania implementujące interfejs Quest.
W klasie Knight stwórz też dowolną metodę, która wywoła metodę process() interfejsu Quest.
Główny program powinien wyświetlić informację o zakończeniu konkretnego zadania razem z jego nazwą.
*/

class ApplicationKnight {
    public static void main(String[] args) {
        Knight knight1 = new Knight(new DeadIslandQuest());
        knight1.showQuest("Knight 1");
        Knight knight2 = new Knight(new EliteKnightQuest());
        knight2.showQuest("Knight 2");
    }
}

class DeadIslandQuest implements Quest{
    @Override
    public String process() {
        return "I'm DeadIslandQuest";
    }
}

class EliteKnightQuest implements Quest{
    @Override
    public String process() {
        return "I'm EliteKnightQuest";
    }
}

abstract class QuestDuo {
    public void process() {
        System.out.println();
    }


}

interface Quest {
    public String process();
}

class Knight {
    Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    void showQuest(String name) {
        System.out.println(name + ": " + quest.process());
    }
}



