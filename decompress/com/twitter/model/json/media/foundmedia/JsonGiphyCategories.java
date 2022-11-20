// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.ArrayList;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGiphyCategories extends fih<v2c>
{
    @JsonField(name = { "data" })
    public List<w2c> a;
    @JsonField(name = { "pagination" })
    public z2c b;
    
    public final Object s() {
        final ArrayList a = this.a;
        v2c v2c;
        if (a != null && this.b != null) {
            v2c = new v2c((Object)rif.x((List)a), (Object)this.b);
        }
        else {
            i48.t("JsonGiphyCategories");
            v2c = null;
        }
        return v2c;
    }
}
