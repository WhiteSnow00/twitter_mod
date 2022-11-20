// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonAppLocaleUpdateSubtask extends qhh<ln0>
{
    @JsonField
    public ssv a;
    @JsonField
    public cn0 b;
    @JsonField
    public boolean c;
    
    public final n4j t() {
        final ln0$a ln0$a = new ln0$a();
        final ssv a = this.a;
        jee.l((Object)a);
        ((dtr$a)ln0$a).a = a;
        final int a2 = c5j.a;
        final cn0 b = this.b;
        czd.f((Object)b, "locale");
        ln0$a.k = b;
        ln0$a.l = this.c;
        return (n4j)ln0$a;
    }
}
