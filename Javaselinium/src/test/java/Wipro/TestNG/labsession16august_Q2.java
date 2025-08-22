package Wipro.TestNG;

import org.testng.annotations.Test;

public class labsession16august_Q2 {
	@Test(groups = {"Sanity"})
    public void createUser() {
        System.out.println("createUser test executed");
    }

    @Test(groups = {"Regression"})
    public void updateUser() {
        System.out.println("updateUser test executed");
    }

    @Test(groups = {"Sanity", "Regression"})
    public void deleteUser() {
        System.out.println("deleteUser test executed");
    }

    @Test(groups = {"Smoke"})
    public void viewUser() {
        System.out.println("viewUser test executed");
    }

}
