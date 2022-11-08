// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRect extends ige
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public int d;
    
    public JsonRect() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }
}
