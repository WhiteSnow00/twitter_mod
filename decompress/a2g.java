import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a2g
{
    public static final Set<String> a;
    
    static {
        final Set<String> set = a = nmp.t((Object)"twitter.com", (Object[])new String[] { "www.twitter.com" });
        final rsd rsd = new rsd(-1);
        final rsd rsd2 = new rsd(-1);
        rsd.a("live", "timeline/*", 0);
        final Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            rsd2.a((String)iterator.next(), "i/live/*", 0);
        }
    }
}
