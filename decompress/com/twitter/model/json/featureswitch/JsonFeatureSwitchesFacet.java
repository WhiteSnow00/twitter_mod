// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFeatureSwitchesFacet extends fih<nta>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public boolean d;
    @JsonField
    public List<tta> e;
    
    public final Object s() {
        final qjg t = qjg.t();
        final ArrayList e = this.e;
        if (e != null) {
            for (final tta tta : e) {
                t.w((Object)tta.a, (Object)tta);
            }
        }
        return new nta(this.a, (Map)((n4j)t).e());
    }
}
