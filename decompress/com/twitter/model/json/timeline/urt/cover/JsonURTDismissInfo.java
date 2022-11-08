// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTDismissInfo extends aih<eov>
{
    @JsonField
    public List<lnv> a;
    
    @Override
    public final Object s() {
        Object o;
        if ((o = this.a) == null) {
            o = v2a.C0;
        }
        return new eov((List)o);
    }
}
