import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.net.InetAddress;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mld extends s4j<InetAddress>
{
    public static final alp<InetAddress> b;
    public static final alp<List<InetAddress>> c;
    
    static {
        mld.c = new xq4$a((alp)(mld.b = new mld()));
    }
    
    public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
        final String i = elp.I();
        final byte[] w = elp.w();
        InetAddress byAddress;
        try {
            byAddress = InetAddress.getByAddress(i, w);
        }
        catch (final UnknownHostException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("DnsMap: Invalid InetAddress - ");
            sb.append(i);
            cag.b("Traffic", sb.toString(), (Throwable)ex);
            byAddress = null;
        }
        return byAddress;
    }
    
    public final void f(final flp flp, final Object o) throws IOException {
        final InetAddress inetAddress = (InetAddress)o;
        flp.G(inetAddress.getHostName()).v(inetAddress.getAddress());
    }
}
