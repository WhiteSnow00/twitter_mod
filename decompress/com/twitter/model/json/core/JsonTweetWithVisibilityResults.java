// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetWithVisibilityResults extends qhh<t0v>
{
    @JsonField(name = { "tweet" })
    public nh0 a;
    @JsonField(name = { "soft_intervention_pivot" })
    public ylu.a b;
    @JsonField(name = { "tweet_interstitial" })
    public bnu$a c;
    @JsonField(name = { "tweet_visibility_nudge" })
    public a0j d;
    @JsonField(name = { "limited_action_results", "ext_limited_action_results" })
    public ybf e;
    @JsonField(name = { "ext" })
    public bjr f;
    
    public final n4j t() {
        final t0v$a t0v$a = new t0v$a();
        final ylu.a b = this.b;
        ybf ybf = null;
        ylu e0;
        if (b != null) {
            b.e = amu.G0;
            e0 = (ylu)b.j();
        }
        else {
            e0 = null;
        }
        final bnu$a c = this.c;
        bnu f0;
        if (c == null) {
            f0 = null;
        }
        else {
            f0 = (bnu)((n4j)c).j();
        }
        final bjr f2 = this.f;
        if (f2 != null) {
            ybf = (ybf)f2.a((Class)ybf.class);
        }
        t0v$a.D0 = this.a;
        t0v$a.F0 = f0;
        t0v$a.E0 = e0;
        t0v$a.G0 = this.d;
        ybf e2;
        if ((e2 = ybf) == null) {
            e2 = this.e;
        }
        t0v$a.H0 = e2;
        return (n4j)t0v$a;
    }
}
