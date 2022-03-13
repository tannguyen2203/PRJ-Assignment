/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valid;

/**
 *
 * @author ADMIN
 */
public class CheckValid {
    public static boolean checkString(String inputString, String pattern) {
        if (!inputString.matches(pattern)) {
            return false;
        }
        return true;
}
}
