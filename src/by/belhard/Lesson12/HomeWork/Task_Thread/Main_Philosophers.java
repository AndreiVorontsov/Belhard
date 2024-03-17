package by.belhard.Lesson12.HomeWork.Task_Thread;

import java.util.HashMap;
import java.util.Map;

public class Main_Philosophers {
    public static void main(String[] args) {
        Integer[] fork = {1,1};
        Forks forks = new Forks(fork);
        Map<Integer,Forks> philosopher = new HashMap<>();
        philosopher.put(1,forks);
        philosopher.put(2,forks);
        philosopher.put(3,forks);
        philosopher.put(4,forks);
        philosopher.put(5,forks);
        Philosophers philosophers = new Philosophers(philosopher);

        Thread t1 = new Thread(new ActionPhilosopher(philosophers,1), "Philosopher 1");
        t1.start();
       // philosophers = philosophers.getPhilosopher();
        Thread t2 = new Thread(new ActionPhilosopher(philosophers,2), "Philosopher 2");
        t2.start();
        Thread t3 = new Thread(new ActionPhilosopher(philosophers,3), "Philosopher 3");
        t3.start();
        Thread t4 = new Thread(new ActionPhilosopher(philosophers,4), "Philosopher 4");
        t4.start();
        Thread t5 = new Thread(new ActionPhilosopher(philosophers,5), "Philosopher 5");
        t5.start();
    }
}
