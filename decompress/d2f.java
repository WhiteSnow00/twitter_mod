import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d2f extends pue implements stb<khk$a, vzv>
{
    public final List<h2f> F0;
    public final h2f G0;
    
    public d2f(final List<h2f> f0, final h2f g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final khk$a khk$a = (khk$a)o;
        e0e.f((Object)khk$a, "$this$invoke");
        final List<h2f> f0 = this.F0;
        final h2f g0 = this.G0;
        for (int size = f0.size(), i = 0; i < size; ++i) {
            final h2f h2f = f0.get(i);
            if (h2f != g0) {
                h2f.f(khk$a);
            }
        }
        final h2f g2 = this.G0;
        if (g2 != null) {
            g2.f(khk$a);
        }
        return vzv.a;
    }
}
