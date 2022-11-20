// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.ArrayList;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGiphyImages extends fih<y2c>
{
    @JsonField(name = { "data" })
    public List<x2c> a;
    @JsonField(name = { "pagination" })
    public z2c b;
    
    public final Object s() {
        final ArrayList a = this.a;
        y2c y2c;
        if (a != null && this.b != null) {
            y2c = new y2c((Object)rif.x((List)a), (Object)this.b);
        }
        else {
            i48.t("JsonGiphyImages");
            y2c = null;
        }
        return y2c;
    }
}
