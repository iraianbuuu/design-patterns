public class Main {
    public static void main(String[] args) {
        URLBuilder jsonPlaceholder = new URLBuilder.Builder()
                .protocol("https://")
                .host("jsonplaceholder.typicode.com")
                .pathParams("/posts")
                .queryParams("?userId=1")
                .build();

        URLBuilder SERVER_API_URL = new URLBuilder.Builder()
                .protocol("http://")
                .host("localhost")
                .port(":8080")
                .pathParams("/api/v1/users")
                .queryParams("?page=1&limit=10")
                .build();

        System.out.println(jsonPlaceholder.protocol + jsonPlaceholder.host + jsonPlaceholder.pathParams
                + jsonPlaceholder.queryParams);

        System.out.println(SERVER_API_URL.protocol + SERVER_API_URL.host + SERVER_API_URL.port
                + SERVER_API_URL.pathParams + SERVER_API_URL.queryParams);
    }
}