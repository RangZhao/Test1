package kujiale;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class T2 {

}
class Task{
    int state;
    private static final int NUM=3;
    public int getState(){
        return this.state;
    }
    public void state_1(){
        if (state<=NUM){
            state=state+1;
        }
    }
    public void run_1(){
        System.out.println("第一步");
        state_1();
    }
}
class Sta_Task{
    static Queue<Task> task_1 =new ArrayDeque<>();
    static Queue<Task> task_2 =new ArrayDeque<>();
    static Queue<Task> task_3 =new ArrayDeque<>();
    static int state_2;
    static int state_3;
    public static void submit(Task task){
        task_1.add(task);
    }
    public static void start(){
        for (Task task : task_1) {
            task.run_1();
            task_2.add(task);
        }
        task_1.clear();
        state_2=task_2.size();

    }
}
