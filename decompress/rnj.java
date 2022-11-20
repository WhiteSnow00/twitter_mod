import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rnj implements wej
{
    public static final a Companion;
    public final ixa a;
    
    static {
        Companion = new a();
    }
    
    public rnj(final ixa a) {
        czd.f((Object)a, "fileReader");
        this.a = a;
    }
    
    public final String a() {
        String c = w1e.c(new File("/data/etc/appchannel", "twitter-oem"), this.a);
        if (ikr.g((CharSequence)c)) {
            final af4 af4 = new af4(new String[] { "external::oem:referrer:channel_location" });
            ((u0p)af4).t = c;
            final int a = c5j.a;
            cbw.b((elm)af4);
        }
        else {
            c = null;
        }
        return c;
    }
    
    public static final class a
    {
    }
}
