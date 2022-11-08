import android.graphics.Shader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class skq extends oq2
{
    public final long a;
    
    public skq(final long a) {
        this.a = a;
    }
    
    public final void a(long n, final avj avj, final float n2) {
        avj.b(1.0f);
        if (n2 != 1.0f) {
            n = this.a;
            n = pr4.b(n, pr4.d(n) * n2);
        }
        else {
            n = this.a;
        }
        avj.k(n);
        if (avj.r() != null) {
            avj.q(null);
        }
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof skq && pr4.c(this.a, ((skq)o).a));
    }
    
    public final int hashCode() {
        return pr4.i(this.a);
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("SolidColor(value=");
        g.append((Object)pr4.j(this.a));
        g.append(')');
        return g.toString();
    }
}
