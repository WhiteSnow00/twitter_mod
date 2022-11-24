// 
// Decompiled by Procyon v0.6.0
// 

public final class jjl implements f00
{
    public final ijl a;
    public final String b;
    public final long c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    
    public jjl(final jjl.jjl$a jjl$a) {
        this.a = jjl$a.a;
        this.c = jjl$a.b;
        this.d = jjl$a.c;
        this.b = jjl$a.d;
        this.e = jjl$a.e;
        this.f = jjl$a.f;
        this.g = jjl$a.g;
        this.h = jjl$a.h;
        this.k = jjl$a.k;
        this.i = jjl$a.i;
        this.j = jjl$a.j;
    }
    
    public static jjl.jjl$a e(final ijl ijl, final gjl gjl) {
        final jjl.jjl$a jjl$a = new jjl.jjl$a(ijl);
        jjl$a.d = gjl.a;
        jjl$a.e = gjl.d();
        jjl$a.b = gjl.c;
        return jjl$a;
    }
    
    public final String a() {
        return null;
    }
    
    public final boolean b() {
        return jba.b((tlm)this);
    }
    
    public final boolean c() {
        return jba.e((tlm)this);
    }
    
    public final nso d() {
        return nso.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && jjl.class == o.getClass()) {
            final jjl jjl = (jjl)o;
            if (this.a != jjl.a || this.c != jjl.c || this.e != jjl.e || !o5j.a((Object)this.b, (Object)jjl.b) || !o5j.a((Object)this.d, (Object)jjl.d) || !o5j.a((Object)null, (Object)null) || !o5j.a((Object)null, (Object)null) || !o5j.a((Object)this.f, (Object)jjl.f) || !o5j.a((Object)this.h, (Object)jjl.h) || !o5j.a((Object)this.k, (Object)jjl.k) || !o5j.a((Object)this.i, (Object)jjl.i) || !o5j.a((Object)this.g, (Object)jjl.g) || !o5j.a((Object)this.j, (Object)jjl.j)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.p((Object)this.a, new Object[] { this.c, this.d, this.b, this.e, null, null, this.f, this.h, this.k, this.i, this.g, this.j });
    }
}
