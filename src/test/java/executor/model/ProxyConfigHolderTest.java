package executor.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyConfigHolderTest {

    @Test
    void ProxyTest(){
        ProxyConfigHolder actual = new ProxyConfigHolder(new ProxyNetworkConfig("host",1111), new ProxyCredentials("vlad","1111"));
        ProxyConfigHolder pr2 = new ProxyConfigHolder();
        pr2.setProxyCredentials(new ProxyCredentials("vlad","1111"));
        pr2.setProxyNetworkConfig(new ProxyNetworkConfig("host",1111));
        assertEquals(actual,pr2);
    }

}