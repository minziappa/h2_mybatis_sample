CREATE ALIAS IP_ADDRESS AS '
import java.net.*;
@CODE
String ipAddress(String host) throws Exception {
    return InetAddress.getByName(host).getHostAddress();
}
';
