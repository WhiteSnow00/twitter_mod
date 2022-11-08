// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.common.InvalidJsonFormatException;
import android.graphics.Color;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.core.JsonMediaSizeVariant;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTMessageImage extends aih<dpv>
{
    @JsonField
    public List<JsonMediaSizeVariant> a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        final ArrayList a = this.a;
        Object o = null;
        if (a == null) {
            xpa.p("JsonURTMessageImage has no images");
        }
        else {
            final ijf h = ijf.H();
            for (final JsonMediaSizeVariant jsonMediaSizeVariant : this.a) {
                final String a2 = jsonMediaSizeVariant.a;
                if (a2 != null) {
                    h.p((Object)new szg(a2, jsonMediaSizeVariant.b, jsonMediaSizeVariant.c));
                }
            }
            final String b = this.b;
            if (b != null) {
                try {
                    o = new dpv((List)((h4j)h).e(), new bpv(Color.parseColor(b)));
                }
                catch (final IllegalArgumentException ex) {
                    final StringBuilder g = w48.g("Invalid background color: ");
                    g.append(ex.getMessage());
                    e9a.d((Throwable)new InvalidJsonFormatException(g.toString()));
                }
            }
            else {
                o = new dpv((List)((h4j)h).e(), (bpv)null);
            }
        }
        return o;
    }
}
