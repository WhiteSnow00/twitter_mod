// 
// Decompiled by Procyon v0.6.0
// 

public final class dsv
{
    public static final nmp<dsv> c;
    public final String a;
    public final c9t b;
    
    static {
        dsv.c = new dsv.dsv$a();
    }
    
    public dsv(final String a, final c9t b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && dsv.class == o.getClass()) {
            final dsv dsv = (dsv)o;
            if (!o5j.a((Object)this.a, (Object)dsv.a) || !o5j.a((Object)this.b, (Object)dsv.b)) {
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
