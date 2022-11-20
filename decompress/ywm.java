import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ywm extends kmp
{
    public final uf3 c;
    
    public ywm(final String s, final uf3 c) {
        super(s);
        this.c = c;
    }
    
    @Override
    public final kmp b(final Map<String, String> map) {
        final String a = super.a;
        final uf3 c = this.c;
        return new ywm(a, new uf3(c.a, c.b, this.a(c.c, map)));
    }
}
