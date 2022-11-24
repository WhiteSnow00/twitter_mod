// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTileContentBroadcast extends tih<mqs>
{
    @JsonField
    public long a;
    @JsonField
    public ziw b;
    @JsonField
    public vg1 c;
    
    @Override
    public final Object s() {
        final qgv b = dvc.b(this.b);
        if (b != null) {
            y4c.d().q(b);
            this.a = b.F0;
        }
        final long a = this.a;
        mqs mqs;
        if (a > 0L) {
            final mqs$a mqs$a = new mqs$a();
            mqs$a.a = a;
            mqs$a.b = this.c;
            mqs = (mqs)((z4j)mqs$a).j();
        }
        else {
            c0e.i("user is missing");
            mqs = null;
        }
        return mqs;
    }
}
