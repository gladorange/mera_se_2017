/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artshop;

/**
 *
 * @author admin
 */
public class IncorrectPriceException extends Exception
{
    public IncorrectPriceException(String msg)
    {
        super(msg);
    }
}
