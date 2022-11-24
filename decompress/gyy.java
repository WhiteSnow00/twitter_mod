import android.graphics.Rect;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyy implements f000, c0z
{
    public static final gyy F0;
    public static final gyy G0;
    
    static {
        F0 = new gyy();
        G0 = new gyy();
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return stz.G0.b().d();
    }
    
    public Object c(final Object o) {
        final cyz cyz = (cyz)o;
        final List y0 = iuk.Y0(cyz.G0);
        String i0;
        if (egz.A(cyz.I0)) {
            i0 = "";
        }
        else {
            i0 = cyz.I0;
        }
        final Rect u0 = iuk.U0(y0);
        String k0;
        if (egz.A(cyz.K0)) {
            k0 = "und";
        }
        else {
            k0 = cyz.K0;
        }
        return new cfs$a(i0, u0, y0, k0);
    }
}
