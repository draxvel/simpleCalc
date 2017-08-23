package com.draxvel.calc;

import javax.jws.soap.SOAPBinding;

public class Calculator {

    private int result;

    public void add(final int ... params) throws UserException{
        if(params.length>0) {
            for (Integer param : params) {
                this.result += param;
            }
        } else
        {
            throw new UserException ("You should enter args!");
        }
    }

    /**
     * Ділення
     * @param args
     * @throws UserException якщо аргументів немає - викидуємо виключення
     */
    public void div(int ... args) throws UserException
    {
        if(args.length>0)
        {
            if(args[1] == 0) {
                throw new IllegalArgumentException("You try to div by 0. Pleace change args!");
            }
            this.result = args[0]/args[1];
        }
        else
        {
            throw new UserException("You should enter args!");
        }
    }
    public int getResult() {
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }
}