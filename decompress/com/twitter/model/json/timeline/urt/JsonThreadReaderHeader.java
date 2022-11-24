// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonThreadReaderHeader extends tih<uns>
{
    @JsonField
    public JsonThreadReaderHeader.JsonThreadReaderHeader$TimelineUserThreadHeaderContent a;
    
    @Override
    public final Object s() {
        final qgv b = dvc.b(this.a.a);
        vmw.g((Object)b);
        return new uns(b);
    }
}
