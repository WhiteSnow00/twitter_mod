// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.unifiedcard.componentitems;

import com.twitter.model.json.unifiedcard.components.JsonTextContent;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonButton extends aih<b43> implements odc, ude
{
    @JsonField(name = { "destination" })
    public String a;
    @JsonField(typeConverter = JsonButton.JsonButton$c.class)
    public b43$d b;
    @JsonField(name = { "type", "button_type" }, typeConverter = JsonButton.JsonButton$a.class)
    public b43$b c;
    @JsonField(typeConverter = JsonButton.JsonButton$b.class)
    public t77$a d;
    @JsonField
    public JsonTextContent e;
    @JsonField(typeConverter = JsonButton.JsonButton$d.class)
    public b43$e f;
    @JsonField
    public boolean g;
    @JsonField(typeConverter = bwv.class)
    public wr8 h;
    
    public JsonButton() {
        this.b = b43$d.D0;
        this.c = b43$b.C0;
        this.d = t77$a.D0;
        this.f = b43$e.C0;
    }
    
    public final String k() {
        return this.a;
    }
    
    public final void n(final wr8 h) {
        this.h = h;
    }
    
    public final b43 t() {
        final b43$b c = this.c;
        if (c == b43$b.D0) {
            final la7.a a = new la7.a();
            final JsonTextContent e = this.e;
            pf8.r(e);
            a.f = e.a;
            a.g = this.e.b;
            a.p(this.b);
            ((uvv)a).a = this.h;
            a.o(this.c);
            a.d = this.g;
            return (b43)((h4j)a).j();
        }
        if (c == b43$b.E0) {
            final t77$b t77$b = new t77$b();
            t77$b.r(this.d);
            ((b43$a)t77$b).p(this.b);
            ((uvv)t77$b).a = this.h;
            ((b43$a)t77$b).o(this.c);
            ((b43$a)t77$b).q(this.f);
            ((b43$a)t77$b).d = this.g;
            return (b43)((h4j)t77$b).j();
        }
        return null;
    }
}
