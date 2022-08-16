package executor.model;

public class ProxyCredentials {
        private String username;
        private String password;

    public ProxyCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public ProxyCredentials() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProxyCredentials)) return false;

        ProxyCredentials that = (ProxyCredentials) o;

        if (getUsername() != null ? !getUsername().equals(that.getUsername()) : that.getUsername() != null)
            return false;
        return getPassword() != null ? getPassword().equals(that.getPassword()) : that.getPassword() == null;
    }

    @Override
    public int hashCode() {
        int result = getUsername() != null ? getUsername().hashCode() : 0;
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProxyCredentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
