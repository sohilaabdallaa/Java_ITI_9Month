
package address;

public class Address {


    public static void main(String[] args) {
        String address = "163.121.12.30";
        IPAddress ip = new IPAddress(address);
//        ip.tokenizing_Str();
        
        String [] ip_Parts = ip.ipCutter();
        for (int i = 0; i < ip_Parts.length; i++)
            System.out.println(ip_Parts[i]);
    }
    
}
