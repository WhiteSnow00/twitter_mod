import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r2v extends atc<Object, Object>
{
    public final atc<Object, Object> I0;
    public final stb<Object, Object> J0;
    
    public r2v(final atc<Object, Object> i0, final stb<Object, Object> j0) {
        this.J0 = j0;
        this.I0 = i0;
    }
    
    public final void m(final int n, final InputStream inputStream, final int n2, final String s, final String s2) {
        ((lsc)this.I0).m(n, inputStream, n2, s, s2);
        final atc<Object, Object> i0 = this.I0;
        super.F0 = i0.F0;
        final Object g0 = i0.G0;
        Object invoke;
        if (g0 != null) {
            invoke = this.J0.invoke(g0);
        }
        else {
            invoke = null;
        }
        super.G0 = invoke;
    }
    
    @Override
    public final qsm x() {
        return this.I0.x();
    }
}
