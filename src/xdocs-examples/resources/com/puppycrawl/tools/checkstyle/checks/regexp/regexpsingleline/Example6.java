/*xml
<module name="Checker">
  <module name="RegexpSingleline">
      <property name="format" value="license"/>
      <property name="minimum" value="1"/>
      <property name="maximum" value="9999"/>
      <property name="ignoreCase" value="true"/>
      <!--  Configure a message to be shown on violation of the Check. -->
      <property name="message"
                value="File must contain at least one occurrence of 'license' term"/>
      <!--  Perform the Check only on files with SQL extension. -->
      <property name="fileExtensions" value="sql"/>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.regexp.regexpsingleline;

public class Example6 {}
// xdoc section -- start
// xdoc section -- end
