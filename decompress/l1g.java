import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l1g
{
    public static final Set<String> a;
    
    static {
        final Set<String> set = a = dnp.t((Object)"twitter.com", (Object[])new String[] { "www.twitter.com" });
        final vrd vrd = new vrd(-1);
        final vrd vrd2 = new vrd(-1);
        vrd.a("live", "timeline/*", 0);
        final Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            vrd2.a((String)iterator.next(), "i/live/*", 0);
        }
    }
}
