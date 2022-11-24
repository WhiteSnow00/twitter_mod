// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/subscriptions/features/json/JsonFeature;", "Ltih;", "Lpor;", "<init>", "()V", "subsystem.tfa.subscriptions.features.json_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonFeature extends tih<por>
{
    @JsonField
    public String a;
    @JsonField
    public JsonFeatureConfig b;
    @JsonField(name = { "undoTweet" })
    public pvv c;
    
    @Override
    public final Object s() {
        final JsonFeatureConfig b = this.b;
        if (b != null) {
            final String a = this.a;
            if (a != null) {
                final String d = b.d;
                if (d != null) {
                    return new por(a, d, b.c, b.a, b.b, b.e, b.g, (Integer)null, ft0.p1((Object[])b.f), this.c, 128);
                }
            }
        }
        return null;
    }
}
