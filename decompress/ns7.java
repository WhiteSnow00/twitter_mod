import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ns7 extends pue implements stb<String, x06>
{
    public final ks7 F0;
    
    public ns7(final ks7 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final String s = (String)o;
        e0e.f((Object)s, "query");
        Objects.requireNonNull(this.F0);
        sbw.b((tlm)new fg4(ks7.l));
        return this.F0.a.c(s);
    }
}
