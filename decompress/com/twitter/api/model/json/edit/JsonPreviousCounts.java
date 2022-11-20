// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.edit;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/api/model/json/edit/JsonPreviousCounts;", "Lfih;", "Liyk;", "<init>", "()V", "subsystem.tfa.twitter-api.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonPreviousCounts extends fih<iyk>
{
    @JsonField(name = { "favorite_count" })
    public int a;
    @JsonField(name = { "reply_count" })
    public int b;
    @JsonField(name = { "quote_count" })
    public int c;
    @JsonField(name = { "retweetCount" })
    public int d;
    
    public final Object s() {
        return new iyk(this.a, this.b, this.c, this.d);
    }
}
