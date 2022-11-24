// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRelatedSearch extends tih<sbm>
{
    @JsonField(name = { "relatedSearch" })
    public wbm a;
    
    @Override
    public final Object s() {
        final wbm a = this.a;
        Object o;
        if (a == null) {
            o = null;
        }
        else {
            o = new sbm(a);
        }
        return o;
    }
}
