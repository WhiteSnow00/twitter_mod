// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationCustomFormatting extends tih<uri>
{
    @JsonField(name = { "hex_color" })
    public String a;
    @JsonField(name = { "highlight_indices" })
    public List<List<Integer>> b;
    @JsonField(name = { "bold_indices" })
    public List<List<Integer>> c;
    @JsonField(name = { "italicize_indices" })
    public List<List<Integer>> d;
    
    @Override
    public final Object s() {
        String a;
        if ((a = this.a) == null) {
            a = "#1D98F0";
        }
        final ArrayList b = this.b;
        Object g0 = ged.G0;
        final int a2 = o5j.a;
        List<? extends List<Integer>> list;
        if ((list = b) == null) {
            list = (List<? extends List<Integer>>)g0;
        }
        List<? extends List<Integer>> c;
        if ((c = this.c) == null) {
            c = (List<? extends List<Integer>>)g0;
        }
        final ArrayList d = this.d;
        if (d != null) {
            g0 = d;
        }
        return new uri(a, list, c, (List<? extends List<Integer>>)g0);
    }
}
