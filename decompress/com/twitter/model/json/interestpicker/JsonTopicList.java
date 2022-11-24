// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.interestpicker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTopicList extends tih<fpt>
{
    @JsonField
    public int a;
    @JsonField
    public long[] b;
    @JsonField
    public Map<String, JsonTopicList.JsonTopicList$JsonTopic> c;
    
    @Override
    public final Object s() {
        final ojf h = ojf.H();
        final long[] b = this.b;
        if (b != null) {
            for (int length = b.length, i = 0; i < length; ++i) {
                final jlt t = this.t(b[i]);
                if (t != null) {
                    h.p((Object)t);
                }
            }
        }
        return new fpt(this.a, (List)((z4j)h).e());
    }
    
    public final jlt t(final long n) {
        final HashMap c = this.c;
        if (c != null) {
            final JsonTopicList.JsonTopicList$JsonTopic jsonTopicList$JsonTopic = c.get(String.valueOf(n));
            if (jsonTopicList$JsonTopic != null) {
                final ojf h = ojf.H();
                final long[] d = jsonTopicList$JsonTopic.d;
                for (int length = d.length, i = 0; i < length; ++i) {
                    h.p((Object)this.t(d[i]));
                }
                return new jlt((List)((z4j)h).e());
            }
        }
        return null;
    }
}
