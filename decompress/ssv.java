import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ssv
{
    public static final a Companion;
    public static final rlp<ssv> f;
    public final zai a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List<mzo> e;
    
    static {
        Companion = new a();
        ssv.f = new ssv.ssv$b();
    }
    
    public ssv(final zai zai, final String s) {
        this(zai, s, null, 28);
    }
    
    public ssv(final zai zai, final String s, String s2, final int n) {
        if ((n & 0x4) != 0x0) {
            s2 = null;
        }
        this(zai, s, s2, false, null);
    }
    
    public ssv(final zai a, final String b, final String c, final boolean d, final List<mzo> e) {
        czd.f((Object)a, "navigationLink");
        czd.f((Object)b, "id");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ssv && c5j.a((Object)this.b, (Object)((ssv)o).b));
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.b);
    }
    
    public static final class a
    {
    }
}
