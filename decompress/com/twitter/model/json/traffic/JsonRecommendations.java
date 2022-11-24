// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.traffic;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonRecommendations extends tih<mq6>
{
    @JsonField
    public long a;
    @JsonField
    public long b;
    @JsonField
    public Map<String, JsonServerRecommendation> c;
    
    @Override
    public final Object s() {
        final long b = this.b;
        Object o = null;
        if (b > 0L) {
            if (this.c == null) {
                final ked$b f0 = ked.F0;
                final int a = o5j.a;
                this.c = (Map<String, JsonServerRecommendation>)f0;
            }
            final ojf$a ojf$a = new ojf$a(this.c.size());
            for (final Map.Entry<String, V> entry : this.c.entrySet()) {
                final String s = entry.getKey();
                final JsonServerRecommendation jsonServerRecommendation = (JsonServerRecommendation)entry.getValue();
                if (flr.g((CharSequence)s) && jsonServerRecommendation != null && jsonServerRecommendation.s()) {
                    fj1.b(jsonServerRecommendation.s());
                    Object o2;
                    if (jsonServerRecommendation.a != null) {
                        o2 = new oxm(s, jsonServerRecommendation.a);
                    }
                    else if (jsonServerRecommendation.b != null) {
                        final JsonPrediction b2 = jsonServerRecommendation.b;
                        o2 = new ruk(s, b2.a, (List)b2.b, b2.c, (Map)b2.d);
                    }
                    else {
                        fj1.h("impossible");
                        o2 = null;
                    }
                    ((ojf)ojf$a).p(o2);
                }
            }
            final g5s a2 = nq1.a;
            final long currentTimeMillis = System.currentTimeMillis();
            final TimeUnit seconds = TimeUnit.SECONDS;
            o = new mq6(seconds.toMillis(this.b) + currentTimeMillis, seconds.toMillis(this.a) + System.currentTimeMillis(), (List)((z4j)ojf$a).e());
        }
        return o;
    }
}
