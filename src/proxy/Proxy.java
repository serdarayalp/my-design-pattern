package proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements InternetInterface {

    private final Internet internet;

    private static final List<String> bannedSites;

    public Proxy(Internet internet) {
        this.internet = internet;
    }

    static {
        bannedSites = new ArrayList<>();

        bannedSites.add("banned_url_1.com");
        bannedSites.add("banned_url_2.com");
        bannedSites.add("banned_url_3.com");
        bannedSites.add("banned_url_4.com");
    }

    @Override
    public void connect(String url) throws Exception {

        if (bannedSites.contains(url.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internet.connect(url);
    }

}

