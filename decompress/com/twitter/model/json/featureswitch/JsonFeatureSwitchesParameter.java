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
public class JsonFeatureSwitchesParameter extends fih<tta>
{
    @JsonField
    public String a;
    @JsonField(name = { "default" })
    public JsonFeatureSwitchesValueObject b;
    @JsonField
    public List<aua> c;
    
    public JsonFeatureSwitchesParameter() {
        final gdd$b e0 = gdd.E0;
        final int a = c5j.a;
        this.c = (AbstractCollection)e0;
    }
    
    public final Object s() {
        final String a = this.a;
        Object o = null;
        final Object o2 = null;
        if (a != null) {
            final JsonFeatureSwitchesValueObject b = this.b;
            Object a2 = o2;
            if (b != null) {
                final aua a3 = b.a;
                a2 = o2;
                if (a3 != null) {
                    a2 = a3.a;
                }
            }
            final rif h = rif.H();
            final Iterator iterator = ((List)this.c).iterator();
            while (iterator.hasNext()) {
                h.p(((aua)iterator.next()).a);
            }
            o = new tta(this.a, a2, (List)((n4j)h).e());
        }
        return o;
    }
}
