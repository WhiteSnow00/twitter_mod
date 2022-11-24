// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.card;

import java.net.MalformedURLException;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonImageModel extends tih<b8d>
{
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField(name = { "alt", "alt_text" })
    public String d;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final b8d t() {
        try {
            if (this.a == null) {
                return null;
            }
            return new b8d(y78.i(this.a), beq.g(this.c, this.b), this.d);
        }
        catch (final MalformedURLException ex) {
            r9a.d((Throwable)ex);
            return null;
        }
    }
}
