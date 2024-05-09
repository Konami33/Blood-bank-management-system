/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author LENOVO
 */
public class getvalue {
    public static String idd;
    public static String getString() {
        try{
            return idd;
        }
        catch(Exception e) {
            return null;
        }
    }
    public static void setString(String id) {
        idd = id;
    }
}
