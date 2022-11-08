// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonJsInstrumentation extends lhh<wce>
{
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public xrv c;
    
    @Override
    public final h4j t() {
        final wce$a wce$a = new wce$a();
        final xrv c = this.c;
        pf8.r(c);
        ((lsr$a)wce$a).a = c;
        final int a = w4j.a;
        final String a2 = this.a;
        pf8.q(a2);
        wce$a.k = a2;
        wce$a.l = this.b;
        return (h4j)wce$a;
    }
}
