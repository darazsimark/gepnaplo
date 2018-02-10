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
        return s;
    }
    
    public static void main(String[] args) {
        DB ab = new DB();
        System.out.println(ab.datumido());
    }
}
