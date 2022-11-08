// 
// Decompiled by Procyon v0.6.0
// 

public final class z1b implements tox
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public z1b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }
    
    @Override
    public final int a(final dp8 dp8) {
        zzd.f((Object)dp8, "density");
        return this.b;
    }
    
    @Override
    public final int b(final dp8 dp8, final tve tve) {
        zzd.f((Object)dp8, "density");
        zzd.f((Object)tve, "layoutDirection");
        return this.c;
    }
    
    @Override
    public final int c(final dp8 dp8) {
        zzd.f((Object)dp8, "density");
        return this.d;
    }
    
    @Override
    public final int d(final dp8 dp8, final tve tve) {
        zzd.f((Object)dp8, "density");
        zzd.f((Object)tve, "layoutDirection");
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof z1b)) {
            return false;
        }
        final int a = this.a;
        final z1b z1b = (z1b)o;
        if (a != z1b.a || this.b != z1b.b || this.c != z1b.c || this.d != z1b.d) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("Insets(left=");
        g.append(this.a);
        g.append(", top=");
        g.append(this.b);
        g.append(", right=");
        g.append(this.c);
        g.append(", bottom=");
        return y70.y(g, this.d, ')');
    }
}
