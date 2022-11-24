// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGiphyCategory extends tih<y3c>
{
    @JsonField(name = { "name" })
    public String a;
    @JsonField(name = { "name_encoded" })
    public String b;
    @JsonField(name = { "gif" })
    public z3c c;
    
    @Override
    public final Object s() {
        y3c y3c;
        if (this.a != null && this.b != null && this.c != null) {
            y3c = new y3c();
        }
        else {
            mqb.o("JsonGiphyCategory");
            y3c = null;
        }
        return y3c;
    }
}
