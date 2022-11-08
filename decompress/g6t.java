import java.util.regex.Pattern;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g6t
{
    public static final alp<g6t> d;
    public static final Set<String> e;
    public final String a;
    public final q7t b;
    public final String c;
    
    static {
        g6t.d = new g6t.g6t$a();
        g6t.e = (med)nmp.s((Object)"SelfThread");
    }
    
    public g6t(final String a, final q7t b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public g6t(final String a, final q7t b, final String c, final l7k l7k) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof g6t) {
            final g6t g6t = (g6t)o;
            final String a = this.a;
            final String a2 = g6t.a;
            final Pattern a3 = pjr.a;
            if (!zzd.a((Object)a, (Object)a2) || !w4j.a((Object)this.b, (Object)g6t.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
}
