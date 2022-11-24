// 
// Decompiled by Procyon v0.6.0
// 

public final class bxa implements vrd
{
    public final String b;
    
    public bxa(final a a) {
        this.b = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && bxa.class == o.getClass() && o5j.a((Object)this.b, (Object)((bxa)o).b));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.b);
    }
    
    public static final class a extends z4j<bxa>
    {
        public String a;
        
        public final Object i() {
            return new bxa(this);
        }
    }
}
