package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private RealInternet realInternet = new RealInternet();

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();

        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String url) throws Exception {

        if (bannedSites.contains(url.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        realInternet.connectTo(url);
    }

}

