package com.mzielinski.scjp.concurrency;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Maciej Zielinski, Rule Financial
 */
class Widget {
}

class WidgetMaker extends Thread {

    final List<Widget> finishedWidgets = new LinkedList<Widget>();

    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                Widget w = new Widget();
                synchronized (finishedWidgets) {
                    finishedWidgets.add(w);
                    finishedWidgets.notify();
                }
            }
        } catch (InterruptedException ignored) {}
    }

    public Widget waitForWidget() {
        synchronized (finishedWidgets) {
            if (finishedWidgets.size() == 0) {
                try {
                    finishedWidgets.wait();
                } catch (InterruptedException ignored) {}
            }
            return finishedWidgets.remove(0);
        }
    }
}

public class WidgetUser extends Thread {

    private WidgetMaker maker;

    public WidgetUser(String name, WidgetMaker maker) {
        super(name);
        this.maker = maker;
    }

    public void run() {
        Widget w = maker.waitForWidget();
        System.out.println(getName() + " got a widget");
    }

    public static void main(String... args) {
        WidgetMaker maker = new WidgetMaker();
        maker.start();
        new WidgetUser("Lenny", maker).start();
        new WidgetUser("Moe", maker).start();
        new WidgetUser("Curly", maker).start();
    }

}