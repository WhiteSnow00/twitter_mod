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

public final class qn9 extends atc<Map<dn9, hn9>, zbv>
{
    public final void m(final int n, final InputStream inputStream, final int n2, final String s, final String s2) throws IOException {
        if (s == null || n != 200) {
            return;
        }
        if (s.startsWith("application/json")) {
            final JsonVideoAdResponse jsonVideoAdResponse = uih.d(inputStream, JsonVideoAdResponse.class);
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
                    final kkg t = kkg.t();
                    for (final y00 y00 : jsonVideoAdResponse.b) {
                        if (y00 != null) {
                            t.w((Object)y00.b, (Object)y00.a);
                        }
                    }
                    emptyMap2 = (Map)((z4j)t).e();
                }
                Map<Object, Object> emptyMap3;
                if (jsonVideoAdResponse.a == null) {
                    emptyMap3 = Collections.emptyMap();
                }
                else {
                    final kkg t2 = kkg.t();
                    for (final nn9 nn9 : jsonVideoAdResponse.a) {
                        if (nn9 != null) {
                            t2.w((Object)nn9.b, (Object)nn9.a);
                        }
                    }
                    emptyMap3 = (Map)((z4j)t2).e();
                }
                final aop x = aop.x();
                x.p((Iterable)emptyMap2.keySet());
                x.p((Iterable)emptyMap3.keySet());
                final Set set = (Set)((z4j)x).e();
                final kkg t3 = kkg.t();
                for (final dn9 dn9 : set) {
                    if (emptyMap2.containsKey(dn9) || emptyMap3.containsKey(dn9)) {
                        t3.w((Object)dn9, (Object)new hn9((zm9)emptyMap3.get(dn9), (String)emptyMap2.get(dn9)));
                    }
                }
                emptyMap = (Map)((z4j)t3).e();
            }
            super.F0 = emptyMap;
            super.G0 = zbv.G0;
            return;
        }
        throw new IOException(dvc.d("Reader could not validate. content-type=[", s, "], or encoding=[", s2, "]"));
    }
}
