// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.condition;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/onboarding/condition/JsonEnableCondition;", "Ltih;", "Le4a;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonEnableCondition extends tih<e4a>
{
    @JsonField(typeConverter = uf6.class)
    public tf6 a;
    @JsonField
    public String b;
    @JsonField
    public JsonEnableConditionData c;
    
    public JsonEnableCondition() {
        this.a = tf6.F0;
    }
    
    @Override
    public final Object s() {
        final int ordinal = ((Enum)this.a).ordinal();
        Object o = null;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            final JsonEnableConditionData c = this.c;
            List<String> a2 = null;
            Label_0049: {
                if (c != null) {
                    final JsonBooleanAllTrueData a = c.a;
                    if (a != null) {
                        a2 = a.a;
                        break Label_0049;
                    }
                }
                a2 = null;
            }
            if (a2 == null) {
                r9a.c(new m9a((Throwable)new IllegalStateException("JsonEnableCondition: Boolean condition type components can't be null")));
                o = o;
            }
            else {
                o = new e4a$a(this.b, (List)a2);
            }
        }
        return o;
    }
}
