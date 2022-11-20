// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFetchPersistedData extends qhh<mva>
{
    @JsonField(typeConverter = nva.class)
    public mva$b a;
    @JsonField
    public ssv b;
    @JsonField
    public ssv c;
    
    public final n4j t() {
        final mva$a mva$a = new mva$a();
        final mva$b a = this.a;
        czd.f((Object)a, "dataType");
        mva$a.k = a;
        ((dtr$a)mva$a).a = this.b;
        final int a2 = c5j.a;
        ((dtr$a)mva$a).b = this.c;
        return (n4j)mva$a;
    }
}
