// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTileContentBroadcast extends aih<cps>
{
    @JsonField
    public long a;
    @JsonField
    public rhw b;
    @JsonField
    public wg1 c;
    
    @Override
    public final Object s() {
        final hfv e = ffa.e(this.b);
        if (e != null) {
            u4c.d().q(e);
            this.a = e.C0;
        }
        final long a = this.a;
        cps cps;
        if (a > 0L) {
            final cps.a a2 = new cps.a();
            a2.a = a;
            a2.b = this.c;
            cps = (cps)a2.j();
        }
        else {
            zi.A("user is missing");
            cps = null;
        }
        return cps;
    }
}
