package MyPkg.CH_09.ObjectsAndClasses;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class GregorianCalendarDemo {
  public static void main(String[] args) {
    GregorianCalendar calendarToday = new GregorianCalendar();
    System.out.println("Year is " + calendarToday.get(GregorianCalendar.YEAR));
    System.out.println("Month is " + calendarToday.get(GregorianCalendar.MONTH));
    System.out.println("Date is " + calendarToday.get(GregorianCalendar.DATE));
    System.out.println("Year is " + calendarToday.get(GregorianCalendar.DAY_OF_WEEK));
    String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    System.out.println("Day is: " + dayNameOfWeek[calendarToday.get(Calendar.DAY_OF_WEEK) - 1]);

    calendarToday.add(Calendar.DATE,1);
    System.out.println("\n Tomorrow: " + calendarToday.getTime().toString());
    
    calendarToday.add(Calendar.DATE,-15);
    System.out.println("\n 15 days ago: " + calendarToday.getTime().toString());
    
    calendarToday.add(Calendar.MONTH,5);
    System.out.println("\n 5 months later: " + calendarToday.getTime().toString());
  }
}
