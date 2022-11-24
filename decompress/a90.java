import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a90 extends pue implements kub<crg, wqg, vj6, arg>
{
    public final pn6 F0;
    
    public a90(final pn6 f0) {
        this.F0 = f0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final crg crg = (crg)o;
        final wqg wqg = (wqg)o2;
        final long a = ((vj6)o3).a;
        e0e.f((Object)crg, "$this$layout");
        e0e.f((Object)wqg, "measurable");
        final khk w = wqg.W(a);
        return brg.c(crg, w.F0, w.G0, (Map)null, (stb)new z80(w, this.F0), 4, (Object)null);
    }
}
