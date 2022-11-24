// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonResponseObjects extends tih<lsm>
{
    @JsonField(typeConverter = dws.class)
    public Map<String, cws> a;
    @JsonField(typeConverter = zkg.class)
    public Map<String, List<mxs>> b;
    
    public JsonResponseObjects() {
        final ked$b f0 = ked.F0;
        final int a = o5j.a;
        this.a = (Map<String, cws>)f0;
        this.b = (Map<String, List<mxs>>)f0;
    }
    
    @Override
    public final Object s() {
        return new lsm((Map)this.a, (Map)this.b);
    }
}
