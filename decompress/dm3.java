// 
// Decompiled by Procyon v0.6.0
// 

public final class dm3
{
    public static final rlp<dm3> c;
    public static final dm3 d;
    public final int a;
    public final long b;
    
    static {
        dm3.c = (nw6)lw6.b(new glp[] { new glp((Class)dm3.class, (rlp)new dm3.dm3$b()) });
        final dm3.dm3$a dm3$a = new dm3.dm3$a();
        dm3$a.a = -1;
        d = (dm3)((n4j)dm3$a).e();
    }
    
    public dm3(final dm3.dm3$a dm3$a) {
        this.b = dm3$a.b;
        this.a = dm3$a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && dm3.class == o.getClass()) {
            final dm3 dm3 = (dm3)o;
            if (!c5j.a((Object)this.a, (Object)dm3.a) || !c5j.a((Object)this.b, (Object)dm3.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.a, (Object)this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("CarouselSocialProof{type='");
        j.append(this.a);
        j.append('\'');
        j.append(", count=");
        j.append(this.b);
        j.append('\'');
        j.append('}');
        return j.toString();
    }
}
