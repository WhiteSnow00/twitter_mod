import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eo9<T> extends zll<T>
{
    public final hiq<T> b;
    
    public eo9(final hiq<T> b, final nsb<? extends T> nsb) {
        czd.f((Object)b, "policy");
        czd.f((Object)nsb, "defaultFactory");
        super((nsb)nsb);
        this.b = b;
    }
    
    public final m8r<T> a(final T value, final x66 x66, final int n) {
        x66.x(-84026900);
        final n96$b a = n96.a;
        x66.x(-492369756);
        final Object y = x66.y();
        Objects.requireNonNull(x66.Companion);
        Object p3 = y;
        if (y == x66$a.b) {
            p3 = blz.P(value, this.b);
            x66.p(p3);
        }
        x66.O();
        final puh puh = (puh)p3;
        puh.setValue((Object)value);
        x66.O();
        return (m8r<T>)puh;
    }
}
