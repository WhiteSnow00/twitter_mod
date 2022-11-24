// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import android.util.SparseArray;
import java.util.Collection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFoundMediaItem extends tih<onb>
{
    @JsonField
    public rnb a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public qnb d;
    @JsonField
    public String e;
    @JsonField
    public List<nnb> f;
    @JsonField
    public nnb g;
    @JsonField
    public String h;
    
    @Override
    public final Object s() {
        if (this.a == null) {
            mqb.o("JsonFoundMediaItem has no provider");
        }
        else if (flr.e((CharSequence)this.b)) {
            mqb.o("JsonFoundMediaItem has no item type");
        }
        else if (flr.e((CharSequence)this.c)) {
            mqb.o("JsonFoundMediaItem has no id");
        }
        else if (this.d == null) {
            mqb.o("JsonFoundMediaItem has no foundMediaOrigin");
        }
        else if (flr.e((CharSequence)this.e)) {
            mqb.o("JsonFoundMediaItem has no url");
        }
        else if (kr4.t((Collection)this.f)) {
            mqb.o("JsonFoundMediaItem has no thumbnail images");
        }
        else {
            if (this.g != null) {
                return new onb(this.a, this.b, this.c, this.d, this.e, (SparseArray<nnb>)nnb.a((List)this.f), this.g, this.h);
            }
            mqb.o("JsonFoundMediaItem has no original image");
        }
        return null;
    }
}
