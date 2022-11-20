// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationCustomFormatting extends fih<eri>
{
    @JsonField(name = { "hex_color" })
    public String a;
    @JsonField(name = { "highlight_indices" })
    public List<List<Integer>> b;
    @JsonField(name = { "bold_indices" })
    public List<List<Integer>> c;
    @JsonField(name = { "italicize_indices" })
    public List<List<Integer>> d;
    
    public final Object s() {
        String a;
        if ((a = this.a) == null) {
            a = "#1D98F0";
        }
        final ArrayList b = this.b;
        Object e0 = gdd.E0;
        final int a2 = c5j.a;
        List list;
        if ((list = b) == null) {
            list = (List)e0;
        }
        List c;
        if ((c = this.c) == null) {
            c = (List)e0;
        }
        final ArrayList d = this.d;
        if (d != null) {
            e0 = d;
        }
        return new eri(a, list, c, (List)e0);
    }
}
