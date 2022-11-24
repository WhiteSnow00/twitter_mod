// 
// Decompiled by Procyon v0.6.0
// 

public final class nsp implements zm6
{
    public final String a;
    public final int b;
    public final n80 c;
    public final boolean d;
    
    public nsp(final String a, final int b, final n80 c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final wl6 a(final ceg ceg, final ym1 ym1) {
        return (wl6)new dsp(ceg, ym1, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("ShapePath{name=");
        f.append(this.a);
        f.append(", index=");
        return gwl.x(f, this.b, '}');
    }
}
