// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/onboarding/JsonToggleWrapperContent;", "Ltih;", "Lbht$b;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonToggleWrapperContent extends tih<bht$b>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public List<rrp> b;
    
    @Override
    public final /* bridge */ Object s() {
        return this.v();
    }
    
    public final JsonOcfRichText t() {
        final JsonOcfRichText a = this.a;
        if (a != null) {
            return a;
        }
        e0e.m("actionText");
        throw null;
    }
    
    public final boolean u() {
        return this.a != null && this.b != null;
    }
    
    public final bht$b v() {
        if (!this.u()) {
            c0e.i("a required field is missing");
            return null;
        }
        final pej s = JsonOcfRichText.s(this.t());
        if (s == null) {
            c0e.i("a required field invalid");
            return null;
        }
        final bht$b$a bht$b$a = new bht$b$a();
        bht$b$a.a = s;
        final List<rrp> b = this.b;
        if (b != null) {
            bht$b$a.b = b;
            return (bht$b)((z4j)bht$b$a).e();
        }
        e0e.m("components");
        throw null;
    }
}
