package executor.model;

public class ThreadPoolConfig {

    private Integer corePoolSize;
    private Long keepAliveTime;

    public ThreadPoolConfig(Integer corePoolSize, Long keepAliveTime) {
        this.corePoolSize = corePoolSize;
        this.keepAliveTime = keepAliveTime;
    }

    public ThreadPoolConfig() {

    }

    public Integer getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(Integer corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public Long getKeepAliveTime() {
        return keepAliveTime;
    }

    public void setKeepAliveTime(Long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    @Override
    public String toString() {
        return "ThreadPoolConfig{" +
                "corePoolSize=" + corePoolSize +
                ", keepAliveTime=" + keepAliveTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ThreadPoolConfig)) return false;

        ThreadPoolConfig that = (ThreadPoolConfig) o;

        if (getCorePoolSize() != null ? !getCorePoolSize().equals(that.getCorePoolSize()) : that.getCorePoolSize() != null)
            return false;
        return getKeepAliveTime() != null ? getKeepAliveTime().equals(that.getKeepAliveTime()) : that.getKeepAliveTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getCorePoolSize() != null ? getCorePoolSize().hashCode() : 0;
        result = 31 * result + (getKeepAliveTime() != null ? getKeepAliveTime().hashCode() : 0);
        return result;
    }
}