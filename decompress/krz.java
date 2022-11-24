import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krz extends fdy
{
    public final a8d H0;
    
    public krz(final a8d h0) {
        this.H0 = h0;
        super("getValue");
    }
    
    public final kfy a(final y7z y7z, final List list) {
        vbz.h("getValue", 2, list);
        final kfy d = y7z.d((kfy)list.get(0));
        Object d2 = y7z.d((kfy)list.get(1));
        final String k = d.k();
        final a8d h0 = this.H0;
        final ws0 i0 = ((f8z)h0.G0).I0;
        final String s = (String)h0.F0;
        final String s2 = null;
        final Map map = (Map)i0.getOrDefault((Object)s, (Object)null);
        String s3 = s2;
        if (map != null) {
            if (!map.containsKey(k)) {
                s3 = s2;
            }
            else {
                s3 = map.get(k);
            }
        }
        if (s3 != null) {
            d2 = new wgy(s3);
        }
        return (kfy)d2;
    }
}
