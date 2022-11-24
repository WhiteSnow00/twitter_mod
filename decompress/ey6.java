import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ey6 extends pue implements stb<List<qjs>, Boolean>
{
    public final pis F0;
    
    public ey6(final pis f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        e0e.f((Object)list, "it");
        boolean b;
        if (this.F0.c() != null) {
            final rjs c = this.F0.c();
            e0e.c((Object)c);
            list.add(c.a);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
