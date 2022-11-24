import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lld
{
    public static final lml<jld> a;
    
    static {
        lld.a = (gbr)ef6.d((ptb)lld$a.F0);
    }
    
    public static final dlh a(final dlh dlh, final hvd hvd, final jld jld) {
        e0e.f((Object)dlh, "<this>");
        e0e.f((Object)hvd, "interactionSource");
        final ysd$a a = ysd.a;
        return c86.a(dlh, (stb<? super btd, vzv>)ysd.a, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new kub<dlh, d86, Integer, dlh>(jld, hvd) {
            public final jld F0;
            public final hvd G0;
            
            public final Object h0(Object o, Object y, final Object o2) {
                final dlh dlh = (dlh)o;
                final d86 d86 = (d86)y;
                lf.L((Number)o2, dlh, "$this$composed", d86, -353972293);
                final sa6$b a = sa6.a;
                jld jld;
                if ((jld = this.F0) == null) {
                    jld = bli.a;
                }
                final kld a2 = jld.a(this.G0, d86);
                d86.x(1157296644);
                final boolean p3 = d86.P((Object)a2);
                y = d86.y();
                Label_0122: {
                    if (!p3) {
                        Objects.requireNonNull(d86.Companion);
                        if ((o = y) != d86$a.b) {
                            break Label_0122;
                        }
                    }
                    o = new mld(a2);
                    d86.p(o);
                }
                d86.O();
                final mld mld = (mld)o;
                d86.O();
                return mld;
            }
        });
    }
}
