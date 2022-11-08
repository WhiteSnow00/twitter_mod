// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTile extends aih<zos>
{
    @JsonField
    public bca a;
    @JsonField(name = { "tileUrl", "url" })
    public q7t b;
    @JsonField
    public bps c;
    
    @Override
    public final Object s() {
        final zos$a zos$a = new zos$a();
        zos$a.a = this.a;
        zos$a.b = this.b;
        zos$a.c = this.c;
        return ((h4j)zos$a).j();
    }
}
