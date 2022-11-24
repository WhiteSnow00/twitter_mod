// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.ArrayList;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGiphyImages extends tih<a4c>
{
    @JsonField(name = { "data" })
    public List<z3c> a;
    @JsonField(name = { "pagination" })
    public b4c b;
    
    @Override
    public final Object s() {
        final ArrayList a = this.a;
        a4c a4c;
        if (a != null && this.b != null) {
            a4c = new a4c((Object)ojf.x((List)a), (Object)this.b, 0);
        }
        else {
            mqb.o("JsonGiphyImages");
            a4c = null;
        }
        return a4c;
    }
}
