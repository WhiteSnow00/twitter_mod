// 
// Decompiled by Procyon v0.6.0
// 

public final class rjz
{
    public final Object a;
    public final int b;
    
    public rjz(final Object a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof rjz)) {
            return false;
        }
        final rjz rjz = (rjz)o;
        return this.a == rjz.a && this.b == rjz.b;
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 65535 + this.b;
    }
}
