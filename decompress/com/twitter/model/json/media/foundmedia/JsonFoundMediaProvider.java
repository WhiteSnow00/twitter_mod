// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.ArrayList;
import android.util.SparseArray;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFoundMediaProvider extends fih<qmb>
{
    @JsonField
    public String a;
    @JsonField
    public List<mmb> b;
    @JsonField
    public String c;
    
    public final Object s() {
        if (ikr.e((CharSequence)this.c)) {
            i48.t("JsonFoundMediaProvider has no id");
        }
        else if (ikr.e((CharSequence)this.a)) {
            i48.t("JsonFoundMediaProvider has no display name");
        }
        else {
            final ArrayList b = this.b;
            if (b != null) {
                return new qmb(this.c, this.a, (SparseArray<mmb>)mmb.a((List)b));
            }
            i48.t("JsonFoundMediaProvider has no icon images");
        }
        return null;
    }
}
