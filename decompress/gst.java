import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gst
{
    public static final a Companion;
    public final biw a;
    public final Map<String, u0k> b;
    
    static {
        Companion = new a();
    }
    
    public gst(final biw a) {
        zzd.f((Object)a, "tracer");
        this.a = a;
        this.b = new LinkedHashMap();
    }
    
    public final void a(final String s) {
        zzd.f((Object)s, "pctName");
        final u0k u0k = this.b.get(s);
        boolean b = true;
        if (u0k == null || !u0k.a0()) {
            b = false;
        }
        if (b) {
            final u0k u0k2 = this.b.get(s);
            if (u0k2 != null) {
                ((v0k)u0k2.a).U(uhr.F0);
            }
        }
    }
    
    public final void b(final String s) {
        zzd.f((Object)s, "pctName");
        final u0k u0k = this.b.get(s);
        if (u0k != null) {
            u0k.stop();
        }
    }
    
    public static final class a
    {
    }
}
