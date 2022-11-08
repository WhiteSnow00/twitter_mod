// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTopicPageHeader extends lhh<eot>
{
    @JsonField
    public gxd a;
    @JsonField
    public qzo b;
    @JsonField
    public got c;
    @JsonField(name = { "landing_context" })
    public String d;
    @JsonField(name = { "display_type" }, typeConverter = fot.class)
    public int e;
    
    @Override
    public final h4j t() {
        final got c = this.c;
        if (c != null && c.a.isEmpty()) {
            this.c = null;
        }
        final eot.a a = new eot.a();
        a.a = this.a;
        a.c = this.c;
        a.b = this.b;
        a.d = this.d;
        a.e = this.e;
        return a;
    }
}
