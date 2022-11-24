// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTTrendBadge extends tih<ksv>
{
    @JsonField
    public String a;
    @JsonField
    public mhe b;
    @JsonField
    public mhe c;
    @JsonField
    public u2u d;
    
    @Override
    public final Object s() {
        final mhe b = this.b;
        int intValue = -7829368;
        if (b != null) {
            Integer n;
            if ((n = b.a) == null) {
                n = -7829368;
            }
            intValue = n;
        }
        final mhe c = this.c;
        int intValue2 = -1;
        if (c != null) {
            Integer n2;
            if ((n2 = c.a) == null) {
                n2 = -1;
            }
            intValue2 = n2;
        }
        final u2u d = this.d;
        final u2u f0 = u2u.F0;
        u2u u2u;
        if ((u2u = d) == null) {
            u2u = f0;
        }
        return new ksv(u2u, this.a, intValue, intValue2);
    }
}
