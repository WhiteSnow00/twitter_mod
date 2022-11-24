// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFoundMediaProvider extends tih<rnb>
{
    @JsonField
    public String a;
    @JsonField
    public List<nnb> b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        if (flr.e((CharSequence)this.c)) {
            mqb.o("JsonFoundMediaProvider has no id");
        }
        else if (flr.e((CharSequence)this.a)) {
            mqb.o("JsonFoundMediaProvider has no display name");
        }
        else {
            final ArrayList b = this.b;
            if (b != null) {
                return new rnb(this.c, this.a, nnb.a((List)b));
            }
            mqb.o("JsonFoundMediaProvider has no icon images");
        }
        return null;
    }
}
