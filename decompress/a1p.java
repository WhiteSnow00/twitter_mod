// 
// Decompiled by Procyon v0.6.0
// 

public final class a1p implements t8g
{
    public static final a Companion;
    public static final alp<a1p> c;
    public final long a;
    public final long b;
    
    static {
        Companion = new a();
        a1p.c = new a1p.a1p$b();
    }
    
    public a1p(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a1p)) {
            return false;
        }
        final a1p a1p = (a1p)o;
        return this.a == a1p.a && this.b == a1p.b;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        return n * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        return b8b.r(c0.D("ScribeLogSequenceNumber(sequenceStartTimestamp=", this.a, ", sequenceNumber="), this.b, ")");
    }
    
    public static final class a
    {
    }
}
