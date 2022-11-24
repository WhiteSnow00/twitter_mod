// 
// Decompiled by Procyon v0.6.0
// 

public final class rmt extends ort
{
    public final ilt a;
    
    public rmt(final a a) {
        final ilt a2 = a.a;
        vmw.g((Object)a2);
        this.a = a2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof rmt && o5j.a((Object)this.a, (Object)((rmt)o).a));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.a);
    }
    
    public static final class a extends z4j<rmt>
    {
        public ilt a;
        
        public final Object i() {
            return new rmt(this);
        }
    }
}
