import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class umh
{
    public static final nmp<umh> i;
    public final gmh a;
    public final b1p b;
    public final String c;
    public final String d;
    public final List<jva$c> e;
    public final v0t f;
    public final w0t g;
    public final int h;
    
    static {
        umh.i = new umh.umh$b();
    }
    
    public umh(final umh.umh$a umh$a) {
        this.a = umh$a.a;
        this.b = umh$a.b;
        final String c = umh$a.c;
        vmw.g((Object)c);
        this.c = c;
        final String d = umh$a.d;
        vmw.g((Object)d);
        this.d = d;
        this.e = umh$a.e;
        this.h = umh$a.f;
        this.f = umh$a.g;
        this.g = umh$a.h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && umh.class == o.getClass()) {
            final umh umh = (umh)o;
            if (!o5j.a((Object)this.a, (Object)umh.a) || !o5j.a((Object)this.b, (Object)umh.b) || !o5j.a((Object)this.c, (Object)umh.c) || !o5j.a((Object)this.d, (Object)umh.d) || !o5j.a((Object)this.e, (Object)umh.e) || this.h != umh.h || !o5j.a((Object)this.f, (Object)umh.f) || !o5j.a((Object)this.g, (Object)umh.g)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.l((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e, (Object)this.f, (Object)this.g);
    }
}
