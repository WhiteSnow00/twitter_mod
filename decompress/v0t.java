// 
// Decompiled by Procyon v0.6.0
// 

public final class v0t
{
    public static final nmp<v0t> d;
    public final q0t a;
    public final t0t b;
    public final gat c;
    
    static {
        v0t.d = new v0t.v0t$b();
    }
    
    public v0t(final q0t a, final t0t b, final gat c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public v0t(final v0t.v0t$a v0t$a) {
        this.a = v0t$a.a;
        this.b = v0t$a.b;
        this.c = v0t$a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && v0t.class == o.getClass()) {
            final v0t v0t = (v0t)o;
            if (!o5j.a((Object)this.a, (Object)v0t.a) || !o5j.a((Object)this.b, (Object)v0t.b) || !o5j.a((Object)this.c, (Object)v0t.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
}
