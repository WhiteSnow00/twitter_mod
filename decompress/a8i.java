import com.twitter.narrowcast.bottomsheet.NarrowcastBottomSheetViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8i extends ste implements itb<qye, x66, Integer, fzv>
{
    public final NarrowcastBottomSheetViewModel D0;
    public final m8r<y8i> E0;
    
    public a8i(final NarrowcastBottomSheetViewModel d0, final m8r<? extends y8i> e0) {
        this.D0 = d0;
        this.E0 = (m8r<y8i>)e0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final qye qye = (qye)o;
        final x66 x66 = (x66)o2;
        final int intValue = ((Number)o3).intValue();
        czd.f((Object)qye, "$this$item");
        if ((intValue & 0x51) == 0x10 && x66.i()) {
            x66.H();
        }
        else {
            final n96$b a = n96.a;
            s6i.b((okh)null, x66, 0, 1);
            final y8i$c a2 = y8i$c.a;
            final boolean a3 = czd.a((Object)s7i.e((m8r)this.E0), (Object)a2);
            final z7i z7i = new z7i((Object)this.D0);
            final okh$a companion = okh.Companion;
            final xgh a4 = xgh.a;
            s7i.a((y8i)a2, a3, (qsb)z7i, nza.B1((okh)companion, (zrj)xgh.b), 0.0f, (nsb)null, x66, 8, 48);
        }
        return fzv.a;
    }
}
