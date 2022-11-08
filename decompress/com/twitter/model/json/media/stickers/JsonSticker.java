// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import com.twitter.util.user.UserIdentifier;
import java.util.Date;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSticker extends lhh<rfr>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public long e;
    @JsonField
    public long f;
    @JsonField
    public long g;
    @JsonField
    public String h;
    @JsonField
    public chr i;
    @JsonField
    public long j;
    @JsonField
    public String k;
    @JsonField(typeConverter = xie.class)
    public Date l;
    @JsonField(typeConverter = xie.class)
    public Date m;
    
    @Override
    public final h4j t() {
        if (this.c == null) {
            this.c = "";
        }
        final rfr$a rfr$a = new rfr$a();
        rfr$a.a = this.a;
        rfr$a.b = this.b;
        rfr$a.c = this.c;
        rfr$a.d = this.d;
        rfr$a.e = this.h;
        rfr$a.f = this.e;
        rfr$a.g = this.g;
        rfr$a.h = UserIdentifier.fromId(this.f);
        rfr$a.i = this.i;
        rfr$a.j = this.j;
        rfr$a.k = this.k;
        final Date l = this.l;
        long time;
        if (l != null) {
            time = l.getTime();
        }
        else {
            time = 0L;
        }
        rfr$a.l = time;
        final Date m = this.m;
        long time2;
        if (m != null) {
            time2 = m.getTime();
        }
        else {
            time2 = Long.MAX_VALUE;
        }
        rfr$a.m = time2;
        final t3s a = mq1.a;
        rfr$a.n = System.currentTimeMillis();
        return (h4j)rfr$a;
    }
}
