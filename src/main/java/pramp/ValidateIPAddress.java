package pramp;

public class ValidateIPAddress {

    //Below solution is from me
    static boolean validateIP(String ip) {

        // your code goes here
        String[] ipChunks;
        if (ip.contains("."))
            ipChunks = ip.split("\\.");
        else
            return false;

        if (!(ipChunks.length == 4))
            return false;

        for (int i = 0; i < ipChunks.length; i++) {
            if ((Integer.parseInt(ipChunks[i]) < 0) || (Integer.parseInt(ipChunks[i]) > 255))
                return false;
        }
        return true;
    }


    //Below solution is from fellow interviewer
    static boolean validateIp(String ip) {

        if (ip == null || ip.equals(""))
            return false;

        String[] arrIp = ip.split("\\.");

        if (arrIp.length != 4)
            return false;

        for (int i = 0; i < arrIp.length; i++) {
            try {
                int curNum = Integer.parseInt(arrIp[i]);

                if (curNum < 0 || curNum > 255)
                    return false;
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(validateIp("192.168.0.1"));
        System.out.println(validateIp("0.0.0.0"));
        System.out.println(validateIp("123.24.59.99"));
        System.out.println(validateIp("192.168.123.456"));
        System.out.println(validateIp("1.2.3.4.5"));
        System.out.println(validateIp("1..23.4"));
        System.out.println(validateIp("123.256.34.56"));
        System.out.println(validateIp(".254.255.0"));
        System.out.println(validateIp("1.2.3.0x1"));

      /*Test Case #1
        Input: "192.168.0.1",Expected: true,Actual: true
        Test Case #2
        Input: "0.0.0.0",Expected: true,Actual: true
        Test Case #3
        Input: "123.24.59.99",Expected: true,Actual: true
        Test Case #4
        Input: "192.168.123.456",Expected: false,Actual: false
        Test Case #5
        Input: "1.2.3.4.5",Expected: false,Actual: false
        Test Case #6
        Input: "1..23.4",Expected: false,Actual: false
        Test Case #7
        Input: "123.256.34.56",Expected: false,Actual: false
        Test Case #8
        Input: ".254.255.0",Expected: false,Actual: false
        Test Case #9
        Input: "1.2.3.0x1",Expected: false,Actual: false*/
    }
}
