import java.util.Map;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ywe extends jwe$e
{
    public final /* synthetic */ xwe b;
    public final /* synthetic */ gub<flr, jj6, hqg> c;
    
    public ywe(final xwe b, final gub<? super flr, ? super jj6, ? extends hqg> c, final String s) {
        this.b = b;
        this.c = (gub<flr, jj6, hqg>)c;
        super(s);
    }
    
    public final hqg b(final jqg jqg, final List<? extends dqg> list, final long n) {
        zzd.f((Object)jqg, "$this$measure");
        zzd.f((Object)list, "measurables");
        final xwe.xwe$b g = this.b.g;
        final tve layoutDirection = ((wzd)jqg).getLayoutDirection();
        Objects.requireNonNull(g);
        zzd.f((Object)layoutDirection, "<set-?>");
        g.C0 = layoutDirection;
        this.b.g.D0 = ((dp8)jqg).getDensity();
        this.b.g.E0 = ((dp8)jqg).p0();
        final xwe b = this.b;
        b.d = 0;
        final hqg hqg = (hqg)this.c.invoke((Object)b.g, (Object)new jj6(n));
        final xwe b2 = this.b;
        return (hqg)new hqg() {
            public final /* synthetic */ int c = b2.d;
            
            public final void c() {
                b2.d = this.c;
                hqg.c();
                final xwe b = b2;
                b.a(b.d);
            }
            
            public final Map<ex, Integer> d() {
                return hqg.d();
            }
            
            public final int getHeight() {
                return hqg.getHeight();
            }
            
            public final int getWidth() {
                return hqg.getWidth();
            }
        };
    }
}
