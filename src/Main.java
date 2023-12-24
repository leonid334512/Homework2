public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общая масса боксеров " + totalWeight + " кг!");
        var differenceBetweenBoxers = secondBoxer - firstBoxer;
        System.out.println("Разница между массами боксеров " + differenceBetweenBoxers + " кг!");
        var differenceBetweenBoxers2 = (secondBoxer - firstBoxer) % totalWeight;
        System.out.println("Разница между массами боксеров " + differenceBetweenBoxers2 + " кг!");
        var totalTime = 640;
        var everyEmployee = 8;
        var totalEmployees = totalTime / everyEmployee;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        var employees = 80;
        var newEmployees = 94;
        var totalEmployees1 = employees + newEmployees;
        var everyEmployees2 = totalTime / totalEmployees1;
        System.out.println("Если в компании работает " + totalEmployees1 + " человека,то всего " + everyEmployees2 + " часа работы может быть поделено между сотрудниками" );

    }
}