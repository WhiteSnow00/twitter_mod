// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonFoundMediaData extends tih<inb>
{
    @JsonField
    public List<lnb> a;
    @JsonField
    public List<onb> b;
    
    @Override
    public final Object s() {
        return new inb(ged.g((List)this.a), ged.g((List)this.b));
    }
}
