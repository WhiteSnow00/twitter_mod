// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/core/JsonInteractiveTextEntity;", "Ltih;", "Lmvd;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonInteractiveTextEntity extends tih<mvd>
{
    @JsonField
    public Integer a;
    @JsonField
    public Integer b;
    @JsonField
    public Integer c;
    @JsonField(name = { "color_v2" })
    public String d;
    @JsonField
    public kvd e;
    
    @Override
    public final Object s() {
        final mvd$a mvd$a = new mvd$a();
        String d;
        if ((d = this.d) == null) {
            d = "";
        }
        mvd$a.d = d;
        final Integer b = this.b;
        final int n = 0;
        int intValue;
        if (b != null) {
            intValue = b;
        }
        else {
            intValue = 0;
        }
        ((r7a.a)mvd$a).b = intValue;
        final int a = o5j.a;
        final Integer c = this.c;
        int intValue2 = n;
        if (c != null) {
            intValue2 = c;
        }
        ((r7a.a)mvd$a).c = intValue2;
        final Integer a2 = this.a;
        int intValue3;
        if (a2 != null) {
            intValue3 = a2;
        }
        else {
            intValue3 = -1;
        }
        ((r7a.a)mvd$a).a = intValue3;
        Object e;
        if ((e = this.e) == null) {
            e = kvd$c.b;
        }
        mvd$a.e = (kvd)e;
        return ((z4j)mvd$a).e();
    }
}
