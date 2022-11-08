// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.unifiedcard.destinations;

import android.net.Uri;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUrlData extends aih<r5w>
{
    @JsonField(name = { "full_url", "url" })
    public String a;
    @JsonField(name = { "vanity_url", "vanity" })
    public String b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        final Uri parse = Uri.parse(this.a);
        final String b = this.b;
        final String c = this.c;
        Uri parse2;
        if (c != null) {
            parse2 = Uri.parse(c);
        }
        else {
            parse2 = null;
        }
        return new r5w(parse, b, parse2);
    }
}
