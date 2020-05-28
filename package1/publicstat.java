public class publicstat {
    private String user;
    private Array stat;

    public publicstat(String user) {
        this.user = user;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Array getStat() {
        return this.stat;
    }

    public void setStat(Array stat) {
        this.stat = stat;
    }

    public publicstat user(String user) {
        this.user = user;
        return this;
    }

    public publicstat stat(Array stat) {
        this.stat = stat;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof publicstat)) {
            return false;
        }
        publicstat publicstat = (publicstat) o;
        return Objects.equals(user, publicstat.user) && Objects.equals(stat, publicstat.stat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, stat);
    }

    @Override
    public String toString() {
        return "{" +
            " user='" + getUser() + "'" +
            ", stat='" + getStat() + "'" +
            "}";
    }

}