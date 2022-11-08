// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.model.json.card.JsonGraphQlCard;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineCard extends aih<wrs>
{
    @JsonField
    public String a;
    @JsonField
    public JsonGraphQlCard b;
    @JsonField(name = { "text", "cardText" })
    public String c;
    @JsonField(name = { "subtext", "cardSubtext" })
    public String d;
    @JsonField(typeConverter = jj3.class)
    public int e;
    
    public JsonTimelineCard() {
        this.e = 1;
    }
    
    @Override
    public final Object s() {
        final JsonGraphQlCard b = this.b;
        if (b != null) {
            final tj3 a = b.a;
            if (a != null) {
                this.a = a.b;
                final u4c.a d = u4c.d();
                final tj3 a2 = this.b.a;
                d.r();
                ((sjg)d.d).w((Object)a2.b, (Object)a2);
            }
        }
        Object o;
        if (pjr.e((CharSequence)this.a)) {
            o = null;
        }
        else {
            final String a3 = this.a;
            final String c = this.c;
            String s = "";
            String s2;
            if ((s2 = c) == null) {
                s2 = "";
            }
            final String d2 = this.d;
            if (d2 != null) {
                s = d2;
            }
            o = new wrs(a3, s2, s, this.e);
        }
        return o;
    }
}
