// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pvu
{
    public final int a;
    public final long b;
    
    public pvu(final int a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof pvu)) {
            return false;
        }
        final pvu pvu = (pvu)o;
        if (this.a != pvu.a || this.b != pvu.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return c5j.g((Object)this.a, (Object)this.b);
    }
}
