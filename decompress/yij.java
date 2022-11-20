// 
// Decompiled by Procyon v0.6.0
// 

public final class yij extends asd implements xij
{
    public final qsb<eve, fzv> E0;
    
    public yij(final qsb<? super eve, fzv> e0, final qsb<? super zrd, fzv> qsb) {
        final wrd$a a = wrd.a;
        czd.f((Object)e0, "callback");
        czd.f((Object)a, "inspectorInfo");
        super((qsb)a);
        this.E0 = (qsb<eve, fzv>)e0;
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
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof yij && czd.a((Object)this.E0, (Object)((yij)o).E0));
    }
    
    public final int hashCode() {
        return this.E0.hashCode();
    }
    
    public final void j(final eve eve) {
        this.E0.invoke((Object)eve);
    }
}
