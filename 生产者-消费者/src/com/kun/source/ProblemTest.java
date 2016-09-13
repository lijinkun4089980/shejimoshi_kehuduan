package com.kun.source;


/**
 * 提供了生产者消费者问题的源代码
 * Created by 阿坤 on 2016/7/27.
 */
public class ProblemTest {
    public static void main(String[] args) {
        BreadStack bs = new BreadStack();    //得到一个面包框的对象
        Producer p = new Producer(bs);       //得到一个生产者对象
        Consumer c = new Consumer(bs);       //得到一个消费者对象
        //有几个生产者线程就对应几个消费者线程
        new Thread(p).start();
        new Thread(p).start();
        new Thread(c).start();
        new Thread(c).start();
    }
}

/*
 * 定义面包的类，给每个面包一个编号
 */
class Bread {
    private int id;
    Bread(int id) {
        this.id = id;
    }
    public String toString() {
        return "bread: " + id;
    }
}

/*
 * 定义面包框的类
 */
class BreadStack {
    private int index = 0;
    private Bread[] breads = new Bread[6];

    public Bread[] getBreads() {
        return breads;
    }

    public void setBreads(Bread[] breads) {
        this.breads = breads;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public synchronized void push(Bread b) {
        while (index == breads.length) {
            try {
                //在等待之前先唤醒在此对象监视器上等待的所有线程
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        breads[index] = b;
        index++;
    }

    public synchronized Bread pop() {
        while (index == 0) {
            try {
                //在等待之前先唤醒在此对象监视器上等待的所有线程
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        index--;
        return breads[index];
    }
}

/*
 * 定义生产者的类
 */
class Producer implements Runnable {
    private BreadStack bs = null;

    Producer(BreadStack bs) {
        this.bs = bs;
    }

    public void run() {
        //一个生产者最多只能生产20个馒头
        for (int i = 0; i < 20; i++) {
            Bread bread = new Bread(i);
            bs.push(bread);
            System.out.println("生产了" + bread);
            //生产一个馒头之后休息1s钟的时间
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 * 定义消费者的类
 */
class Consumer implements Runnable {
    private BreadStack bs = null;

    Consumer(BreadStack bs) {
        this.bs = bs;
    }

    public void run() {
        //一个生产者最多只能消费20个馒头
        for (int i = 0; i < 20; i++) {
            Bread bread = bs.pop();
            System.out.println("消费了" + bread);
            //消费一个馒头之后休息1s钟的时间
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
