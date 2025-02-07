package ru.mirea.worksix.task10;

public class Shop implements Enter {
    private int space = 10;
    private Computer[] computer = new Computer[space];
    private int amount;

    Shop(int amount) {
        if (amount > 10) {
            this.amount = 10;
        }
        this.amount = amount;

        for (int i = 0; i < amount; i++) {
            computer[i].getExistence();
        }
    }

    Shop() {
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addComputer(int a) {
        if ((this.amount + a) > 10) {
            this.amount = 10;
        }
        this.amount += a;
    }

    public void delComputer(int a) {
        if ((this.amount - a) < 0) {
            this.amount = 0;
        }
        this.amount -= a;
    }

    public void findComputer(int a) {
        if (a < 0 || a > 10) {
            System.out.println("Error");
        } else if (!computer[a].getExistence()) {
            System.out.println("Компьютера " + a + " нет в наличии");
        }
        System.out.println("Компьютер " + a + " есть на складе");
    }

    public String toString() {
        return "{" + "В магазине: " + amount + " компьютеров}";
    }
}
