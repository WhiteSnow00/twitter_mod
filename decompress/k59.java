import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Collections;
import java.net.InetAddress;
import java.util.List;
import okhttp3.Dns;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class k59
{
    public final Dns a;
    
    public k59(final Dns a) {
        e0e.f((Object)a, "systemDns");
        this.a = a;
    }
    
    public abstract void a(final String p0, final List<? extends InetAddress> p1);
    
    public final void b(final String s, final List<? extends InetAddress> list, final stb<? super String, vzv> stb) {
        try {
            if (Collections.disjoint(this.a.lookup(s), list)) {
                stb.invoke((Object)s);
                final StringBuilder sb = new StringBuilder();
                sb.append("DnsValidator: Invalid DNS record deleted for hostname:");
                sb.append(s);
                nag.a("Traffic", sb.toString());
                iuk.E0(dda.g("traffic", "dns", "twitter_dns", s, "remove"));
            }
        }
        catch (final UnknownHostException ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("DnsValidator: Hostname not found in System DNS, hostname:");
            sb2.append(s);
            nag.a("Traffic", sb2.toString());
            iuk.E0(dda.g("traffic", "dns", "twitter_dns", s, "system_dns_hostname_not_found"));
        }
    }
}
