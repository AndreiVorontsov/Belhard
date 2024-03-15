package by.belhard.Lesson12.HomeWork.Task_Thread;

import java.util.HashMap;
import java.util.Map;

public class ActionPhilosopher implements Runnable {
    Philosophers philosophers;
    int key;
    boolean flag = false; // если
    int count = 0;
    Forks forksNeighborLeft;
    Forks forksNeighborRight;
    Forks forks;
    Integer[] forkNeighborLeft;
    Integer[] forkNeighborRight;
    Integer forkMyNeighborLeft;
    Integer forkMyNeighborRight;
    Integer[] forkMy;
    Integer forkMyLeft;
    Integer forkMyRight;

    public ActionPhilosopher(Philosophers philosophers, int key) {
        this.philosophers = philosophers;
        this.key = key;
    }

    @Override
    public void run() {
        while (count < 5) {
            synchronized (philosophers) {
                forks = philosophers.getPhilosopher().get(key);
                forkMy = forks.getForks();
                forkMyLeft = forkMy[0];
                forkMyRight = forkMy[1];

                if (key == 1) {
                    forksNeighborLeft = philosophers.getPhilosopher().get(5);

                } else {
                    forksNeighborLeft = philosophers.getPhilosopher().get(key - 1);
                }
                forkNeighborLeft = forksNeighborLeft.getForks();
                forkMyNeighborLeft = forkNeighborLeft[1];

                if (key == 5) {
                    forksNeighborRight = philosophers.getPhilosopher().get(1);

                } else {
                    forksNeighborRight = philosophers.getPhilosopher().get(key + 1);
                }
                forkNeighborRight = forksNeighborRight.getForks();
                forkMyNeighborRight = forkNeighborRight[0];

                if (forkMyLeft == 1) {
                    if (flag) { // освобождаем правый после еды forkMyRight=2
                        forkMyRight = 1;
                        setMyRight(forkMyRight, forkMy, forks);
                        forkMyNeighborRight = 1;
                        setPhilosopherRight(forkMyNeighborRight, forkNeighborRight, forksNeighborRight);
                        flag = false;
                        notify();

                    } else { //берем левую вилку для еды
                       // forkMyLeft = 2;
                        forkMy[0] = 2;
                        //setMyLeft(forkMyLeft, forkMy, forks);
                        forkMyNeighborLeft = 3;
                        setPhilosopherLeft(forkMyNeighborLeft, forkNeighborLeft, forksNeighborLeft);
                    }
                } else if (forkMyLeft == 2) {
                    if (flag) { // освобождаем левый после еды forkMyRight=2
                        forkMyLeft = 1;
                        setMyLeft(forkMyLeft, forkMy, forks);
                        forkMyNeighborLeft = 1;
                        setPhilosopherLeft(forkMyNeighborLeft, forkNeighborLeft, forksNeighborLeft);
                        notify();
                        System.out.println("Филосов " + key + " думает");
                    } else if (forkMyRight == 1) {
                        forkMyRight = 2;
                        setMyRight(forkMyRight, forkMy, forks);
                        forkMyNeighborRight = 3;
                        setPhilosopherRight(forkMyNeighborRight, forkNeighborRight, forksNeighborRight);
                        flag = true;
                        System.out.println("Филосов " + key + " кушает");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (forkMyRight == 3) {
                        while (forkMyRight == 3) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        forkMyRight = 2;
                        setMyRight(forkMyRight, forkMy, forks);
                        forkMyNeighborRight = 3;
                        setPhilosopherRight(forkMyNeighborRight, forkNeighborRight, forksNeighborRight);
                        flag = true;
                        System.out.println("Филосов " + key + " кушает");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (forkMyRight == 1) {
                    if (flag) { // освобождаем левый после еды forkMyRight=2
                        forkMyLeft = 1;
                        setMyLeft(forkMyLeft, forkMy, forks);
                        forkMyNeighborLeft = 1;
                        setPhilosopherLeft(forkMyNeighborLeft, forkNeighborLeft, forksNeighborLeft);
                        flag = false;
                        notify();

                    } else { //берем правую вилку для еды
                        forkMyRight = 2;
                        setMyRight(forkMyRight, forkMy, forks);
                        forkMyNeighborRight = 3;
                        setPhilosopherRight(forkMyNeighborRight, forkNeighborRight, forksNeighborRight);
                    }
                } else if (forkMyRight == 2) {
                    if (flag) { // освобождаем левый после еды forkMyRight=2
                        forkMyRight = 1;
                        setMyRight(forkMyRight, forkMy, forks);
                        forkMyNeighborRight = 1;
                        setPhilosopherRight(forkMyNeighborRight, forkNeighborRight, forksNeighborRight);
                        notify();
                        System.out.println("Филосов " + key + " думает");
                    } else if (forkMyLeft == 1) {
                        forkMyLeft = 2;
                        setMyLeft(forkMyLeft, forkMy, forks);
                        forkMyNeighborLeft = 3;
                        setPhilosopherLeft(forkMyNeighborLeft, forkNeighborLeft, forksNeighborLeft);
                        flag = true;
                        System.out.println("Филосов " + key + " кушает");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (forkMyLeft == 3) {
                        while (forkMyLeft == 3) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        forkMyLeft = 2;
                        setMyLeft(forkMyLeft, forkMy, forks);
                        forkMyNeighborLeft = 3;
                        setPhilosopherLeft(forkMyNeighborLeft, forkNeighborLeft, forksNeighborLeft);
                        flag = true;
                        System.out.println("Филосов " + key + " кушает");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                while (forkMyLeft == 3 && forkMyRight == 3) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                count++;
            }
        }
    }



    public void setMyLeft(Integer forkMyLeft, Integer[] forkMy, Forks forks) {
        Map<Integer, Forks> philosopher = new HashMap<>();
        forkMy[0] = forkMyLeft;
        forks.setForks(forkMy);
        philosopher = philosophers.getPhilosopher();
        philosopher.remove(key);
        philosopher.putIfAbsent(key, forks);
        philosophers.setPhilosopher(philosopher);
    }

    public void setMyRight(Integer forkMyRight, Integer[] forkMy, Forks forks) {
        Map<Integer, Forks> philosopher = new HashMap<>();
        forkMy[1] = forkMyRight;
        forks.setForks(forkMy);
        philosopher = philosophers.getPhilosopher();
        philosopher.put(key, forks);
        philosophers.setPhilosopher(philosopher);
    }

    public void setPhilosopherLeft(Integer forkMyNeighborLeft, Integer[] forkNeighborLeft, Forks forksNeighborLeft) {
        Map<Integer, Forks> philosopherLeft = new HashMap<>();
        forkNeighborLeft[1] = forkMyNeighborLeft;
        forksNeighborLeft.setForks(forkNeighborLeft);
        philosopherLeft = philosophers.getPhilosopher();
        if (key == 1) {
            philosopherLeft.put(5, forksNeighborLeft);
        } else {
            philosopherLeft.put(key - 1, forksNeighborLeft);
        }
        philosophers.setPhilosopher(philosopherLeft);
    }

    public void setPhilosopherRight(Integer forkMyNeighborRight, Integer[] forkNeighborRight, Forks forksNeighborRight) {
        Map<Integer, Forks> philosopherRight = new HashMap<>();
        forkNeighborRight[0] = forkMyNeighborRight;
        forksNeighborRight.setForks(forkNeighborRight);
        philosopherRight = philosophers.getPhilosopher();
        if (key == 5) {
            philosopherRight.put(1, forksNeighborRight);
        } else {
            philosopherRight.put(key + 1, forksNeighborRight);
        }
        philosophers.setPhilosopher(philosopherRight);
    }
}
