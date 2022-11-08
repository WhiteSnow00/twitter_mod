// 
// Decompiled by Procyon v0.6.0
// 

public final class n1h
{
    public static final n1h.n1h$b b;
    public final fw6 a;
    
    static {
        b = new n1h.n1h$b();
    }
    
    public n1h(final n1h.n1h$a n1h$a) {
        this.a = n1h$a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && n1h.class == o.getClass() && w4j.a((Object)this.a, (Object)((n1h)o).a));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
}
