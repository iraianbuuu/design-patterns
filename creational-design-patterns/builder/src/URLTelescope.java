/**
 * One of the ways to solve the problem of URL class is to use a telescoping constructor.
 * Instead of initializing multiple constructors, one constructor uses already initialized constructor.
 * This will reduce the number of constructors and make the code more readable.
 * It's not able to solve multiple combinations
 */
public class URLTelescope {
    private String protocol;
    private String host;
    private String port;
    private String pathParams;
    private String queryParams;

    public URLTelescope() {}

    public URLTelescope(String protocol) {
        this.protocol = protocol;
    }

    public URLTelescope(String protocol, String host) {
        this(protocol);
        this.host = host;
    }

    public URLTelescope(String protocol, String host, String port) {
        this(protocol, host);
        this.port = port;
    }

    public URLTelescope(String protocol, String host, String port, String pathParams) {
        this(protocol, host, port);
        this.pathParams = pathParams;
    }

    public URLTelescope(String protocol, String host, String port, String pathParams, String queryParams) {
        this(protocol, host, port, pathParams);
        this.queryParams = queryParams;
    }
}
