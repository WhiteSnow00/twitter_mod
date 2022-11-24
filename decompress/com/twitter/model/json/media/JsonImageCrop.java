// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonImageCrop extends tih<w6d>
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
    
    @Override
    public final Object s() {
        final w6d.a a = new w6d.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        a.d = this.d;
        return a.e();
    }
}
