// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livevideo;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveVideoStream extends tih<n2g>
{
    @JsonField
    public JsonLiveVideoStreamSource a;
    @JsonField(name = { "lifecycleToken" })
    public String b;
    @JsonField(name = { "chatToken" })
    public String c;
    @JsonField(name = { "shareUrl" })
    public String d;
    @JsonField(name = { "restrictions" }, typeConverter = jge.class)
    public List<m2g> e;
    
    public JsonLiveVideoStream() {
        this.e = new ArrayList<m2g>();
    }
    
    @Override
    public final Object s() {
        final JsonLiveVideoStreamSource a = this.a;
        if (a != null) {
            final String b = a.b;
            if (b != null) {
                return new n2g(b, a.a, this.b, this.c, this.d, a.d, (List)this.e);
            }
        }
        return null;
    }
}
