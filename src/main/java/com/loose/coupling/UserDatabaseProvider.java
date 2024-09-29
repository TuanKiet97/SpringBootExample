package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails () {
        // Directly access database
        return "User from database";
    }
}
