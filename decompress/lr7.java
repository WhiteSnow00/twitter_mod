import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lr7 extends ste implements qsb<String, rz5>
{
    public final ir7 D0;
    
    public lr7(final ir7 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final String s = (String)o;
        czd.f((Object)s, "query");
        Objects.requireNonNull(this.D0);
        cbw.b((elm)new af4(ir7.l));
        return this.D0.a.c(s);
    }
}
