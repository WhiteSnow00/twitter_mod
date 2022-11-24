import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aek<V, R>
{
    public final z3g a;
    public final cek<V, R> b;
    public a c;
    
    public aek(final mdq mdq, final z3g a, final cek<V, R> b, final kcm kcm) {
        this.a = a;
        this.b = b;
        final b39 subscribe = ((t5j)b.c).subscribe((rk6)new xvd((Object)this, (Object)mdq, 6));
        Objects.requireNonNull(subscribe);
        kcm.i((sj)new jjd(subscribe, 9));
    }
    
    public interface a
    {
        void w0(final zbv p0);
    }
}
