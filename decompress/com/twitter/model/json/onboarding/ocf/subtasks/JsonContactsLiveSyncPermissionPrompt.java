// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonContactsLiveSyncPermissionPrompt extends qhh<f1g>
{
    @JsonField
    public String a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public ssv c;
    @JsonField
    public ssv d;
    @JsonField
    public pdj e;
    @JsonField
    public JsonOcfComponentCollection f;
    
    public final n4j t() {
        final f1g$a f1g$a = new f1g$a();
        f1g$a.k = this.a;
        f1g$a.l = JsonOcfRichText.s(this.b);
        ((dtr$a)f1g$a).a = this.c;
        final int a = c5j.a;
        ((dtr$a)f1g$a).b = this.d;
        f1g$a.m = this.e;
        final JsonOcfComponentCollection f = this.f;
        x06 t;
        if (f != null) {
            t = f.t();
        }
        else {
            t = null;
        }
        ((dtr$a)f1g$a).j = t;
        return (n4j)f1g$a;
    }
}
