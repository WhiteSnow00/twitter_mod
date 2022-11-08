// 
// Decompiled by Procyon v0.6.0
// 

public final class fw6
{
    public static final fw6.fw6$a b;
    public final String a;
    
    static {
        b = new fw6.fw6$a();
    }
    
    public fw6(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && fw6.class == o.getClass() && w4j.a((Object)this.a, (Object)((fw6)o).a));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
}
