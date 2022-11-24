// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.Collection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFoundMediaGroup extends tih<lnb>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public List<nnb> c;
    @JsonField
    public nnb d;
    
    @Override
    public final Object s() {
        if (flr.e((CharSequence)this.a)) {
            mqb.o("JsonFoundMediaGroup has no display name");
        }
        else if (flr.e((CharSequence)this.b)) {
            mqb.o("JsonFoundMediaGroup has no id");
        }
        else if (kr4.t((Collection)this.c)) {
            mqb.o("JsonFoundMediaGroup has no thumbnail images");
        }
        else {
            if (this.d != null) {
                return new lnb(this.a, this.b, nnb.a((List)this.c));
            }
            mqb.o("JsonFoundMediaGroup has no original image");
        }
        return null;
    }
}
