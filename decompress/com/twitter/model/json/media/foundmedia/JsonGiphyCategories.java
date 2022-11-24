// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.ArrayList;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGiphyCategories extends tih<x3c>
{
    @JsonField(name = { "data" })
    public List<y3c> a;
    @JsonField(name = { "pagination" })
    public b4c b;
    
    @Override
    public final Object s() {
        final ArrayList a = this.a;
        x3c x3c;
        if (a != null && this.b != null) {
            x3c = new x3c(ojf.x((List)a), this.b);
        }
        else {
            mqb.o("JsonGiphyCategories");
            x3c = null;
        }
        return x3c;
    }
}
