import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqz extends lcy
{
    public final iz F0;
    
    public lqz(final iz f0) {
        this.F0 = f0;
        super("getValue");
    }
    
    public final pey a(final z6z z6z, final List list) {
        waz.h("getValue", 2, list);
        final pey d = z6z.d((pey)list.get(0));
        Object d2 = z6z.d((pey)list.get(1));
        final String j = d.j();
        final iz f0 = this.F0;
        final ts0 g0 = ((g7z)f0.E0).G0;
        final String s = (String)f0.D0;
        final String s2 = null;
        final Map map = ((d8q<K, Map>)g0).getOrDefault(s, null);
        String s3 = s2;
        if (map != null) {
            if (!map.containsKey(j)) {
                s3 = s2;
            }
            else {
                s3 = (String)map.get(j);
            }
        }
        if (s3 != null) {
            d2 = new bgy(s3);
        }
        return (pey)d2;
    }
}
