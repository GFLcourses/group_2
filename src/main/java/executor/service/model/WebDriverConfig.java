package executor.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WebDriverConfig {

    private String webDriverExecutable;
    private String userAgent;
    private Long pageLoadTimeout;
    private Long implicitlyWait;


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
