// 
// Decompiled by Procyon v0.6.0
// 

public final class vqg
{
    public final int a;
    public final r89 b;
    
    public vqg(final r89 r89) {
        final int d0 = r89.D0;
        int n = 1;
        if (d0 == 1) {
            n = 0;
        }
        this(r89, n);
    }
    
    public vqg(final r89 b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final jw9 a(final int n) {
        return this.b.b(n);
    }
    
    public final boolean b() {
        return this.b.b(3) != null;
    }
    
    public final void c(final vqg vqg) {
        final r89 b = this.b;
        r89 b2;
        if (vqg == null) {
            b2 = null;
        }
        else {
            b2 = vqg.b;
        }
        b.c(b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && vqg.class == o.getClass()) {
            final vqg vqg = (vqg)o;
            if (this.a != vqg.a || !this.b.equals((Object)vqg.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.a;
    }
}
