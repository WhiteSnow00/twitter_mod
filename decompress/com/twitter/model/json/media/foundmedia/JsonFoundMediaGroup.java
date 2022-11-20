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
public class JsonFoundMediaGroup extends fih<kmb>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public List<mmb> c;
    @JsonField
    public mmb d;
    
    public final Object s() {
        if (ikr.e((CharSequence)this.a)) {
            i48.t("JsonFoundMediaGroup has no display name");
        }
        else if (ikr.e((CharSequence)this.b)) {
            i48.t("JsonFoundMediaGroup has no id");
        }
        else if (fq4.t((Collection)this.c)) {
            i48.t("JsonFoundMediaGroup has no thumbnail images");
        }
        else {
            if (this.d != null) {
                return new kmb(this.a, this.b, mmb.a((List)this.c));
            }
            i48.t("JsonFoundMediaGroup has no original image");
        }
        return null;
    }
}
