// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.model.json.common.InvalidJsonFormatException;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonScoreEvent extends tih<pyo>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public Long c;
    @JsonField
    public tyo d;
    @JsonField
    public String e;
    @JsonField
    public List<syo> f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    @JsonField
    public String i;
    @JsonField
    public String j;
    @JsonField
    public c9t k;
    
    @Override
    public final Object s() {
        final pyo.a a = new pyo.a();
        a.a = this.a;
        a.c = this.b;
        a.d = this.c;
        tyo b;
        if ((b = this.d) == null) {
            b = tyo.G0;
        }
        a.b = b;
        a.e = this.e;
        a.f = this.f;
        a.g = this.g;
        a.h = this.h;
        a.i = this.i;
        a.j = this.j;
        a.k = this.k;
        pyo pyo;
        if ((pyo = (pyo)a.j()) == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(JsonScoreEvent.class.getName());
            sb.append(" parsed error.");
            r9a.d((Throwable)new InvalidJsonFormatException(sb.toString()));
            pyo = null;
        }
        return pyo;
    }
}
