package executor.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyCredentialsTest {

@Test
    public void login(){
        ProxyCredentials login = new ProxyCredentials();
        ProxyCredentials actual = new ProxyCredentials("Vlad","1111");
        login.setUsername("Vlad");
        login.setPassword("1111");


        assertEquals(actual,login);
    }

}
