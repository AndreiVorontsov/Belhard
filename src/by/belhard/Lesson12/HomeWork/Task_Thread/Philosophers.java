package by.belhard.Lesson12.HomeWork.Task_Thread;

import java.util.Map;

public class Philosophers {
    /*
    1 - вилка свободна
    2 - вилка у философа
    3 - вилка у соседа
     */

   private Map<Integer,Forks> philosopher;

    public Philosophers(Map<Integer, Forks> philosopher) {
        this.philosopher = philosopher;
    }

    public Map<Integer, Forks> getPhilosopher() {
        return philosopher;
    }

    public void setPhilosopher(Map<Integer, Forks> philosopher) {
        this.philosopher = philosopher;
    }
}
