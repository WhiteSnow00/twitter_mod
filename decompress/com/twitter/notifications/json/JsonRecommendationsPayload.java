// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRecommendationsPayload extends fih<i4m>
{
    @JsonField(name = { "impression_id" })
    public String a;
    @JsonField(name = { "title" })
    public String b;
    @JsonField(name = { "text" })
    public String c;
    @JsonField(name = { "uri" })
    public String d;
    @JsonField(name = { "scribe_target" })
    public String e;
    @JsonField(name = { "profile_pic_url" })
    public String f;
    @JsonField(name = { "media_url" })
    public String g;
    
    public final Object s() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        String f = this.f;
        if (f == null) {
            f = "";
        }
        String g = this.g;
        if (g == null) {
            g = "";
        }
        return new i4m(a, b, c, d, e, f, g);
    }
}
