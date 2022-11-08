// 
// Decompiled by Procyon v0.6.0
// 

public final class a48 extends gk1
{
    public final long g;
    public final evl h;
    
    public a48(final a48.a48$a a48$a) {
        super((a)a48$a);
        this.g = a48$a.f;
        this.h = a48$a.g;
    }
    
    @Override
    public final ig7 a() {
        return ig7.H0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof a48)) {
                return b2;
            }
            final a48 a48 = (a48)o;
            final boolean b3 = super.equals(a48) && this.g == a48.g && this.h.a(a48.h);
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)super.hashCode(), (Object)this.g, (Object)this.h);
    }
}
