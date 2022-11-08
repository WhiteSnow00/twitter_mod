import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i4g
{
    public static final b Companion;
    public static final alp<i4g> h;
    public static final i4g i;
    public final fva a;
    public final String b;
    public final String c;
    public final Map<String, qua> d;
    public final Set<String> e;
    public final Map<String, yta> f;
    public final Map<String, cua> g;
    
    static {
        Companion = new b();
        i4g.h = new i4g.i4g$c();
        i = (i4g)((h4j)new i4g.i4g$a()).e();
    }
    
    public i4g(final fva a, final String b, final String c, final Map<String, qua> d, final Set<String> e, final Map<String, yta> f, final Map<String, cua> g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof i4g) {
                final fva a = this.a;
                final i4g i4g = (i4g)o;
                if (zzd.a((Object)a, (Object)i4g.a) && zzd.a((Object)this.b, (Object)i4g.b) && zzd.a((Object)this.d, (Object)i4g.d) && zzd.a((Object)this.e, (Object)i4g.e)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + l7k.a(this.b, this.a.hashCode() * 31, 31)) * 31;
    }
    
    public static final class b
    {
    }
}
