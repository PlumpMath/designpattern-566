package jgxms.facade;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:Computer类将CUP类
 * Disk类以及Memory类放在一起，降低了类类之间的耦合度
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finish!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("shutdown computer finish!");
    }
}
