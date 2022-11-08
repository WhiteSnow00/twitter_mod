// 
// Decompiled by Procyon v0.6.0
// 

public final class hxo
{
    public static final hxo.hxo$b k;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final rr4 e;
    public String f;
    public String g;
    public final String h;
    public final String i;
    public final szg j;
    
    static {
        k = new hxo.hxo$b();
    }
    
    public hxo(final hxo.hxo$a hxo$a) {
        final String a = hxo$a.a;
        pf8.r(a);
        this.a = a;
        this.b = hxo$a.b;
        this.c = hxo$a.c;
        this.d = hxo$a.d;
        this.e = hxo$a.e;
        this.f = hxo$a.f;
        this.g = hxo$a.g;
        this.h = hxo$a.h;
        this.i = hxo$a.i;
        this.j = hxo$a.j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hxo.class == o.getClass()) {
            final int a = w4j.a;
            final hxo hxo = (hxo)o;
            if (!w4j.a((Object)this.a, (Object)hxo.a) || !w4j.a((Object)this.b, (Object)hxo.b) || !w4j.a((Object)this.c, (Object)hxo.c) || !w4j.a((Object)this.d, (Object)hxo.d) || !w4j.a((Object)this.e, (Object)hxo.e) || !w4j.a((Object)this.f, (Object)hxo.f) || !w4j.a((Object)this.g, (Object)hxo.g) || !w4j.a((Object)this.h, (Object)hxo.h) || !w4j.a((Object)this.i, (Object)hxo.i) || !w4j.a((Object)this.j, (Object)hxo.j)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.o((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e, (Object)this.f, (Object)this.g, (Object)this.h, (Object)this.i, (Object)this.j);
    }
}
