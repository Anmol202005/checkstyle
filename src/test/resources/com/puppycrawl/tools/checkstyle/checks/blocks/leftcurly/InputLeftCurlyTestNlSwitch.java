/*
LeftCurly
option = NL
ignoreEnums = (default)true
tokens = (default)ANNOTATION_DEF, CLASS_DEF, CTOR_DEF, ENUM_CONSTANT_DEF, \
         ENUM_DEF, INTERFACE_DEF, LAMBDA, LITERAL_CASE, LITERAL_CATCH, \
         LITERAL_DEFAULT, LITERAL_DO, LITERAL_ELSE, LITERAL_FINALLY, LITERAL_FOR, \
         LITERAL_IF, LITERAL_SWITCH, LITERAL_SYNCHRONIZED, LITERAL_TRY, LITERAL_WHILE, \
         METHOD_DEF, OBJBLOCK, STATIC_INIT, RECORD_DEF, COMPACT_CTOR_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.blocks.leftcurly;

public class InputLeftCurlyTestNlSwitch
{

    public void doStuff()
    {
        int x = 1;
        switch (x)
        {
            case 0: { // violation ''{' at column 21 should be on a new line'
                break;
            }
            case (1
                + 0):
            {
                break;
            }
            case 2:
            {
                break;
            }
            default
                :
            {
                break;
            }
            case 3:
            case 4:
                x++; { // ok, standalone block
                }
                break;
            case 5:
                {
                    x++;
                }
                x++;
                break;
        }
        switch (x)
        {
            case 0
            :{ // violation ''{' at column 14 should be on a new line'
                break;
            }
            default:
                // do nothing
        }
    }

}
