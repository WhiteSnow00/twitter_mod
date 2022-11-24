import java.util.Map;
import java.util.HashMap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rlz extends fdy
{
    public final aby H0;
    
    public rlz(final aby h0) {
        super("internal.eventLogger");
        this.H0 = h0;
    }
    
    public final kfy a(final y7z y7z, final List list) {
        vbz.h(super.F0, 3, list);
        final String k = y7z.d((kfy)list.get(0)).k();
        final long n = (long)vbz.a(y7z.d((kfy)list.get(1)).h());
        final kfy d = y7z.d((kfy)list.get(2));
        Map g;
        if (d instanceof oey) {
            g = vbz.g((oey)d);
        }
        else {
            g = new HashMap();
        }
        this.H0.c.add(new ray(k, n, g));
        return (kfy)kfy.x0;
    }
}
