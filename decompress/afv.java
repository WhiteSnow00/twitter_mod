// 
// Decompiled by Procyon v0.6.0
// 

public final class afv
{
    public final String a;
    
    public afv(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (o == null) {
                return b2;
            }
            b2 = b;
            if (!(o instanceof afv)) {
                return b2;
            }
            final afv afv = (afv)o;
            final boolean b3 = this == afv || this.a == afv.a;
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
}
