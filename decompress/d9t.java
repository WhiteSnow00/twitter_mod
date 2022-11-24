// 
// Decompiled by Procyon v0.6.0
// 

public final class d9t
{
    public static final nmp<d9t> c;
    public final String a;
    public final c9t b;
    
    static {
        d9t.c = new d9t.d9t$a();
    }
    
    public d9t(final String a, final c9t b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && d9t.class == o.getClass()) {
            final d9t d9t = (d9t)o;
            if (!o5j.a((Object)this.a, (Object)d9t.a) || !o5j.a((Object)this.b, (Object)d9t.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.a, (Object)this.b);
    }
}
