// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonThreadReaderHeader extends aih<gms>
{
    @JsonField
    public JsonThreadReaderHeader.JsonThreadReaderHeader$TimelineUserThreadHeaderContent a;
    
    @Override
    public final Object s() {
        final hfv e = ffa.e(this.a.a);
        pf8.r(e);
        return new gms(e);
    }
}
