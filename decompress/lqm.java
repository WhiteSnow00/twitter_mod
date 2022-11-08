// 
// Decompiled by Procyon v0.6.0
// 

public final class lqm implements kkb
{
    public final int a;
    public final rlb b;
    public final int c;
    public final qlb d;
    public final int e;
    
    public lqm(final int a, final rlb b, final int c, final qlb d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final int a() {
        return this.e;
    }
    
    public final rlb b() {
        return this.b;
    }
    
    public final int c() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lqm)) {
            return false;
        }
        final int a = this.a;
        final lqm lqm = (lqm)o;
        return a == lqm.a && zzd.a((Object)this.b, (Object)lqm.b) && this.c == lqm.c && zzd.a((Object)this.d, (Object)lqm.d) && this.e == lqm.e;
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (((this.a * 31 + this.b.C0) * 31 + this.c) * 31 + this.e) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("ResourceFont(resId=");
        g.append(this.a);
        g.append(", weight=");
        g.append(this.b);
        g.append(", style=");
        g.append((Object)nlb.a(this.c));
        g.append(", loadingStrategy=");
        g.append((Object)zkb.a(this.e));
        g.append(')');
        return g.toString();
    }
}
