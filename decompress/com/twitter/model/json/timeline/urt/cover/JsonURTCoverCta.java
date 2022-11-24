// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTCoverCta extends tih<cpv>
{
    @JsonField
    public String a;
    @JsonField
    public cpv$a b;
    @JsonField
    public List<vov> c;
    @JsonField
    public b1p d;
    @JsonField(typeConverter = a63.class)
    public int e;
    @JsonField(typeConverter = cle.class)
    public dqv f;
    
    @Override
    public final Object s() {
        if (flr.g((CharSequence)this.a)) {
            final cpv$a b = this.b;
            if (b != null) {
                final String a = this.a;
                Object o;
                if ((o = this.c) == null) {
                    o = h3a.F0;
                }
                final b1p d = this.d;
                final int e = this.e;
                final dqv f = this.f;
                dqv g0 = dqv.G0;
                if (f != null) {
                    g0 = f;
                }
                return new cpv(a, b, (List)o, d, e, g0);
            }
        }
        return null;
    }
}
