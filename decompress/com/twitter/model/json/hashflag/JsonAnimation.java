// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.hashflag;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonAnimation extends qhh<cb0>
{
    @JsonField(name = { "context" })
    public String a;
    @JsonField(name = { "assetUrl", "asset_url" })
    public String b;
    @JsonField(name = { "priority" })
    public int c;
    
    public final n4j t() {
        final cb0$b cb0$b = new cb0$b();
        cb0$b.a = this.a;
        cb0$b.b = this.b;
        cb0$b.c = this.c;
        return (n4j)cb0$b;
    }
}
