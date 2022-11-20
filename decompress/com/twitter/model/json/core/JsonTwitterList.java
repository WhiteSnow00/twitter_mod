// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterList extends qhh<scv>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField(name = { "id_str", "id" })
    public long c;
    @JsonField
    public boolean d;
    @JsonField(name = { "name" })
    public String e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField(name = { "profile_image_url" })
    public String h;
    @JsonField
    public String i;
    @JsonField
    public String j;
    @JsonField(name = { "muting" })
    public boolean k;
    @JsonField(name = { "user" })
    public cgv l;
    @JsonField(name = { "user_id_str", "user_id" })
    public long m;
    @JsonField(name = { "banner_media" })
    public xh1 n;
    @JsonField
    public xh1 o;
    @JsonField
    public xh1 p;
    
    public final n4j t() {
        final scv$a scv$a = new scv$a();
        scv$a.a = this.d;
        scv$a.c = ("Public".equalsIgnoreCase(this.i) ^ true);
        scv$a.d = this.a;
        scv$a.e = this.b;
        scv$a.f = this.c;
        scv$a.k = this.e;
        scv$a.l = this.f;
        scv$a.m = this.g;
        scv$a.b = this.k;
        scv$a.n = this.h;
        scv$a.o = this.j;
        final xh1 o = this.o;
        if (o != null) {
            scv$a.r = o;
            scv$a.s = this.p;
        }
        else {
            final xh1 n = this.n;
            scv$a.r = n;
            scv$a.s = n;
        }
        final cgv l = this.l;
        if (l != null) {
            scv$a.o(l);
        }
        else {
            final long m = this.m;
            if (m != 0L) {
                scv$a.h = m;
            }
        }
        return (n4j)scv$a;
    }
}
