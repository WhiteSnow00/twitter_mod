// 
// Decompiled by Procyon v0.6.0
// 

public final class kuu
{
    public final String a;
    public final int b;
    public final String c;
    
    public kuu(final String a, final int b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && kuu.class == o.getClass()) {
            final kuu kuu = (kuu)o;
            if (this.b != kuu.b || !this.a.equals(kuu.a)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
}
