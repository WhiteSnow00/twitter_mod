// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationsPermissionPrompt extends qhh<mxi>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public ssv d;
    @JsonField
    public ssv e;
    @JsonField
    public ssv f;
    @JsonField
    public ssv g;
    @JsonField(typeConverter = ojl.class)
    public njl h;
    @JsonField(typeConverter = w6k.class)
    public int i;
    
    public final n4j t() {
        final mxi$a mxi$a = new mxi$a();
        ((dtr$a)mxi$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)mxi$a).g = JsonOcfRichText.s(this.b);
        mxi$a.k = JsonOcfRichText.s(this.c);
        mxi$a.l = this.d;
        mxi$a.m = this.e;
        mxi$a.n = this.f;
        mxi$a.o = this.g;
        mxi$a.q = this.i;
        mxi$a.p = this.h;
        return (n4j)mxi$a;
    }
}
