// 
// Decompiled by Procyon v0.6.0
// 

public final class dic
{
    public final hfv a;
    
    public dic(final dic.dic$a dic$a) {
        final hfv a = dic$a.a;
        pf8.r(a);
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && dic.class == o.getClass() && w4j.a((Object)this.a, (Object)((dic)o).a));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
}
