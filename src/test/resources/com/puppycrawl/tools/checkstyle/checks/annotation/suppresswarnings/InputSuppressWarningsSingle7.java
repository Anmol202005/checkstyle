/*
SuppressWarnings
format = ^unchecked$*|^unused$*|.*
tokens = (default)CLASS_DEF, INTERFACE_DEF, ENUM_DEF, ANNOTATION_DEF, ANNOTATION_FIELD_DEF, \
         ENUM_CONSTANT_DEF, PARAMETER_DEF, VARIABLE_DEF, METHOD_DEF, CTOR_DEF, \
         COMPACT_CTOR_DEF, RECORD_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.suppresswarnings;

import java.lang.annotation.Documented;

// violation below, 'The warning 'unchecked' cannot be suppressed at this location'
@SuppressWarnings("unchecked")
public class InputSuppressWarningsSingle7
{
    // violation below, 'The warning '   ' cannot be suppressed at this location'
    @SuppressWarnings("   ")
    class Empty {

        // violation below, 'The warning '' cannot be suppressed at this location'
        @SuppressWarnings("")
        public Empty() {

        }
    }

    // violation below, 'The warning 'unused' cannot be suppressed at this location'
    @SuppressWarnings("unused")
    enum Duh {

        // violation below, 'The warning 'unforgiven' cannot be suppressed at this location'
        @SuppressWarnings("unforgiven")
        D;

        public static void foo() {

            // violation below, 'The warning 'unused' cannot be suppressed at this location'
            @SuppressWarnings("unused")
            Object o = new InputSuppressWarningsSingle7() {

                @Override
                @SuppressWarnings("unchecked")
                // violation above, 'The warning 'unchecked' cannot be suppressed at this location'
                public String toString() {
                    return "";
                }
            };
        }
    }

    // violation below, 'The warning 'abcun' cannot be suppressed at this location'
    @SuppressWarnings("abcun")
    @Documented
    @interface Sweet {
        int cool();
    }

    @Documented
    @SuppressWarnings("abcun")
    // violation above, 'The warning 'abcun' cannot be suppressed at this location'
    @interface MoreSweetness {

        // violation below, 'The warning 'unused' cannot be suppressed at this location'
        @SuppressWarnings("unused")
        int cool();
    }

    public class Junk {

        // violation below, 'The warning '' cannot be suppressed at this location'
        @SuppressWarnings("")
        int a = 1;

        // violation below, 'The warning 'unchecked' cannot be suppressed at this location'
        @SuppressWarnings("unchecked")
        @Deprecated
        int b = 1;
        void doFoo(String s, @SuppressWarnings("unchecked")String y) {
            // violation above, 'The warning 'unchecked' cannot be suppressed at this location'

        }
    }

    @SuppressWarnings((false) ? "unchecked" : "") // 2 violations
    class Cond {

        @SuppressWarnings((false) ? "" : "unchecked") // 2 violations
        public Cond() {

        }

        @SuppressWarnings((false) ? (true) ? "   " : "unused" : "unchecked") // 3 violations
        public void aCond1() {

        }

        @SuppressWarnings((false) ? "unchecked" : (true) ? "   " : "unused") // 3 violations
        public void aCond2() {

        }

        // violation below, 'The warning 'unchecked' cannot be suppressed at this location'
        @java.lang.SuppressWarnings((false) ? "unchecked" :
                ("" == "") ? (false) ? (true) ? "" : "foo" : "    " : "unused") // 4 violations
        public void seriously() {

        }
    }
}
