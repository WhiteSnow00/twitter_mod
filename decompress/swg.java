import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class swg
{
    public static final rlp<swg> i;
    public final boolean a;
    public final Set<Integer> b;
    public final Set<Long> c;
    public final Set<Integer> d;
    public final Set<Long> e;
    public final Set<Integer> f;
    public final Set<Integer> g;
    public final Set<Integer> h;
    
    static {
        swg.i = new swg.swg$b();
    }
    
    public swg(final boolean a, final Set b, final Set c, final Set d, final Set e, final Set f, final Set g, final Set h, final i48 i48) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && swg.class == o.getClass()) {
            final swg swg = (swg)o;
            return this.a == swg.a && this.b.equals(swg.b) && this.c.equals(swg.c) && this.d.equals(swg.d) && this.e.equals(swg.e) && this.f.equals(swg.f);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode() * 31 + (this.e.hashCode() * 31 + (this.d.hashCode() * 31 + (this.c.hashCode() * 31 + (this.b.hashCode() * 31 + Boolean.valueOf(this.a).hashCode()))));
    }
}
