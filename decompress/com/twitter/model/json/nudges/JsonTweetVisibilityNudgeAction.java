// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/nudges/JsonTweetVisibilityNudgeAction;", "Ltih;", "Lm0j;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonTweetVisibilityNudgeAction extends tih<m0j>
{
    @JsonField
    public String a;
    @JsonField
    public o0j$c b;
    
    @Override
    public final Object s() {
        m0j m0j;
        if (this.a != null && this.b != null) {
            final String a = this.a;
            e0e.c((Object)a);
            final o0j$c b = this.b;
            e0e.c((Object)b);
            m0j = new m0j(a, b);
        }
        else {
            m0j = null;
        }
        return m0j;
    }
}
