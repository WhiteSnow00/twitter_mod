// 
// Decompiled by Procyon v0.6.0
// 

public final class ob1 extends c9g
{
    public final long a;
    
    public ob1(final long a) {
        this.a = a;
    }
    
    @Override
    public final long b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof c9g) {
            if (this.a != ((c9g)o).b()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return 0xF4243 ^ (int)(a ^ a >>> 32);
    }
    
    @Override
    public final String toString() {
        return ang.c(ehk.f("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
