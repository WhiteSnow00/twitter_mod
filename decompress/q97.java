// 
// Decompiled by Procyon v0.6.0
// 

public final class q97
{
    public static final s4j<q97> c;
    public final String a;
    public final String b;
    
    static {
        q97.c = new q97.q97$a();
    }
    
    public q97(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && q97.class == o.getClass()) {
            final q97 q97 = (q97)o;
            return w4j.a((Object)this.a, (Object)q97.a) && w4j.a((Object)this.b, (Object)q97.b);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
}
