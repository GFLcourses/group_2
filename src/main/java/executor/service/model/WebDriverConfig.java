package executor.service.model;


import java.util.Objects;

public class WebDriverConfig {

    private String webDriverExecutable;
    private String userAgent;
    private Long pageLoadTimeout;
    private Long implicitlyWait;

    public WebDriverConfig() {
    }

    public WebDriverConfig(String webDriverExecutable, String userAgent, Long pageLoadTimeout, Long implicitlyWait) {
        this.webDriverExecutable = webDriverExecutable;
        this.userAgent = userAgent;
        this.pageLoadTimeout = pageLoadTimeout;
        this.implicitlyWait = implicitlyWait;
    }


    public String getWebDriverExecutable() {
        return webDriverExecutable;
    }

    public void setWebDriverExecutable(String webDriverExecutable) {
        this.webDriverExecutable = webDriverExecutable;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Long getPageLoadTimeout() {
        return pageLoadTimeout;
    }

    public void setPageLoadTimeout(Long pageLoadTimeout) {
        this.pageLoadTimeout = pageLoadTimeout;
    }

    public Long getImplicitlyWait() {
        return implicitlyWait;
    }

    public void setImplicitlyWait(Long implicitlyWait) {
        this.implicitlyWait = implicitlyWait;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebDriverConfig that = (WebDriverConfig) o;
        return Objects.equals(webDriverExecutable, that.webDriverExecutable) &&
                Objects.equals(userAgent, that.userAgent) &&
                Objects.equals(pageLoadTimeout, that.pageLoadTimeout) &&
                Objects.equals(implicitlyWait, that.implicitlyWait);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webDriverExecutable, userAgent, pageLoadTimeout, implicitlyWait);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder()
                .append("WebDriverConfig : { ").append("webDriverExecutable = ").append(webDriverExecutable)
                .append(", ").append("userAgent = ").append(userAgent)
                .append(", ").append("pageLoadTimeout = ").append(pageLoadTimeout)
                .append(", ").append("implicitlyWait = ").append(implicitlyWait)
                .append(" }");
        return stringBuilder.toString();
    }

}
