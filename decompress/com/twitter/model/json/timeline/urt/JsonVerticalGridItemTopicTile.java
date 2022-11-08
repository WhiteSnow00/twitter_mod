// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonVerticalGridItemTopicTile extends aih<isw>
{
    @JsonField
    public String a;
    @JsonField
    public gxd b;
    @JsonField(typeConverter = gsw.class)
    public int c;
    @JsonField(typeConverter = hsw.class)
    public int d;
    @JsonField
    public q7t e;
    
    @Override
    public final Object s() {
        if (this.b != null) {
            u4c.d().o(this.b);
            this.a = this.b.a;
        }
        isw isw;
        if (pjr.g((CharSequence)this.a)) {
            final isw$a isw$a = new isw$a();
            isw$a.a = this.a;
            isw$a.b = this.c;
            isw$a.c = this.d;
            isw$a.d = this.e;
            isw = (isw)((h4j)isw$a).e();
        }
        else {
            isw = null;
        }
        return isw;
    }
}
