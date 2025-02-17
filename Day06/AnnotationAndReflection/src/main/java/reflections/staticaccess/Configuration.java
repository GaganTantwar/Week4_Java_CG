package reflections.staticaccess;

// Class representing a Configuration with a static API key
public class Configuration {

    // Static field to store the API key
    private static String API_KEY = "DEFAULT_KEY";

    // Static method to get the value of the API key
    public static String getApiKey() {
        return API_KEY;
    }
}
