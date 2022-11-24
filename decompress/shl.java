// 
// Decompiled by Procyon v0.6.0
// 

public final class shl
{
    public static final a Companion;
    public static final shl d;
    public final float a;
    public final nk4<Float> b;
    public final int c;
    
    static {
        Companion = new a();
        d = new shl(0.0f, (nk4<Float>)new mk4(0.0f), 0);
    }
    
    public shl(final float a, final nk4<Float> b, final int c) {
        e0e.f((Object)b, "range");
        this.a = a;
        this.b = b;
        this.c = c;
        if (Float.isNaN(a) ^ true) {
            return;
        }
        throw new IllegalArgumentException("current must not be NaN".toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof shl)) {
            return false;
        }
        final float a = this.a;
        final shl shl = (shl)o;
        return a == shl.a && e0e.a((Object)this.b, (Object)shl.b) && this.c == shl.c;
    }
    
    @Override
    public final int hashCode() {
        return (this.b.hashCode() + Float.floatToIntBits(this.a) * 31) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("ProgressBarRangeInfo(current=");
        f.append(this.a);
        f.append(", range=");
        f.append(this.b);
        f.append(", steps=");
        return gwl.x(f, this.c, ')');
    }
    
    public static final class a
    {
    }
}
