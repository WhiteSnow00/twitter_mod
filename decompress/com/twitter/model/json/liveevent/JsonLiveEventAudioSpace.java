// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveEventAudioSpace extends qhh<rof>
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
    public Participants e;
    @JsonField
    public Integer f;
    @JsonField
    public Integer g;
    @JsonField
    public String h;
    @JsonField
    public Boolean i;
    
    public final n4j t() {
        final rof$a rof$a = new rof$a(this.a);
        rof$a.b = this.b;
        rof$a.c = this.c;
        rof$a.d = this.d;
        final Participants e = this.e;
        String a;
        if (e != null) {
            a = e.a.get(0).a;
        }
        else {
            a = null;
        }
        rof$a.e = a;
        rof$a.f = this.f;
        rof$a.g = this.g;
        rof$a.i = this.i;
        final String h = this.h;
        if (h != null) {
            rof$a.h = Long.parseLong(h);
        }
        return (n4j)rof$a;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class Admins extends qfe
    {
        @JsonField
        public String a;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class Participants extends qfe
    {
        @JsonField
        public List<Admins> a;
    }
}
