// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTTrendBadge extends aih<erv>
{
    @JsonField
    public String a;
    @JsonField
    public ghe b;
    @JsonField
    public ghe c;
    @JsonField
    public n1u d;
    
    @Override
    public final Object s() {
        final ghe b = this.b;
        int intValue = -7829368;
        if (b != null) {
            Integer n;
            if ((n = b.a) == null) {
                n = -7829368;
            }
            intValue = n;
        }
        final ghe c = this.c;
        int intValue2 = -1;
        if (c != null) {
            Integer n2;
            if ((n2 = c.a) == null) {
                n2 = -1;
            }
            intValue2 = n2;
        }
        final n1u d = this.d;
        final n1u c2 = n1u.C0;
        n1u n1u;
        if ((n1u = d) == null) {
            n1u = c2;
        }
        return new erv(n1u, this.a, intValue, intValue2);
    }
}
