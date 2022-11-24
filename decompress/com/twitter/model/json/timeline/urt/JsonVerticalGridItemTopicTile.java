// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonVerticalGridItemTopicTile extends tih<qtw>
{
    @JsonField
    public String a;
    @JsonField
    public lxd b;
    @JsonField(typeConverter = otw.class)
    public int c;
    @JsonField(typeConverter = ptw.class)
    public int d;
    @JsonField
    public c9t e;
    
    @Override
    public final Object s() {
        if (this.b != null) {
            y4c.d().o(this.b);
            this.a = this.b.a;
        }
        qtw qtw;
        if (flr.g((CharSequence)this.a)) {
            final qtw$a qtw$a = new qtw$a();
            qtw$a.a = this.a;
            qtw$a.b = this.c;
            qtw$a.c = this.d;
            qtw$a.d = this.e;
            qtw = (qtw)((z4j)qtw$a).e();
        }
        else {
            qtw = null;
        }
        return qtw;
    }
}
