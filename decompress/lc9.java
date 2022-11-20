import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lc9 implements jc9
{
    public final d73 D0;
    public final qsb<d73, rc9> E0;
    
    public lc9(final d73 d0, final qsb<? super d73, rc9> e0) {
        czd.f((Object)d0, "cacheDrawScope");
        czd.f((Object)e0, "onBuildDrawCache");
        this.D0 = d0;
        this.E0 = (qsb<d73, rc9>)e0;
    }
    
    public final okh E(final okh okh) {
        return k6e.a((okh)this, okh);
    }
    
    public final boolean H(final qsb qsb) {
        return da8.a((okh$b)this, qsb);
    }
    
    public final Object X(final Object o, final ftb ftb) {
        czd.f((Object)ftb, "operation");
        return ftb.invoke(o, (Object)this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lc9)) {
            return false;
        }
        final d73 d0 = this.D0;
        final lc9 lc9 = (lc9)o;
        return czd.a((Object)d0, (Object)lc9.D0) && czd.a((Object)this.E0, (Object)lc9.E0);
    }
    
    @Override
    public final int hashCode() {
        return this.E0.hashCode() + this.D0.hashCode() * 31;
    }
    
    public final void i0(final yr2 d0) {
        czd.f((Object)d0, "params");
        final d73 d2 = this.D0;
        Objects.requireNonNull(d2);
        d2.D0 = d0;
        d2.E0 = null;
        this.E0.invoke((Object)d2);
        if (d2.E0 != null) {
            return;
        }
        throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("DrawContentCacheModifier(cacheDrawScope=");
        j.append(this.D0);
        j.append(", onBuildDrawCache=");
        j.append(this.E0);
        j.append(')');
        return j.toString();
    }
    
    public final void x(final yk6 yk6) {
        czd.f((Object)yk6, "<this>");
        final rc9 e0 = this.D0.E0;
        czd.c((Object)e0);
        e0.a.invoke((Object)yk6);
    }
}
