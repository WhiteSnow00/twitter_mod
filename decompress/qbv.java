import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qbv
{
    public static final vrc a;
    public static final vrc b;
    public static final vrc c;
    public static final vrc d;
    public static final jta<Set<String>> e;
    public static final jta<Set<String>> f;
    
    static {
        a = new vrc("api.twitter.com", true);
        b = new vrc("mobile.twitter.com", true);
        c = new vrc("upload.twitter.com", true);
        new vrc("twitter.com", true);
        d = new vrc("analytics.twitter.com", true);
        new vrc("concon.twitter.com", true);
        e = dia.l("scribe_cdn_host_root_list", (byt)pm6.d);
        f = dia.l("scribe_cdn_file_extension_list", (byt)pbv.b);
    }
    
    public static vrc a() {
        bl0.a().t();
        return qbv.a;
    }
    
    public static vrc b() {
        bl0.a().t();
        return qbv.a;
    }
    
    public static Set<String> c(final jta<Set<String>> jta) {
        final hta hta = (hta)((kyr)jta).get();
        if (hta == null) {
            final med$b d0 = med.D0;
            final int a = w4j.a;
            return (Set<String>)d0;
        }
        Object c0;
        if ((c0 = hta.d()) == null) {
            c0 = f3a.C0;
        }
        return (Set<String>)c0;
    }
}
