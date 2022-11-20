import java.util.Objects;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfg
{
    public static final ehp<nsb<wfj>> a;
    
    static {
        a = new ehp("MagnifierPositionInRoot", (ftb)dhp.D0);
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 28;
    }
    
    public static okh b(final okh okh, final qsb qsb, final ifg ifg, final qsb qsb2) {
        final yeg d0 = yeg.D0;
        czd.f((Object)okh, "<this>");
        czd.f((Object)d0, "magnifierCenter");
        czd.f((Object)ifg, "style");
        final wrd$a a = wrd.a;
        final wrd$a a2 = wrd.a;
        Object o;
        final okh$a okh$a = (okh$a)(o = okh.Companion);
        if (a()) {
            Objects.requireNonNull(uhk.Companion);
            if (!a()) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
            Object o2;
            if (Build$VERSION.SDK_INT == 28) {
                o2 = vhk.a;
            }
            else {
                o2 = whk.a;
            }
            czd.f((Object)okh$a, "<this>");
            o = w66.b((okh)okh$a, (itb)new gfg(qsb, (qsb)d0, Float.NaN, qsb2, (uhk)o2, ifg));
        }
        return wrd.a(okh, (okh)o);
    }
}
