// 
// Decompiled by Procyon v0.6.0
// 

public final class c86
{
    public static final kub<teb, d86, Integer, dlh> a;
    public static final kub<rfb, d86, Integer, dlh> b;
    
    static {
        c86.a = c86$a.F0;
        c86.b = c86$b.F0;
    }
    
    public static final dlh a(final dlh dlh, final stb<? super btd, vzv> stb, final kub<? super dlh, ? super d86, ? super Integer, ? extends dlh> kub) {
        e0e.f((Object)dlh, "<this>");
        e0e.f((Object)stb, "inspectorInfo");
        e0e.f((Object)kub, "factory");
        return dlh.E((dlh)new z76(stb, kub));
    }
    
    public static dlh b(final dlh dlh, final kub kub) {
        final ysd$a a = ysd.a;
        return a(dlh, (stb<? super btd, vzv>)ysd.a, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)kub);
    }
    
    public static final dlh c(final d86 d86, dlh dlh) {
        e0e.f((Object)d86, "<this>");
        e0e.f((Object)dlh, "modifier");
        if (dlh.H((stb)c86$c.F0)) {
            return dlh;
        }
        d86.x(1219399079);
        dlh = (dlh)dlh.X((Object)dlh.Companion, (hub)new hub<dlh, dlh.b, dlh>(d86) {
            public final d86 F0;
            
            public final Object invoke(final Object o, final Object o2) {
                final dlh dlh = (dlh)o;
                final dlh.b b = (dlh.b)o2;
                e0e.f((Object)dlh, "acc");
                e0e.f((Object)b, "element");
                final boolean b2 = b instanceof z76;
                final Integer value = 0;
                Object o3;
                if (b2) {
                    final kub<dlh, d86, Integer, dlh> g0 = ((z76)b).G0;
                    e0e.d((Object)g0, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    okv.e((Object)g0, 3);
                    o3 = c86.c(this.F0, (dlh)g0.h0((Object)dlh.Companion, (Object)this.F0, (Object)value));
                }
                else {
                    if (b instanceof teb) {
                        final kub<teb, d86, Integer, xeb> a = (kub<teb, d86, Integer, xeb>)c86.a;
                        final kub<teb, d86, Integer, xeb> a2 = (kub<teb, d86, Integer, xeb>)c86.a;
                        e0e.d((Object)a2, "null cannot be cast to non-null type kotlin.Function3<androidx.compose.ui.focus.FocusEventModifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                        okv.e((Object)a2, 3);
                        o3 = ((dlh)b).E((dlh)a2.h0(b, this.F0, value));
                    }
                    else {
                        o3 = b;
                    }
                    if (b instanceof rfb) {
                        final kub<teb, d86, Integer, xeb> a3 = (kub<teb, d86, Integer, xeb>)c86.a;
                        final kub<rfb, d86, Integer, tfb> b3 = (kub<rfb, d86, Integer, tfb>)c86.b;
                        e0e.d((Object)b3, "null cannot be cast to non-null type kotlin.Function3<androidx.compose.ui.focus.FocusRequesterModifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                        okv.e((Object)b3, 3);
                        o3 = ((dlh)o3).E((dlh)b3.h0(b, this.F0, value));
                    }
                }
                return dlh.E((dlh)o3);
            }
        });
        d86.O();
        return dlh;
    }
}
