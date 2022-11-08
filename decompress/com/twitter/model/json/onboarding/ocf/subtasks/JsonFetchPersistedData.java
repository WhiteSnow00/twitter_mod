// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFetchPersistedData extends lhh<qwa>
{
    @JsonField(typeConverter = rwa.class)
    public qwa.b a;
    @JsonField
    public xrv b;
    @JsonField
    public xrv c;
    
    @Override
    public final h4j t() {
        final qwa$a qwa$a = new qwa$a();
        final qwa.b a = this.a;
        zzd.f((Object)a, "dataType");
        qwa$a.k = a;
        ((lsr$a)qwa$a).a = this.b;
        final int a2 = w4j.a;
        ((lsr$a)qwa$a).b = this.c;
        return (h4j)qwa$a;
    }
}
