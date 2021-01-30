package com.company;

public class Guitar {

    private String color;
    private int stringCount = 6;
    private int[] tensions = new int[stringCount];

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
        this.tensions = new int[stringCount];
    }

    public int[] getTensions() {
        return tensions;
    }

    public void tune()
    {
        System.out.println("Начальное натяжение струн: ");
        for(int i = 0; i < tensions.length; i++)
        {
            tensions[i]=5;
            System.out.print(" "+tensions[i]);
        }
        System.out.println("\n");
    }

    private void unsettle()
    {
        System.out.println("Ваша гитара растроена, натяжение струн должно быть - 5");
        System.out.println("Конечное натяжение струн: ");
        for(int i = 0; i < tensions.length; i++)
        {
            tensions[i] = (int) ((Math.random() * (3 - 0)) + 0);
            System.out.print(" "+tensions[i]);
        }
        System.out.println("\n");
    }

    public void play()
    {
        System.out.println("Вот на ветке лист кленовый,\n" +
                "Нынче он совсем как новый!\n" +
                "Весь румяный, золотой.\n" +
                "Ты куда, листок? Постой!\n");
        unsettle();
    }
}
