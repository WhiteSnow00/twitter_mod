// 
// Decompiled by Procyon v0.6.0
// 

public final class vs4 implements jkh
{
    public final jkh C0;
    public final jkh D0;
    
    public vs4(final jkh c0, final jkh d0) {
        zzd.f((Object)c0, "outer");
        zzd.f((Object)d0, "inner");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final boolean H(final rtb<? super b, Boolean> rtb) {
        zzd.f((Object)rtb, "predicate");
        return this.C0.H(rtb) && this.D0.H(rtb);
    }
    
    @Override
    public final <R> R X(final R r, final gub<? super R, ? super b, ? extends R> gub) {
        zzd.f((Object)gub, "operation");
        return this.D0.X(this.C0.X(r, gub), gub);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof vs4) {
            final jkh c0 = this.C0;
            final vs4 vs4 = (vs4)o;
            if (zzd.a((Object)c0, (Object)vs4.C0) && zzd.a((Object)this.D0, (Object)vs4.D0)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.D0.hashCode() * 31 + this.C0.hashCode();
    }
    
    @Override
    public final String toString() {
        return xpa.m(ffa.l('['), (String)this.X("", (gub<? super String, ? super b, ? extends String>)vs4$a.C0), ']');
    }
}
