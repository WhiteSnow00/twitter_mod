// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notifications;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationTweet extends tih<bwi>
{
    @JsonField
    public long a;
    @JsonField
    public long b;
    @JsonField
    public long c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public boolean f;
    @JsonField
    public List<JsonNotificationMentionEntity> g;
    @JsonField
    public d5a h;
    @JsonField(name = { "full_text" })
    public String i;
    
    @Override
    public final Object s() {
        if (this.a == 0L) {
            mqb.o("Missing id");
        }
        else if (this.c == 0L) {
            mqb.o("Missing created_at");
        }
        else {
            if (this.d != null) {
                Object o;
                if ((o = this.g) == null) {
                    o = h3a.F0;
                }
                final bwi.a a = new bwi.a();
                a.a = this.a;
                a.b = this.b;
                a.c = this.c;
                final String d = this.d;
                e0e.f((Object)d, "text");
                a.d = d;
                a.p(this.e);
                a.f = this.f;
                a.g = d8a.e((List<z4h>)yih.d((Iterable<tih>)o, (pq4<Object, List<T>>)ojf.H()));
                a.h = this.h;
                a.o(this.i);
                return a.e();
            }
            mqb.o("Missing text");
        }
        return null;
    }
}
