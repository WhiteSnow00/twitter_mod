// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTopicLandingFacepile extends tih<pwv>
{
    @JsonField
    public c9t a;
    @JsonField
    public List<String> b;
    @JsonField
    public List<qgv> c;
    
    @Override
    public final Object s() {
        final ArrayList c = this.c;
        if (c != null) {
            final Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                y4c.d().q((qgv)iterator.next());
            }
            this.b = kr4.c((List)this.c, (lub)edv.u);
        }
        Object o;
        if ((o = this.b) == null) {
            o = h3a.F0;
        }
        return new pwv((List<String>)o, this.a);
    }
}
