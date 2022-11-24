// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMediaVideoInfo extends tih<z2h>
{
    @JsonField
    public int[] a;
    @JsonField
    public float b;
    @JsonField
    public List<a3h> c;
    
    public JsonMediaVideoInfo() {
        this.a = new int[2];
    }
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final z2h t() {
        final int[] a = this.a;
        float n;
        if (a[1] != 0) {
            n = a[0] / (float)a[1];
        }
        else {
            n = 0.0f;
        }
        final List g = ged.g((List)this.c);
        if (!g.isEmpty() && n != 0.0f) {
            return new z2h(n, this.b / 1000.0f, g);
        }
        return null;
    }
}
