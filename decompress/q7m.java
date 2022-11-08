// 
// Decompiled by Procyon v0.6.0
// 

public final class q7m
{
    public static final alp<q7m> c;
    public final String a;
    public final String b;
    
    static {
        q7m.c = new q7m.q7m$a();
    }
    
    public q7m(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && q7m.class == o.getClass()) {
            final q7m q7m = (q7m)o;
            if (!w4j.a((Object)this.a, (Object)q7m.a) || !w4j.a((Object)this.b, (Object)q7m.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
}
