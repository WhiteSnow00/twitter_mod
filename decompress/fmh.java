import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmh
{
    public static final rlp<fmh> i;
    public final rlh a;
    public final h0p b;
    public final String c;
    public final String d;
    public final List<cua$c> e;
    public final c0t f;
    public final d0t g;
    public final int h;
    
    static {
        fmh.i = new fmh.fmh$b();
    }
    
    public fmh(final fmh.fmh$a fmh$a) {
        this.a = fmh$a.a;
        this.b = fmh$a.b;
        final String c = fmh$a.c;
        jee.l((Object)c);
        this.c = c;
        final String d = fmh$a.d;
        jee.l((Object)d);
        this.d = d;
        this.e = fmh$a.e;
        this.h = fmh$a.f;
        this.f = fmh$a.g;
        this.g = fmh$a.h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && fmh.class == o.getClass()) {
            final fmh fmh = (fmh)o;
            if (!c5j.a((Object)this.a, (Object)fmh.a) || !c5j.a((Object)this.b, (Object)fmh.b) || !c5j.a((Object)this.c, (Object)fmh.c) || !c5j.a((Object)this.d, (Object)fmh.d) || !c5j.a((Object)this.e, (Object)fmh.e) || this.h != fmh.h || !c5j.a((Object)this.f, (Object)fmh.f) || !c5j.a((Object)this.g, (Object)fmh.g)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.l((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e, (Object)this.f, (Object)this.g);
    }
}
