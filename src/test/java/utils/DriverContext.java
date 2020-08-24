package utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class DriverContext {
    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
    private static List<WebDriver> storedDrivers = new ArrayList<>();

    private static ThreadLocal<Scenario> scenarios = new ThreadLocal<>();
    private static List<Scenario> storedScenarios = new ArrayList<>();

    private DriverContext(){};

    public static WebDriver getDriver(){
        return drivers.get();
    }

    public static Scenario getScenario(){
        return scenarios.get();
    }

    public static void addDriver(WebDriver driver){
        storedDrivers.add(driver);
        drivers.set(driver);
    }

    public static void addScenario(Scenario scenario){
        storedScenarios.add(scenario);
        scenarios.set(scenario);
    }

    public static void removeDriver(){
        storedDrivers.remove(drivers.get());
        drivers.remove();
    }

    public static void removeScenarios(){
        storedScenarios.remove(scenarios.get());
        scenarios.remove();
    }
}
