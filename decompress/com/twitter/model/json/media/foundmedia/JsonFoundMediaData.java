// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonFoundMediaData extends fih<hmb>
{
    @JsonField
    public List<kmb> a;
    @JsonField
    public List<nmb> b;
    
    public final Object s() {
        return new hmb(gdd.g((List)this.a), gdd.g((List)this.b));
    }
}
