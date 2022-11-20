// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGiphyCategory extends fih<w2c>
{
    @JsonField(name = { "name" })
    public String a;
    @JsonField(name = { "name_encoded" })
    public String b;
    @JsonField(name = { "gif" })
    public x2c c;
    
    public final Object s() {
        w2c w2c;
        if (this.a != null && this.b != null && this.c != null) {
            w2c = new w2c();
        }
        else {
            i48.t("JsonGiphyCategory");
            w2c = null;
        }
        return w2c;
    }
}
