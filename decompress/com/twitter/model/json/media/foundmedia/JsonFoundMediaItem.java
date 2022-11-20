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
public class JsonFoundMediaItem extends fih<nmb>
{
    @JsonField
    public qmb a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public pmb d;
    @JsonField
    public String e;
    @JsonField
    public List<mmb> f;
    @JsonField
    public mmb g;
    @JsonField
    public String h;
    
    public final Object s() {
        if (this.a == null) {
            i48.t("JsonFoundMediaItem has no provider");
        }
        else if (ikr.e((CharSequence)this.b)) {
            i48.t("JsonFoundMediaItem has no item type");
        }
        else if (ikr.e((CharSequence)this.c)) {
            i48.t("JsonFoundMediaItem has no id");
        }
        else if (this.d == null) {
            i48.t("JsonFoundMediaItem has no foundMediaOrigin");
        }
        else if (ikr.e((CharSequence)this.e)) {
            i48.t("JsonFoundMediaItem has no url");
        }
        else if (fq4.t((Collection)this.f)) {
            i48.t("JsonFoundMediaItem has no thumbnail images");
        }
        else {
            if (this.g != null) {
                return new nmb(this.a, this.b, this.c, this.d, this.e, mmb.a((List)this.f), this.g, this.h);
            }
            i48.t("JsonFoundMediaItem has no original image");
        }
        return null;
    }
}
