package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 *
 * @author Ella
 */
public class CurrentCountry implements Country {

    private String code;
    private String name;

    CurrentCountry(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

}
