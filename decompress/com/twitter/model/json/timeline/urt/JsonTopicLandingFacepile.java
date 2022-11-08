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
public class JsonTopicLandingFacepile extends aih<jvv>
{
    @JsonField
    public q7t a;
    @JsonField
    public List<String> b;
    @JsonField
    public List<hfv> c;
    
    @Override
    public final Object s() {
        final ArrayList c = this.c;
        if (c != null) {
            final Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                u4c.d().q((hfv)iterator.next());
            }
            this.b = hr4.c((List)this.c, (kub)tp3.w);
        }
        Object o;
        if ((o = this.b) == null) {
            o = v2a.C0;
        }
        return new jvv((List)o, this.a);
    }
}
