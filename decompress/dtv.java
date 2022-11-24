import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtv
{
    public static final a Companion;
    public static final nmp<dtv> f;
    public final qbi a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List<g0p> e;
    
    static {
        Companion = new a();
        dtv.f = new dtv.dtv$b();
    }
    
    public dtv(final qbi qbi, final String s) {
        this(qbi, s, null, 28);
    }
    
    public dtv(final qbi qbi, final String s, String s2, final int n) {
        if ((n & 0x4) != 0x0) {
            s2 = null;
        }
        this(qbi, s, s2, false, null);
    }
    
    public dtv(final qbi a, final String b, final String c, final boolean d, final List<g0p> e) {
        e0e.f((Object)a, "navigationLink");
        e0e.f((Object)b, "id");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof dtv && o5j.a((Object)this.b, (Object)((dtv)o).b));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.b);
    }
    
    public static final class a
    {
    }
}
