/**
 * URLBuilder class is a builder class that is used to create a URL object.
 * It uses a static inner class to build the URL object.
 */
public class URLBuilder {
    public static class Builder {
        private String protocol;
        private String host;
        private String port;
        private String pathParams;
        private String queryParams;

        public URLBuilder build() {
            return new URLBuilder(this);
        }

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder port(String port) {
            this.port = port;
            return this;
        }

        public Builder queryParams(String queryParams) {
            this.queryParams = queryParams;
            return this;
        }

        public Builder pathParams(String pathParams) {
            this.pathParams = pathParams;
            return this;
        }
    }

    public String protocol;
    public String host;
    public String port;
    public String pathParams;
    public String queryParams;

    private URLBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.host = builder.host;
        this.port = builder.port;
        this.pathParams = builder.pathParams;
        this.queryParams = builder.queryParams;
    }

}
