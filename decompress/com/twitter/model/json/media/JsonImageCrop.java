// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonImageCrop extends fih<v5d>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public int d;
    
    public JsonImageCrop() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }
    
    public final Object s() {
        final v5d$a v5d$a = new v5d$a();
        v5d$a.a = this.a;
        v5d$a.b = this.b;
        v5d$a.c = this.c;
        v5d$a.d = this.d;
        return ((n4j)v5d$a).e();
    }
}
