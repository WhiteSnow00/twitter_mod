// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveEventTimelineInfo extends qhh<wxf>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public hd7 e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    
    public final n4j t() {
        final String a = this.a;
        jee.l((Object)a);
        final wxf$a wxf$a = new wxf$a(a);
        wxf$a.b = this.b;
        wxf$a.c = this.c;
        wxf$a.d = this.d;
        wxf$a.e = this.e;
        wxf$a.f = this.f;
        wxf$a.g = this.g;
        wxf$a.h = this.h;
        return (n4j)wxf$a;
    }
}
