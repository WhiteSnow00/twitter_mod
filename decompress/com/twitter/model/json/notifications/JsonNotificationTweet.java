// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notifications;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationTweet extends fih<kvi>
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
    public b4a h;
    @JsonField(name = { "full_text" })
    public String i;
    
    public final Object s() {
        if (this.a == 0L) {
            i48.t("Missing id");
        }
        else if (this.c == 0L) {
            i48.t("Missing created_at");
        }
        else {
            if (this.d != null) {
                Object o;
                if ((o = this.g) == null) {
                    o = f2a.D0;
                }
                final kvi$a kvi$a = new kvi$a();
                kvi$a.a = this.a;
                kvi$a.b = this.b;
                kvi$a.c = this.c;
                final String d = this.d;
                czd.f((Object)d, "text");
                kvi$a.d = d;
                kvi$a.p(this.e);
                kvi$a.f = this.f;
                kvi$a.g = y6a.e((List)kih.d((Iterable<fih>)o, (kp4<Object, List>)rif.H()));
                kvi$a.h = this.h;
                kvi$a.o(this.i);
                return ((n4j)kvi$a).e();
            }
            i48.t("Missing text");
        }
        return null;
    }
}
