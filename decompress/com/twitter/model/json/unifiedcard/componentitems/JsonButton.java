// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.unifiedcard.componentitems;

import com.twitter.model.json.unifiedcard.components.JsonTextContent;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonButton extends tih<l43> implements qdc, yde
{
    @JsonField(name = { "destination" })
    public String a;
    @JsonField(typeConverter = JsonButton.JsonButton$c.class)
    public l43$d b;
    @JsonField(name = { "type", "button_type" }, typeConverter = JsonButton.JsonButton$a.class)
    public l43$b c;
    @JsonField(typeConverter = JsonButton.JsonButton$b.class)
    public c87$a d;
    @JsonField
    public JsonTextContent e;
    @JsonField(typeConverter = JsonButton.JsonButton$d.class)
    public l43$e f;
    @JsonField
    public boolean g;
    @JsonField(typeConverter = ixv.class)
    public ls8 h;
    
    public JsonButton() {
        this.b = l43$d.G0;
        this.c = l43$b.F0;
        this.d = c87$a.G0;
        this.f = l43$e.F0;
    }
    
    public final String k() {
        return this.a;
    }
    
    public final void n(final ls8 h) {
        this.h = h;
    }
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final l43 t() {
        final l43$b c = this.c;
        if (c == l43$b.G0) {
            final va7$a va7$a = new va7$a();
            final JsonTextContent e = this.e;
            vmw.g((Object)e);
            va7$a.f = e.a;
            va7$a.g = this.e.b;
            ((l43.a)va7$a).p(this.b);
            ((axv)va7$a).a = this.h;
            ((l43.a)va7$a).o(this.c);
            ((l43.a)va7$a).d = this.g;
            return (l43)((z4j)va7$a).j();
        }
        if (c == l43$b.H0) {
            final c87$b c87$b = new c87$b();
            c87$b.r(this.d);
            ((l43.a)c87$b).p(this.b);
            ((axv)c87$b).a = this.h;
            ((l43.a)c87$b).o(this.c);
            ((l43.a)c87$b).q(this.f);
            ((l43.a)c87$b).d = this.g;
            return (l43)((z4j)c87$b).j();
        }
        return null;
    }
}
