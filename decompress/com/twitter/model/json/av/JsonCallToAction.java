// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.av;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonCallToAction extends tih<lyw>
{
    @JsonField(name = { "type", "callToActionType" })
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        lyw lyw;
        if (this.a != null && this.b != null) {
            final kkg t = kkg.t();
            t.w((Object)"url", (Object)this.b);
            lyw = new lyw(this.a, (Map)((z4j)t).e());
        }
        else {
            lyw = null;
        }
        return lyw;
    }
}
