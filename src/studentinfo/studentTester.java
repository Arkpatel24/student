/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Ark
 */
package studentinfo;

/**
 *
 * @author ARK PATEL
 */
public class studentTester 
{
    private String _name;
    private int mathCourse;
    public void setName(String name)
    {
        this._name=name;
    }
    
    public String getName()
    {
        return this._name;
    }

    /**
     * @return the mathCourse
     */
    public int getMathCourse()
    {
        return mathCourse;
    }

    /**
     * @param mathCourse the mathCourse to set
     */
    public void setMathCourse(int mathCourse)
    {
        this.mathCourse = mathCourse;
    }
}
