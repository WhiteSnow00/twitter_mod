// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.unifiedcard.commerce;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/unifiedcard/commerce/JsonCommerceShopReportingMetadata;", "Laih;", "Lfx4;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject
public final class JsonCommerceShopReportingMetadata extends aih<fx4>
{
    @JsonField(name = { "rest_id" })
    public String a;
    
    @Override
    public final Object s() {
        final boolean g = pjr.g((CharSequence)this.a);
        Object o = null;
        if (g) {
            final fx4.a a = new fx4.a(null, 1, null);
            final String a2 = this.a;
            zzd.c((Object)a2);
            a.a = a2;
            o = a.e();
        }
        return o;
    }
}
