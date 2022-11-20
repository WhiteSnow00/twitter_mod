// 
// Decompiled by Procyon v0.6.0
// 

public final class yjj extends asd implements qjj
{
    public final qsb<ltd, fzv> E0;
    public long F0;
    
    public yjj(final qsb<? super ltd, fzv> e0, final qsb<? super zrd, fzv> qsb) {
        final wrd$a a = wrd.a;
        czd.f((Object)e0, "onSizeChanged");
        czd.f((Object)a, "inspectorInfo");
        super((qsb)a);
        this.E0 = (qsb<ltd, fzv>)e0;
        this.F0 = rp9.t(Integer.MIN_VALUE, Integer.MIN_VALUE);
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
    
    public final void d(final long f0) {
        if (!ltd.a(this.F0, f0)) {
            this.E0.invoke((Object)new ltd(f0));
            this.F0 = f0;
        }
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof yjj && czd.a((Object)this.E0, (Object)((yjj)o).E0));
    }
    
    public final int hashCode() {
        return this.E0.hashCode();
    }
}
