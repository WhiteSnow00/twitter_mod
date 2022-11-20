// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFetchTemporaryPassword extends qhh<yva>
{
    @JsonField
    public boolean a;
    @JsonField
    public ssv b;
    
    public final n4j t() {
        final yva$a yva$a = new yva$a();
        yva$a.k = this.a;
        ((dtr$a)yva$a).a = this.b;
        final int a = c5j.a;
        return (n4j)yva$a;
    }
}
