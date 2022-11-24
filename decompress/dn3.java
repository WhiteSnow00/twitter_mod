// 
// Decompiled by Procyon v0.6.0
// 

public final class dn3
{
    public static final nmp<dn3> c;
    public static final dn3 d;
    public final int a;
    public final long b;
    
    static {
        dn3.c = (tx6)rx6.b(new cmp[] { new cmp((Class)dn3.class, (nmp)new dn3.dn3$b()) });
        final dn3.dn3$a dn3$a = new dn3.dn3$a();
        dn3$a.a = -1;
        d = (dn3)((z4j)dn3$a).e();
    }
    
    public dn3(final dn3.dn3$a dn3$a) {
        this.b = dn3$a.b;
        this.a = dn3$a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && dn3.class == o.getClass()) {
            final dn3 dn3 = (dn3)o;
            if (!o5j.a((Object)this.a, (Object)dn3.a) || !o5j.a((Object)this.b, (Object)dn3.b)) {
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
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("CarouselSocialProof{type='");
        f.append(this.a);
        f.append('\'');
        f.append(", count=");
        f.append(this.b);
        f.append('\'');
        f.append('}');
        return f.toString();
    }
}
