package com.threads;

class MyRunnable implements Runnable
{
    public void run()
    {
        go();

        // sleep(2000);
    }

    public void go()
    {
        doMore();
    }

    public void doMore()
    {
        System.out.println("top O ' the stack !");
    }
}

public class ThreadTestDrive
{
    public static void main(String[]args)
    {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();

        // sleep(2000);
        try
        {
            myThread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("back in main");

    }
}