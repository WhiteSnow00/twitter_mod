import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpl extends pue implements stb<Throwable, vzv>
{
    public final kpl F0;
    
    public jpl(final kpl f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        Objects.requireNonNull(this.F0);
        ffe.a("card_view", "bind_error");
        return vzv.a;
    }
}
