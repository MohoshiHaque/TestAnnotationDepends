package org.example;

import org.testng.annotations.Test;

public class TestAnnotationDepends {

//    TestNG executes the test methods in alphabetical order

    @Test
    public void WebStudentLogin()
    {
        System.out.println("Student login through web");
    }

    @Test
    public void WobileStudentLogin()
    {
        System.out.println("Student login through mobile");
    }

    @Test(dependsOnMethods={"WebStudentLogin"})
    public void APIStudentLogin()
    {
        System.out.println("Student login through API");
    }


}
