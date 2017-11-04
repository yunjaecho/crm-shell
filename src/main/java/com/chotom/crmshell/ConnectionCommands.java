package com.chotom.crmshell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ConnectionCommands {
    private final CrmService crm;
    private final ConsoleService console;

    ConnectionCommands(CrmService crm, ConsoleService console) {
        this.crm = crm;
        this.console = console;
    }

    @ShellMethod("connect to the CRM")
    public void connect(String username, String password) {
        this.crm.connect(username, password);
        this.console.write("connected  %s.",  username);
    }
}
