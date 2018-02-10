/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepnaplo;

import java.time.LocalDateTime;

/**
 *
 * @author Darázsi Márk
 */
public class DB {
    private String datumido() {
        String s = LocalDateTime.now().toString();
        return s.substring(0, 10) + " " + s.substring(11, 19);
    }
    
    private String felh() {
        return System.getProperty("user.name");
    }
    
    public static void main(String[] args) {
        DB ab = new DB();
        System.out.println(ab.datumido());
        System.out.println(ab.felh());
    }
}
