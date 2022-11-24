// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFeatureSwitchesParameter extends tih<ava>
{
    @JsonField
    public String a;
    @JsonField(name = { "default" })
    public JsonFeatureSwitchesValueObject b;
    @JsonField
    public List<hva> c;
    
    public JsonFeatureSwitchesParameter() {
        final ged$b g0 = ged.G0;
        final int a = o5j.a;
        this.c = (AbstractCollection)g0;
    }
    
    @Override
    public final Object s() {
        final String a = this.a;
        Object o = null;
        final Object o2 = null;
        if (a != null) {
            final JsonFeatureSwitchesValueObject b = this.b;
            Object a2 = o2;
            if (b != null) {
                final hva a3 = b.a;
                a2 = o2;
                if (a3 != null) {
                    a2 = a3.a;
                }
            }
            final ojf h = ojf.H();
            final Iterator iterator = ((List)this.c).iterator();
            while (iterator.hasNext()) {
                h.p(((hva)iterator.next()).a);
            }
            o = new ava(this.a, a2, (List)((z4j)h).e());
        }
        return o;
    }
}
