// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineLabel extends aih<nxs>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField(name = { "labelUrl", "url" })
    public q7t c;
    @JsonField
    public boolean d;
    @JsonField(name = { "labelDisplayType", "displayType" }, typeConverter = ite.class)
    public int e;
    
    public JsonTimelineLabel() {
        this.e = 1;
    }
    
    @Override
    public final Object s() {
        nxs nxs;
        if (!pjr.e((CharSequence)this.a) && this.e != -1) {
            nxs = new nxs(this.a, this.b, this.c, this.d, this.e);
        }
        else {
            nxs = null;
        }
        return nxs;
    }
}
