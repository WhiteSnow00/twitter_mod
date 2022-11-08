import java.util.Iterator;
import java.io.IOException;
import java.util.Set;
import java.util.Collections;
import com.twitter.ads.api.JsonVideoAdResponse;
import java.io.InputStream;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fn9 extends wsc<Map<sm9, wm9>, pav>
{
    public final void m(final int n, final InputStream inputStream, final int n2, final String s, final String s2) throws IOException {
        if (s == null || n != 200) {
            return;
        }
        if (s.startsWith("application/json")) {
            final JsonVideoAdResponse jsonVideoAdResponse = (JsonVideoAdResponse)bih.d(inputStream, (Class)JsonVideoAdResponse.class);
            Map<Object, Object> emptyMap;
            if (jsonVideoAdResponse.a == null && jsonVideoAdResponse.b == null) {
                emptyMap = Collections.emptyMap();
            }
            else {
                Map<Object, Object> emptyMap2;
                if (jsonVideoAdResponse.b == null) {
                    emptyMap2 = Collections.emptyMap();
                }
                else {
                    final sjg t = sjg.t();
                    for (final y00 y00 : jsonVideoAdResponse.b) {
                        if (y00 != null) {
                            t.w((Object)y00.b, (Object)y00.a);
                        }
                    }
                    emptyMap2 = (Map)((h4j)t).e();
                }
                Map<Object, Object> emptyMap3;
                if (jsonVideoAdResponse.a == null) {
                    emptyMap3 = Collections.emptyMap();
                }
                else {
                    final sjg t2 = sjg.t();
                    for (final cn9 cn9 : jsonVideoAdResponse.a) {
                        if (cn9 != null) {
                            t2.w((Object)cn9.b, (Object)cn9.a);
                        }
                    }
                    emptyMap3 = (Map)((h4j)t2).e();
                }
                final nmp x = nmp.x();
                x.p((Iterable)emptyMap2.keySet());
                x.p((Iterable)emptyMap3.keySet());
                final Set set = (Set)((h4j)x).e();
                final sjg t3 = sjg.t();
                for (final sm9 sm9 : set) {
                    if (emptyMap2.containsKey(sm9) || emptyMap3.containsKey(sm9)) {
                        t3.w((Object)sm9, (Object)new wm9((om9)emptyMap3.get(sm9), (String)emptyMap2.get(sm9)));
                    }
                }
                emptyMap = (Map)((h4j)t3).e();
            }
            super.C0 = emptyMap;
            super.D0 = pav.D0;
            return;
        }
        throw new IOException(yqh.k("Reader could not validate. content-type=[", s, "], or encoding=[", s2, "]"));
    }
}
