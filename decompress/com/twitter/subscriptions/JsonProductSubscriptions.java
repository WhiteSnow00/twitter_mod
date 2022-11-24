// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/subscriptions/JsonProductSubscriptions;", "Ltih;", "Lq4l;", "<init>", "()V", "subsystem.tfa.subscriptions.json_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonProductSubscriptions extends tih<q4l>
{
    @JsonField
    public List<n4l> a;
    
    public JsonProductSubscriptions() {
        this.a = (List<n4l>)h3a.F0;
    }
    
    @Override
    public final Object s() {
        return new q4l((List)this.a);
    }
}
