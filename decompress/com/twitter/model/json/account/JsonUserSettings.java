// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.util.List;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserSettings extends tih<ojw>
{
    @JsonField(name = { "allow_authenticated_periscope_requests" })
    public boolean A;
    @JsonField(name = { "allow_logged_out_device_personalization" })
    public boolean B;
    @JsonField(name = { "allow_location_history_personalization" })
    public boolean C;
    @JsonField(name = { "allow_sharing_data_for_third_party_personalization" })
    public boolean D;
    @JsonField(name = { "settings_metadata" })
    public Map<String, String> E;
    @JsonField(name = { "protect_password_reset" })
    public boolean F;
    @JsonField(name = { "ext_dm_nsfw_media_filter" })
    public Boolean G;
    @JsonField(name = { "ext_sharing_audiospaces_listening_data_with_followers" })
    public Boolean H;
    @JsonField
    public Long I;
    @JsonField
    public List<g6r> J;
    @JsonField(name = { "ext_reply_filter_setting" })
    public dvt K;
    @JsonField
    public boolean a;
    @JsonField
    public boolean b;
    @JsonField
    public boolean c;
    @JsonField
    public String d;
    @JsonField(name = { "protected" })
    public boolean e;
    @JsonField
    public boolean f;
    @JsonField
    public boolean g;
    @JsonField
    public boolean h;
    @JsonField
    public boolean i;
    @JsonField(name = { "discoverable_by_mobile_phone" })
    public boolean j;
    @JsonField
    public String k;
    @JsonField
    public String l;
    @JsonField
    public boolean m;
    @JsonField
    public boolean n;
    @JsonField
    public String o;
    @JsonField(name = { "smart_mute" })
    public boolean p;
    @JsonField
    public int q;
    @JsonField
    public boolean r;
    @JsonField
    public String s;
    @JsonField
    public String t;
    @JsonField
    public String u;
    @JsonField
    public boolean v;
    @JsonField
    public String w;
    @JsonField
    public String x;
    @JsonField
    public List<ojw.c> y;
    @JsonField
    public ojw.b z;
    
    public JsonUserSettings() {
        this.b = true;
        this.n = true;
        this.q = 0;
        this.w = "enabled";
        this.x = "unfiltered";
    }
    
    @Override
    public final Object s() {
        final ojw$a ojw$a = new ojw$a();
        ojw$a.a = this.a;
        ojw$a.h = this.b;
        ojw$a.g = this.d;
        ojw$a.i = this.e;
        ojw$a.j = this.f;
        ojw$a.k = this.g;
        ojw$a.l = this.h;
        ojw$a.m = this.i;
        ojw$a.n = this.j;
        ojw$a.o = this.k;
        ojw$a.p = this.l;
        ojw$a.q = this.m;
        ojw$a.s = this.c;
        ojw$a.t = this.n;
        ojw$a.u = this.o;
        ojw$a.w = this.s;
        ojw$a.v = this.q;
        ojw$a.x = this.r;
        ojw$a.y = this.t;
        ojw$a.z = this.u;
        ojw$a.B = this.v;
        ojw$a.C = this.w;
        ojw$a.D = this.x;
        ojw$a.o((ojw.c)kr4.z((List)this.y));
        final ojw.b z = this.z;
        if (z != null) {
            ojw$a.d = z.a;
            ojw$a.e = z.b;
            ojw$a.f = z.c;
        }
        ojw$a.E = this.A;
        ojw$a.F = this.B;
        ojw$a.G = this.C;
        ojw$a.H = this.D;
        final boolean u = kr4.u((Map)this.E);
        final boolean b = false;
        ojw$a.I = (!u && Boolean.valueOf(this.E.get("is_eu")));
        ojw$a.J = this.F;
        ojw$a.K = this.I;
        final Boolean g = this.G;
        ojw$a.A = (g == null || g);
        final Boolean h = this.H;
        ojw$a.L = (h == null || h);
        ojw$a.M = this.J;
        final dvt k = this.K;
        boolean n = b;
        if (k != null) {
            n = b;
            if (k.a) {
                n = true;
            }
        }
        ojw$a.N = n;
        return ((z4j)ojw$a).e();
    }
}
