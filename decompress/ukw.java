// 
// Decompiled by Procyon v0.6.0
// 

public final class ukw
{
    public final String a;
    
    public ukw(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ukw && c5j.a((Object)this.a, (Object)((ukw)o).a));
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.a);
    }
    
    @Override
    public final String toString() {
        String a;
        if ((a = this.a) == null) {
            a = "";
        }
        return a;
    }
}
