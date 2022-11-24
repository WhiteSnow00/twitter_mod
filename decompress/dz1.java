// 
// Decompiled by Procyon v0.6.0
// 

public final class dz1
{
    public static final nmp<dz1> c;
    public static final nmp<Object> d;
    public final Object a;
    public final String b;
    
    static {
        dz1.c = new dz1.dz1$a();
        dz1.d = new dz1$a$a();
    }
    
    public dz1(final Object a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof dz1)) {
            return false;
        }
        final dz1 dz1 = (dz1)o;
        if (!o5j.a((Object)this.b, (Object)dz1.b) || !o5j.a(this.a, dz1.a)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g(this.a, (Object)this.b);
    }
    
    @Override
    public final String toString() {
        final Object a = this.a;
        if (a != null) {
            return a.toString();
        }
        return super.toString();
    }
}
