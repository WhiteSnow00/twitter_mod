import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wr4 extends cvj
{
    public final long H0;
    public float I0;
    public sr4 J0;
    public final long K0;
    
    public wr4(final long h0) {
        this.H0 = h0;
        this.I0 = 1.0f;
        Objects.requireNonNull(mcq.Companion);
        this.K0 = mcq.c;
    }
    
    public final boolean b(final float i0) {
        this.I0 = i0;
        return true;
    }
    
    public final boolean e(final sr4 j0) {
        this.J0 = j0;
        return true;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wr4 && pr4.c(this.H0, ((wr4)o).H0));
    }
    
    public final long h() {
        return this.K0;
    }
    
    public final int hashCode() {
        return pr4.i(this.H0);
    }
    
    public final void j(final ld9 ld9) {
        zzd.f((Object)ld9, "<this>");
        kd9.j(ld9, this.H0, 0L, 0L, this.I0, (uau)null, this.J0, 0, 86, (Object)null);
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("ColorPainter(color=");
        g.append((Object)pr4.j(this.H0));
        g.append(')');
        return g.toString();
    }
}
