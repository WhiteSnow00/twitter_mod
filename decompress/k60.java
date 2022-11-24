// 
// Decompiled by Procyon v0.6.0
// 

public final class k60 extends pue implements stb<v73, ud9>
{
    public final long F0;
    public final boolean G0;
    public final frm H0;
    public final boolean I0;
    
    public k60(final long f0, final boolean g0, final frm h0, final boolean i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final v73 v73 = (v73)o;
        e0e.f((Object)v73, "$this$drawWithCache");
        return v73.d((stb)new j60(this.G0, this.H0, this.I0, h60.d(v73, aeq.d(v73.c()) / 2.0f), vr4$a.b(vr4.Companion, this.F0)));
    }
}
