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
public class JsonDnsResolve extends tih<f59>
{
    @JsonField
    public long a;
    @JsonField
    public long b;
    @JsonField
    public Map<String, JsonDnsMap> c;
    
    @Override
    public final Object s() {
        f59 d2;
        if (this.b > 0L && this.a > 0L) {
            if (this.c == null) {
                final ked$b f0 = ked.F0;
                final int a = o5j.a;
                this.c = (Map<String, JsonDnsMap>)f0;
            }
            final kkg t = kkg.t();
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
                if (!flr.g((CharSequence)s) || jsonDnsMap == null) {
                    continue;
                }
                final ArrayList a2 = jsonDnsMap.a;
                int n2 = 0;
                Label_0224: {
                    if (a2 != null) {
                        if (!a2.isEmpty()) {
                            final Iterator iterator2 = jsonDnsMap.a.iterator();
                            h59 h59;
                            do {
                                n2 = n;
                                if (!iterator2.hasNext()) {
                                    break Label_0224;
                                }
                                h59 = (h59)iterator2.next();
                            } while (h59 != null && flr.g((CharSequence)h59.a) && flr.g((CharSequence)h59.b));
                        }
                    }
                    n2 = 0;
                }
                if (n2 == 0) {
                    continue;
                }
                t.w((Object)s, (Object)jsonDnsMap.a);
            }
            final long a3 = icu.d().a();
            final TimeUnit seconds = TimeUnit.SECONDS;
            final long millis = seconds.toMillis(this.b);
            final long millis2 = seconds.toMillis(this.a);
            final Map map = (Map)((z4j)t).e();
            final f59 d = f59.d;
            final aop x = aop.x();
            x.p((Iterable)map.keySet());
            final ked$b f2 = ked.F0;
            final int a4 = o5j.a;
            d2 = new f59(f59.a(map, x, (Map)f2, 1), millis + a3, millis2 + a3);
        }
        else {
            d2 = f59.d;
        }
        return d2;
    }
}
