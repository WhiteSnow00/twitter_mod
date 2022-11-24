// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.List;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfTextField extends tih<bfj>
{
    @JsonField(typeConverter = dfj.class)
    public cfj a;
    @JsonField
    public String b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public List<vow> d;
    
    @Override
    public final Object s() {
        final cfj a = this.a;
        final cfj g0 = cfj.G0;
        cfj cfj = a;
        if (a == null) {
            cfj = g0;
        }
        final String b = this.b;
        final pej s = JsonOcfRichText.s(this.c);
        final pej n0 = pej.N0;
        pej pej;
        if ((pej = s) == null) {
            pej = n0;
        }
        Object o;
        if ((o = this.d) == null) {
            o = h3a.F0;
        }
        return new bfj(cfj, b, pej, (List)o);
    }
}
