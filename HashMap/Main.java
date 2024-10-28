package HashMap;

public class Main {
    public static void main(String[] args) {
        Schedule newSchedule = new Schedule();

        Class classFirst = new Class("100", "Geography", "12:35");
        Class classSecond = new Class("202", "Math", "09:00");

        newSchedule.addClass(classFirst);
        newSchedule.addClass(classSecond);

        System.out.println("All classes in schedule:");
        newSchedule.prntAllClasses();

        System.out.println("Search class by the code 202");
        System.out.println(newSchedule.searchClassByCode("202"));

        System.out.println("Remove class by the code 202");
        newSchedule.removeClass("202");

        System.out.println("All classes in schedule:");
        newSchedule.prntAllClasses();
    }
}
