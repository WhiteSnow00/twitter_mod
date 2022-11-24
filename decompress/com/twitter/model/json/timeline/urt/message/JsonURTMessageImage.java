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
public class JsonURTMessageImage extends tih<lqv>
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
            mqb.o("JsonURTMessageImage has no images");
        }
        else {
            final ojf h = ojf.H();
            for (final JsonMediaSizeVariant jsonMediaSizeVariant : this.a) {
                final String a2 = jsonMediaSizeVariant.a;
                if (a2 != null) {
                    h.p((Object)new l0h(a2, jsonMediaSizeVariant.b, jsonMediaSizeVariant.c));
                }
            }
            final String b = this.b;
            if (b != null) {
                try {
                    o = new lqv((List)((z4j)h).e(), new jqv(Color.parseColor(b)));
                }
                catch (final IllegalArgumentException ex) {
                    final StringBuilder f = ehk.f("Invalid background color: ");
                    f.append(ex.getMessage());
                    r9a.d((Throwable)new InvalidJsonFormatException(f.toString()));
                }
            }
            else {
                o = new lqv((List)((z4j)h).e(), (jqv)null);
            }
        }
        return o;
    }
}
