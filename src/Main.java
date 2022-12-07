public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18){
            System.out.println("Если возраст челоека равен " + age + " то, он совершеннолетний.");
        }else {
            System.out.println("Если возраст челоека равен " + age + " то, он несовершеннолетний.");

        }

        System.out.println("Задание 2");
        int airTemperature = 5;
        if (airTemperature <= 5){
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        }else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");

        }

        System.out.println("Задание 3");
        int speedingTicket = 59;
        if (speedingTicket < 60){
            System.out.println("Если скорость " + speedingTicket + ", можно ездить спокойно");
        }else {
            System.out.println("Если скорость " + speedingTicket +" , придется заплатить штраф");
        }

        System.out.println("Задание 4");
        int ageOfAdmissionToTheInstitution = 22;
        if (ageOfAdmissionToTheInstitution >= 2 && ageOfAdmissionToTheInstitution <= 6 ){
            System.out.println("Если возраст человека равен " + ageOfAdmissionToTheInstitution +", то ему нужно ходить в детский сад");
        } else if (ageOfAdmissionToTheInstitution >= 7 &&  ageOfAdmissionToTheInstitution < 18) {
            System.out.println("Если возраст человека равен " + ageOfAdmissionToTheInstitution +", то ему нужно ходить в школу");
        }else if (ageOfAdmissionToTheInstitution >= 18 && ageOfAdmissionToTheInstitution <24){
            System.out.println("Если возраст человека равен " + ageOfAdmissionToTheInstitution +", то его место в университете");
        }else {
            System.out.println("Если возраст человека равен " + ageOfAdmissionToTheInstitution +", то ему пора ходить на работу");
        }


        System.out.println("Задание 5");
        int ageLimit = 14;
        if (ageLimit <= 5) {
            System.out.println("Если возраст ребенка равен " + ageLimit + ", то ему нельзя кататься на аттракционе");

        } else if (ageLimit > 5 && ageLimit <= 14) {
            System.out.println("Если возраст ребенка равен " + ageLimit + ",  можно кататься на аттракционе в сопровождении");
        } else{
            System.out.println("Если возраст ребенка равен " + ageLimit + ",  без сопровождения взрослого");
        }

        System.out.println("Задание 6");
        int passengers = 41;
        int capacityTrains = 102;
        int seatPlace = 60;
        if (passengers <= seatPlace ) {
            System.out.println("Есть сидячии места");
        } else if (passengers > seatPlace && passengers <= capacityTrains) {
            System.out.println("Есть только стоячии места");
        } else{
            System.out.println("Мест нет");
        }
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (three > two){
            System.out.println("three");
        } else if (two > one) {
            System.out.println("two");
        }else {
            System.out.println("one");
        }
    }
}