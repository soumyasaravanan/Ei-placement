/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astronaut;

/**
 *
 * @author soumya
 */
import java.util.regex.Pattern;

public class TimeValidator {
    private static final Pattern TIME_PATTERN = Pattern.compile("^([01]\\d|2[0-3]):([0-5]\\d)$");

    public static boolean isValidTime(String timeString) {
        return TIME_PATTERN.matcher(timeString).matches();
    }
}

