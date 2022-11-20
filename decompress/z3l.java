// 
// Decompiled by Procyon v0.6.0
// 

public final class z3l
{
    public final int a;
    public final a4l b;
    
    public z3l(final int a, final a4l b) {
        da8.m(a, "state");
        czd.f((Object)b, "paymentSource");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof z3l)) {
            return false;
        }
        final z3l z3l = (z3l)o;
        return this.a == z3l.a && this.b == z3l.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + ib0.E(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final a4l b = this.b;
        final StringBuilder j = fu8.j("ProductSubscription(state=");
        j.append(m1f.p(a));
        j.append(", paymentSource=");
        j.append(b);
        j.append(")");
        return j.toString();
    }
}
