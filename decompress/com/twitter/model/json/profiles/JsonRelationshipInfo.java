// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.profiles;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRelationshipInfo extends lhh<yam>
{
    @JsonField
    public long a;
    @JsonField(name = { "screen_name" })
    public String b;
    @JsonField(name = { "display_name" })
    public String c;
    @JsonField(name = { "marked_spam" })
    public boolean d;
    @JsonField(name = { "blocking" })
    public boolean e;
    @JsonField(name = { "all_replies" })
    public boolean f;
    @JsonField(name = { "notifications_enabled" })
    public boolean g;
    @JsonField(name = { "following" })
    public boolean h;
    @JsonField(name = { "following_requested" })
    public boolean i;
    @JsonField(name = { "can_dm" })
    public boolean j;
    @JsonField(name = { "want_retweets" })
    public boolean k;
    @JsonField(name = { "followed_by" })
    public boolean l;
    @JsonField(name = { "live_following" })
    public boolean m;
    @JsonField(name = { "can_media_tag" })
    public boolean n;
    @JsonField
    public boolean o;
    @JsonField(name = { "blocked_by" })
    public boolean p;
    @JsonField(name = { "space_device_following" })
    public boolean q;
    
    @Override
    public final h4j t() {
        final yam$a yam$a = new yam$a();
        yam$a.a = this.a;
        yam$a.b = this.b;
        yam$a.c = tdy.D(Boolean.valueOf(this.h), Boolean.valueOf(this.l), Boolean.valueOf(this.i), this.e, this.j, this.g, this.m, this.k, false, this.n, this.o, this.p);
        return (h4j)yam$a;
    }
}
