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
public class JsonSticker extends qhh<mgr>
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
    public whr i;
    @JsonField
    public long j;
    @JsonField
    public String k;
    @JsonField(typeConverter = iie.class)
    public Date l;
    @JsonField(typeConverter = iie.class)
    public Date m;
    
    public final n4j t() {
        if (this.c == null) {
            this.c = "";
        }
        final mgr$a mgr$a = new mgr$a();
        mgr$a.a = this.a;
        mgr$a.b = this.b;
        mgr$a.c = this.c;
        mgr$a.d = this.d;
        mgr$a.e = this.h;
        mgr$a.f = this.e;
        mgr$a.g = this.g;
        mgr$a.h = UserIdentifier.fromId(this.f);
        mgr$a.i = this.i;
        mgr$a.j = this.j;
        mgr$a.k = this.k;
        final Date l = this.l;
        long time;
        if (l != null) {
            time = l.getTime();
        }
        else {
            time = 0L;
        }
        mgr$a.l = time;
        final Date m = this.m;
        long time2;
        if (m != null) {
            time2 = m.getTime();
        }
        else {
            time2 = Long.MAX_VALUE;
        }
        mgr$a.m = time2;
        final m4s a = hq1.a;
        mgr$a.n = System.currentTimeMillis();
        return (n4j)mgr$a;
    }
}
