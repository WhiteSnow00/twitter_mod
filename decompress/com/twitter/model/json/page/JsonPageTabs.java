// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonPageTabs extends lhh<xsj>
{
    @JsonField(name = { "tabs", "timelines" })
    public List<wsj> a;
    @JsonField
    public String b;
    @JsonField
    public wsj c;
    
    @Override
    public final h4j t() {
        final xsj$a xsj$a = new xsj$a();
        xsj$a.a = this.a;
        xsj$a.b = this.b;
        xsj$a.c = this.c;
        return (h4j)xsj$a;
    }
}
