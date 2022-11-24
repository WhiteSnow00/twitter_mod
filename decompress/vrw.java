import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vrw implements ccx
{
    public final List<pmd> a;
    
    public vrw(final List<? extends pmd> a) {
        e0e.f((Object)a, "pageItems");
        this.a = (List<pmd>)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof vrw && e0e.a((Object)this.a, (Object)((vrw)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("VerificationLandingPageViewState(pageItems=", (List)this.a, ")");
    }
}
