// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonWaitSpinner extends lhh<ahx>
{
    @JsonField
    public int a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public int c;
    @JsonField
    public dsr d;
    @JsonField
    public xrv e;
    @JsonField
    public iej f;
    @JsonField
    public JsonOcfRichText g;
    @JsonField(typeConverter = bhx.class)
    public ahx$b h;
    @JsonField
    public String i;
    @JsonField
    public xrv j;
    @JsonField
    public int k;
    @JsonField
    public xrv l;
    
    public JsonWaitSpinner() {
        this.h = ahx$b.C0;
    }
    
    @Override
    public final h4j t() {
        final ahx$a ahx$a = new ahx$a();
        ahx$a.k = this.a;
        ahx$a.l = this.c;
        ahx$a.n = JsonOcfRichText.s(this.b);
        ahx$a.o = this.d;
        ahx$a.p = this.e;
        ((lsr$a)ahx$a).h = this.f;
        final int a = w4j.a;
        ahx$a.q = JsonOcfRichText.s(this.g);
        ahx$a.r = this.h;
        ahx$a.s = this.i;
        ((lsr$a)ahx$a).c = this.j;
        ahx$a.m = this.k;
        ahx$a.t = this.l;
        return (h4j)ahx$a;
    }
}
