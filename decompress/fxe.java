import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxe extends e
{
    public final exe b;
    public final hub<vmr, vj6, arg> c;
    
    public fxe(final exe b, final hub<? super vmr, ? super vj6, ? extends arg> c, final String s) {
        this.b = b;
        this.c = (hub<vmr, vj6, arg>)c;
        super(s);
    }
    
    @Override
    public final arg b(final crg crg, final List<? extends wqg> list, final long n) {
        e0e.f((Object)crg, "$this$measure");
        e0e.f((Object)list, "measurables");
        final exe.b g = this.b.g;
        final cwe layoutDirection = ((b0e)crg).getLayoutDirection();
        Objects.requireNonNull(g);
        e0e.f((Object)layoutDirection, "<set-?>");
        g.F0 = layoutDirection;
        this.b.g.G0 = ((rp8)crg).getDensity();
        this.b.g.H0 = ((rp8)crg).p0();
        final exe b = this.b;
        b.d = 0;
        final arg arg = (arg)this.c.invoke((Object)b.g, (Object)new vj6(n));
        final exe b2 = this.b;
        return (arg)new fxe$a(arg, b2, b2.d);
    }
}
