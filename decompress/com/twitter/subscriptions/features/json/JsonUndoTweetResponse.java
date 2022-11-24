// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/subscriptions/features/json/JsonUndoTweetResponse;", "Ltih;", "Lpvv;", "<init>", "()V", "subsystem.tfa.subscriptions.features.json_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonUndoTweetResponse extends tih<pvv>
{
    @JsonField
    public boolean a;
    @JsonField
    public boolean b;
    @JsonField
    public Integer c;
    @JsonField
    public boolean d;
    @JsonField
    public boolean e;
    @JsonField
    public boolean f;
    @JsonField
    public boolean g;
    
    @Override
    public final Object s() {
        final Integer c = this.c;
        pvv pvv;
        if (c != null) {
            pvv = new pvv(this.a, this.b, (int)c, this.d, this.e, this.f, this.g);
        }
        else {
            pvv = null;
        }
        return pvv;
    }
}
