// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonInterestPicker extends qhh<ivd>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public List<uud> d;
    @JsonField
    public List<String> e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField(typeConverter = zvd.class)
    public String h;
    @JsonField
    public ssv i;
    @JsonField
    public ssv j;
    @JsonField
    public boolean k;
    @JsonField
    public JsonOcfComponentCollection l;
    
    public final n4j t() {
        final ivd$a ivd$a = new ivd$a();
        ((dtr$a)ivd$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)ivd$a).g = JsonOcfRichText.s(this.b);
        ivd$a.l = this.d;
        ivd$a.m = this.e;
        ivd$a.n = this.f;
        ivd$a.o = this.g;
        ((dtr$a)ivd$a).a = this.i;
        ((dtr$a)ivd$a).b = this.j;
        ivd$a.k = JsonOcfRichText.s(this.c);
        ivd$a.q = this.k;
        ivd$a.p = this.h;
        final JsonOcfComponentCollection l = this.l;
        x06 t;
        if (l != null) {
            t = l.t();
        }
        else {
            t = null;
        }
        ((dtr$a)ivd$a).j = t;
        return (n4j)ivd$a;
    }
}
