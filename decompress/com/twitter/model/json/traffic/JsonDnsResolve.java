// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.traffic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonDnsResolve extends aih<p49>
{
    @JsonField
    public long a;
    @JsonField
    public long b;
    @JsonField
    public Map<String, JsonDnsMap> c;
    
    @Override
    public final Object s() {
        p49 d2;
        if (this.b > 0L && this.a > 0L) {
            if (this.c == null) {
                final ged$b c0 = ged.C0;
                final int a = w4j.a;
                this.c = (Map<String, JsonDnsMap>)c0;
            }
            final sjg t = sjg.t();
            final Iterator<Map.Entry<String, JsonDnsMap>> iterator = this.c.entrySet().iterator();
            while (true) {
                final boolean hasNext = iterator.hasNext();
                final int n = 1;
                if (!hasNext) {
                    break;
                }
                final Map.Entry<String, V> entry = iterator.next();
                final String s = entry.getKey();
                final JsonDnsMap jsonDnsMap = (JsonDnsMap)entry.getValue();
                if (!pjr.g((CharSequence)s) || jsonDnsMap == null) {
                    continue;
                }
                final ArrayList a2 = jsonDnsMap.a;
                int n2 = 0;
                Label_0222: {
                    if (a2 != null) {
                        if (!a2.isEmpty()) {
                            final Iterator iterator2 = jsonDnsMap.a.iterator();
                            s49 s2;
                            do {
                                n2 = n;
                                if (!iterator2.hasNext()) {
                                    break Label_0222;
                                }
                                s2 = (s49)iterator2.next();
                            } while (s2 != null && pjr.g((CharSequence)s2.a) && pjr.g((CharSequence)s2.b));
                        }
                    }
                    n2 = 0;
                }
                if (n2 == 0) {
                    continue;
                }
                t.w((Object)s, (Object)jsonDnsMap.a);
            }
            final long a3 = zau.d().a();
            final TimeUnit seconds = TimeUnit.SECONDS;
            final long millis = seconds.toMillis(this.b);
            final long millis2 = seconds.toMillis(this.a);
            final Map map = (Map)((h4j)t).e();
            final p49 d = p49.d;
            final nmp x = nmp.x();
            x.p((Iterable)map.keySet());
            final ged$b c2 = ged.C0;
            final int a4 = w4j.a;
            d2 = new p49(p49.a(map, x, (Map)c2, 1), millis + a3, millis2 + a3);
        }
        else {
            d2 = p49.d;
        }
        return d2;
    }
}
