/**
 * URL class is a complex object that has many properties and methods.
 * Suppose we have a URL class with the following properties:
 * protocol, host, pathParams.
 * We need to create a separate constructor to initialize values.
 * 
 */
public class URL {
    private String protocol;
    private String host;
    private String port;
    private String pathParams;
    private String queryParams;

    public URL() {}

    public URL(String protocal) {
        this.protocol = protocal;
    }

    public URL(String protocal, String host) {
        this.protocol = protocal;
        this.host = host;
    }

    public URL(String protocal, String host, String port) {
        this.protocol = protocal;
        this.host = host;
        this.port = port;
    }

    public URL(String protocal, String host, String port, String pathParams) {
        this.protocol = protocal;
        this.host = host;
        this.port = port;
        this.pathParams = pathParams;
    }

    public URL(String protocal, String host, String port, String pathParams, String queryParams) {
        this.protocol = protocal;
        this.host = host;
        this.port = port;
        this.pathParams = pathParams;
        this.queryParams = queryParams;
    }

}
