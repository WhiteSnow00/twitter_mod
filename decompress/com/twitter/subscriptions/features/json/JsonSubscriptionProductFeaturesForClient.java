// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/subscriptions/features/json/JsonSubscriptionProductFeaturesForClient;", "Ltih;", "Lqor;", "<init>", "()V", "subsystem.tfa.subscriptions.features.json_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject
public final class JsonSubscriptionProductFeaturesForClient extends tih<qor>
{
    @JsonField(name = { "subscription_product_features_for_client" })
    public List<por> a;
    
    public JsonSubscriptionProductFeaturesForClient() {
        this.a = (List<por>)h3a.F0;
    }
    
    @Override
    public final Object s() {
        return new qor((List)this.a);
    }
}
