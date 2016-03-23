/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.survival.exceptions;

/**
 *
 * @author Tabitha
 */
public class GetTiaraException extends Exception {

    public GetTiaraException() {
    }

    public GetTiaraException(String string) {
        super(string);
    }

    public GetTiaraException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public GetTiaraException(Throwable thrwbl) {
        super(thrwbl);
    }

    public GetTiaraException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
