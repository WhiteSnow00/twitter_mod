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
public class JsonTopicList extends fih<not>
{
    @JsonField
    public int a;
    @JsonField
    public long[] b;
    @JsonField
    public Map<String, JsonTopic> c;
    
    public final Object s() {
        final rif h = rif.H();
        final long[] b = this.b;
        if (b != null) {
            for (int length = b.length, i = 0; i < length; ++i) {
                final skt t = this.t(b[i]);
                if (t != null) {
                    h.p((Object)t);
                }
            }
        }
        return new not(this.a, (List)((n4j)h).e());
    }
    
    public final skt t(final long n) {
        final HashMap c = this.c;
        if (c != null) {
            final JsonTopic jsonTopic = c.get(String.valueOf(n));
            if (jsonTopic != null) {
                final rif h = rif.H();
                final long[] d = jsonTopic.d;
                for (int length = d.length, i = 0; i < length; ++i) {
                    h.p((Object)this.t(d[i]));
                }
                return new skt((List)((n4j)h).e());
            }
        }
        return null;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonTopic extends qfe
    {
        @JsonField
        public String a;
        @JsonField
        public long b;
        @JsonField
        public String c;
        @JsonField
        public long[] d;
        @JsonField
        public String e;
    }
}
