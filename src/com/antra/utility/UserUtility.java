package com.antra.utility;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Ziye on 01/13/2020
 */
public class UserUtility {
    public static boolean validateUser(String name, String pwd, HttpServletRequest req) {
        return "admin".equalsIgnoreCase(name) && "1".equals(pwd);
    }
}
