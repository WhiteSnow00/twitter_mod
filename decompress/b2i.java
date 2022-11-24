import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b2i extends pue implements stb<c2i, vzv>
{
    public final z1i F0;
    
    public b2i(final z1i f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final c2i c2i = (c2i)o;
        e0e.f((Object)c2i, "$this$distinct");
        final List<j1i> a = c2i.a;
        if (a != null) {
            this.F0.F0.d((p4e)new zkf((Iterable)a));
        }
        return vzv.a;
    }
}
