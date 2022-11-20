import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.net.InetAddress;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pkd extends y4j<InetAddress>
{
    public static final rlp<InetAddress> b;
    public static final rlp<List<InetAddress>> c;
    
    static {
        pkd.c = new vp4$a((rlp)(pkd.b = new pkd()));
    }
    
    public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
        final String g = vlp.G();
        final byte[] u = vlp.u();
        InetAddress byAddress;
        try {
            byAddress = InetAddress.getByAddress(g, u);
        }
        catch (final UnknownHostException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("DnsMap: Invalid InetAddress - ");
            sb.append(g);
            s9g.b("Traffic", sb.toString(), (Throwable)ex);
            byAddress = null;
        }
        return byAddress;
    }
    
    public final void f(final wlp wlp, final Object o) throws IOException {
        final InetAddress inetAddress = (InetAddress)o;
        wlp.E(inetAddress.getHostName()).t(inetAddress.getAddress());
    }
}
