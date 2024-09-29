package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(userDataProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider userDataProviderWs = new WebServiceDataProvider();
        UserManager userManagerWS = new UserManager(userDataProviderWs);
        System.out.println(userManagerWS.getUserInfo());

        UserDataProvider newDataProviderWs = new WebServiceDataProvider();
        UserManager newManagerWS = new UserManager(newDataProviderWs);
        System.out.println(newManagerWS.getUserInfo());
    }
}
