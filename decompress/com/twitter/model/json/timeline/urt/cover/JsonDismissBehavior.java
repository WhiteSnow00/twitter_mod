// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonDismissBehavior extends tih<cpv.b>
{
    @JsonField
    public fym a;
    
    @Override
    public final Object s() {
        final fym a = this.a;
        final fym j0 = fym.J0;
        fym fym = a;
        if (a == null) {
            fym = j0;
        }
        return new cpv.b(fym);
    }
}
