// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonActionList extends qhh<nk>
{
    @JsonField
    public ssv a;
    @JsonField
    public ssv b;
    @JsonField
    public oej c;
    @JsonField
    public List<ek> d;
    @JsonField(typeConverter = lk.class)
    public nk$c e;
    
    public JsonActionList() {
        this.e = nk$c.D0;
    }
    
    public final n4j t() {
        final nk$a nk$a = new nk$a();
        ((dtr$a)nk$a).h = this.c;
        final int a = c5j.a;
        ((dtr$a)nk$a).a = this.a;
        ((dtr$a)nk$a).b = this.b;
        final ArrayList d = this.d;
        czd.f((Object)d, "actionListItems");
        nk$a.k = d;
        final nk$c e = this.e;
        czd.f((Object)e, "style");
        nk$a.l = e;
        return (n4j)nk$a;
    }
}
