// 
// Decompiled by Procyon v0.6.0
// 

public final class vva
{
    public static final alp<vva> b;
    public final String a;
    
    static {
        vva.b = new vva.vva$a();
    }
    
    public vva(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && vva.class == o.getClass() && w4j.a((Object)this.a, (Object)((vva)o).a));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
}
