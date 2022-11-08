// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonPageResponse extends lhh<ssj>
{
    @JsonField
    public u4c.a a;
    @JsonField
    public grs.a b;
    @JsonField
    public zrj c;
    
    @Override
    public final h4j t() {
        final ssj$a ssj$a = new ssj$a();
        ssj$a.a = u4c.b();
        final grs.a b = this.b;
        grs b2;
        if (b != null) {
            b2 = (grs)b.j();
        }
        else {
            b2 = null;
        }
        ssj$a.b = b2;
        ssj$a.c = this.c;
        return (h4j)ssj$a;
    }
}
