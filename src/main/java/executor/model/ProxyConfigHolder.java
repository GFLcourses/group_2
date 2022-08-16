package executor.model;

public class ProxyConfigHolder {

    private ProxyNetworkConfig proxyNetworkConfig;
    private ProxyCredentials proxyCredentials;

    public ProxyConfigHolder(ProxyNetworkConfig proxyNetworkConfig, ProxyCredentials proxyCredentials) {
        this.proxyNetworkConfig = proxyNetworkConfig;
        this.proxyCredentials = proxyCredentials;
    }

    public ProxyConfigHolder() {
    }

    public ProxyNetworkConfig getProxyNetworkConfig() {
        return proxyNetworkConfig;
    }

    public void setProxyNetworkConfig(ProxyNetworkConfig proxyNetworkConfig) {
        this.proxyNetworkConfig = proxyNetworkConfig;
    }

    public ProxyCredentials getProxyCredentials() {
        return proxyCredentials;
    }

    public void setProxyCredentials(ProxyCredentials proxyCredentials) {
        this.proxyCredentials = proxyCredentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProxyConfigHolder)) return false;

        ProxyConfigHolder that = (ProxyConfigHolder) o;

        if (getProxyNetworkConfig() != null ? !getProxyNetworkConfig().equals(that.getProxyNetworkConfig()) : that.getProxyNetworkConfig() != null)
            return false;
        return getProxyCredentials() != null ? getProxyCredentials().equals(that.getProxyCredentials()) : that.getProxyCredentials() == null;
    }

    @Override
    public int hashCode() {
        int result = getProxyNetworkConfig() != null ? getProxyNetworkConfig().hashCode() : 0;
        result = 31 * result + (getProxyCredentials() != null ? getProxyCredentials().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProxyConfigHolder{" +
                "proxyNetworkConfig=" + proxyNetworkConfig +
                ", proxyCredentials=" + proxyCredentials +
                '}';
    }


}
