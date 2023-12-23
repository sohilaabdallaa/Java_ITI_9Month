package address;

import java.util.StringTokenizer;

/**
 *
 * @author Lap Smart
 */
public class IPAddress {

    private String ipAds;

    public IPAddress() {
        ipAds = " ";
    }

    public IPAddress(String ip) {
        ipAds = ip;
    }

    public void set_Address(String ip) {
        ipAds = ip;
    }

    public String get_Address() {
        return ipAds;
    }
    public void tokenizing_Str()
    {
        StringTokenizer str = new StringTokenizer(ipAds,".");
        while(str.hasMoreTokens())
        {
            System.out.println(""+str.nextToken());
        }
    }
    public String [] ipCutter()
    {
        String[] ip_parts = ipAds.split("\\.");
        if(ip_parts.length == 0)
            System.out.println("Empty ip");
        return ip_parts;
    }
}
