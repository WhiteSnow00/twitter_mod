// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineLabel extends tih<xys>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField(name = { "labelUrl", "url" })
    public c9t c;
    @JsonField
    public boolean d;
    @JsonField(name = { "labelDisplayType", "displayType" }, typeConverter = qte.class)
    public int e;
    
    public JsonTimelineLabel() {
        this.e = 1;
    }
    
    @Override
    public final Object s() {
        xys xys;
        if (!flr.e((CharSequence)this.a) && this.e != -1) {
            xys = new xys(this.a, this.b, this.c, this.d, this.e);
        }
        else {
            xys = null;
        }
        return xys;
    }
}
