// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonJsInstrumentation extends qhh<bce>
{
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public ssv c;
    
    public final n4j t() {
        final bce$a bce$a = new bce$a();
        final ssv c = this.c;
        jee.l((Object)c);
        ((dtr$a)bce$a).a = c;
        final int a = c5j.a;
        final String a2 = this.a;
        jee.k(a2);
        bce$a.k = a2;
        bce$a.l = this.b;
        return (n4j)bce$a;
    }
}
