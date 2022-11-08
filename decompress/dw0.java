import java.util.Objects;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dw0
{
    public static dw0 a() {
        return ((jw0)((v4j)ir0.a()).B((Class)jw0.class)).e5();
    }
    
    public abstract Set<cw0<?>> b();
    
    public abstract void c(final jci p0);
    
    public abstract <S> cw0<S> d(final cw0<S> p0);
    
    public final <S> cw0<S> e(final fw0<S> fw0) {
        final jj1 jj1 = (jj1)fw0;
        Objects.requireNonNull(jj1);
        return this.d((cw0<S>)new cw0((fw0)jj1));
    }
}
