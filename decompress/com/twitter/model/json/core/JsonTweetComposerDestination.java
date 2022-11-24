// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/core/JsonTweetComposerDestination;", "Ltih;", "Lkvd$b;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonTweetComposerDestination extends tih<kvd$b>
{
    @JsonField
    public String a;
    @JsonField
    public JsonApiMedia b;
    
    public JsonTweetComposerDestination() {
        this.a = "";
    }
    
    @Override
    public final Object s() {
        final String a = this.a;
        final JsonApiMedia b = this.b;
        wtg t;
        if (b != null) {
            t = b.t();
        }
        else {
            t = null;
        }
        return new kvd$b(a, t);
    }
}
