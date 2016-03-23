/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.survival.exceptions;

/**
 *
 * @author macds
 */
public class GetBootsException extends Exception {

    public GetBootsException() {
    }

    public GetBootsException(String string) {
        super(string);
    }

    public GetBootsException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public GetBootsException(Throwable thrwbl) {
        super(thrwbl);
    }

    public GetBootsException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
