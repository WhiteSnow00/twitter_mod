import java.net.InetAddress;
import java.util.List;
import java.util.LinkedHashSet;
import okhttp3.Dns;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cad extends k59
{
    public final i59 b;
    public final Set<String> c;
    
    public cad(final Dns dns, final i59 b) {
        e0e.f((Object)dns, "systemDns");
        e0e.f((Object)b, "dnsRepository");
        super(dns);
        this.b = b;
        this.c = new LinkedHashSet();
    }
    
    @Override
    public final void a(final String s, final List<? extends InetAddress> list) {
        e0e.f((Object)s, "hostname");
        xw0.c((sj)new b10((Object)this, (Object)s, (Object)list, 1));
    }
}
