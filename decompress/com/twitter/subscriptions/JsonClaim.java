// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/subscriptions/JsonClaim;", "Lfih;", "Lla4;", "<init>", "()V", "subsystem.tfa.subscriptions.json_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonClaim extends fih<la4>
{
    @JsonField
    public List<sqm> a;
    @JsonField
    public String b;
    
    public JsonClaim() {
        this.a = (List<sqm>)f2a.D0;
        this.b = "";
    }
    
    public final Object s() {
        return new la4(this.b, (List)this.a);
    }
}
