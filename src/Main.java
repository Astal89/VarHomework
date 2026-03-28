//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Задача 1");
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    System.out.println("dog = " + dog);
    System.out.println("cat = " + cat);
    System.out.println("paper = " + paper);

    System.out.println("Задача 2");
    dog = dog + 4;
    cat = cat + 4;
    paper = paper + 4;
    System.out.println("dog = " + dog);
    System.out.println("cat = " + cat);
    System.out.println("paper = " + paper);

    System.out.println("Задача 3");
    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;
    System.out.println("dog = " + dog);
    System.out.println("cat = " + cat);
    System.out.println("paper = " + paper);

    System.out.println("Задача 4");
    var friend = 19;
    System.out.println("friend = " + friend);
    friend = friend + 2;
    System.out.println("friend = " + friend);
    friend = friend / 7;
    System.out.println("friend = " + friend);

    System.out.println("Задача 5");
    var frog = 3.5;
    System.out.println("frog = " + frog);
    frog = frog * 10;
    System.out.println("frog = " + frog);
    frog = frog / 3.5;
    System.out.println("frog = " + frog);
    frog = frog + 4;
    System.out.println("frog = " + frog);

    System.out.println("Задача 6");
    var firstBoxerWeight = 78.2;
    var secondBoxerWeight = 82.7;
    var totalWeight = firstBoxerWeight + secondBoxerWeight;
    System.out.println("Общая масса двух бойцов = " + totalWeight);
    var weightDiff = secondBoxerWeight - firstBoxerWeight;
    System.out.println("Разница между массами = " + weightDiff);

    System.out.println("Задача 7");
    var result = secondBoxerWeight % firstBoxerWeight;
    System.out.println("Остаток от деления = " + result);

    System.out.println("Задача 8");
    var totalHours = 640;
    var hoursPerEmployee = 8;
    var employeesCount = totalHours / hoursPerEmployee;
    System.out.println("Всего работников в компании " + employeesCount + " человек.");
    totalHours = (employeesCount + 94) * 8;
    System.out.println("Часов если работников на 94 больше =  " + totalHours);
}
