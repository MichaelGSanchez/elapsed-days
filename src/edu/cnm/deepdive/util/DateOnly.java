package edu.cnm.deepdive.util;

import org.omg.CORBA.PUBLIC_MEMBER;

public class DateOnly {

  public static int elapsedDays(int year, int month, int day) {


  if (year > 1970){
    year = (year - 1970)*365;
    day = year % 1970;
    month = day/11;
    return year + month + day;
  }

  if (year < 1970){
    year = (year - 1970)*-365;
    day = year % 1970;
    month = day/11;
    return year+month+day;
  }


    return 0; // TODO Implement this method to return correct value.
  }

}
