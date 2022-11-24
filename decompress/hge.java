import java.io.IOException;
import com.twitter.model.json.unifiedcard.layout.JsonCollectionLayout;
import com.twitter.model.json.unifiedcard.layout.JsonExplorerLayout;
import com.twitter.model.json.unifiedcard.layout.JsonSwipeableLayout;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hge extends nxj<su6>
{
    public static final Map<String, Class<? extends eih<? extends wxv>>> a;
    
    static {
        final kkg t = kkg.t();
        t.w((Object)"swipeable", (Object)JsonSwipeableLayout.class);
        t.w((Object)"explorer", (Object)JsonExplorerLayout.class);
        t.w((Object)"collection", (Object)JsonCollectionLayout.class);
        a = (Map)((z4j)t).e();
    }
    
    public final su6 a(final qhe qhe) throws IOException {
        rje rje = qhe.i0();
        eih eih = null;
        String s = "";
        String s2 = null;
        while (rje != null && rje != rje.O0) {
            final int ordinal = rje.ordinal();
            eih eih2;
            String j;
            String i;
            if (ordinal != 1) {
                if (ordinal != 5) {
                    if (ordinal != 7) {
                        eih2 = eih;
                        j = s2;
                        i = s;
                    }
                    else {
                        eih2 = eih;
                        j = s2;
                        i = s;
                        if ("type".equals(s)) {
                            j = qhe.j();
                            eih2 = eih;
                            i = s;
                        }
                    }
                }
                else {
                    i = qhe.j();
                    eih2 = eih;
                    j = s2;
                }
            }
            else {
                eih2 = eih;
                j = s2;
                i = s;
                if (s2 != null) {
                    final Map<String, Class<? extends eih<? extends wxv>>> a = hge.a;
                    eih2 = eih;
                    j = s2;
                    i = s;
                    if (a.containsKey(s2)) {
                        eih2 = uih.c(qhe, (Class<eih>)a.get(s2), false);
                        i = s;
                        j = s2;
                    }
                }
            }
            rje = qhe.i0();
            eih = eih2;
            s2 = j;
            s = i;
        }
        return new su6((Object)s2, (Object)eih);
    }
    
    public final /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.a(qhe);
    }
}
