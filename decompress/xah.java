import java.util.HashMap;
import tv.periscope.android.ui.love.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xah implements v6r
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public xah(final c g0) {
        this.F0 = 10;
        this.G0 = g0;
        this.H0 = new HashMap();
    }
    
    public xah(final v6r[] g0) {
        this.F0 = 1024;
        this.G0 = g0;
        this.H0 = new or3();
    }
    
    @Override
    public final StackTraceElement[] f(StackTraceElement[] f) {
        if (f.length <= this.F0) {
            return f;
        }
        final v6r[] array = (v6r[])this.G0;
        final int length = array.length;
        int i = 0;
        StackTraceElement[] f2 = f;
        while (i < length) {
            final v6r v6r = array[i];
            if (f2.length <= this.F0) {
                break;
            }
            f2 = v6r.f(f);
            ++i;
        }
        f = f2;
        if (f2.length > this.F0) {
            f = ((or3)this.H0).f(f2);
        }
        return f;
    }
}
