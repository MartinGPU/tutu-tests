package com.marat.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/credentials.properties"})
public interface CredentialsConfig extends Config {

    String login();
    String password();
    String url();
    String remoteLogin();
    String remotePassword();
    String remoteUrl();
}
