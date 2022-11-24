// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterPlace extends tih<efv>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public efv$b c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public String f;
    @JsonField
    public efv[] g;
    @JsonField
    public double[] h;
    @JsonField
    public JsonTwitterPlace.JsonTwitterPlace$CoordinateArray i;
    @JsonField
    public JsonTwitterPlace.JsonTwitterPlace$JsonPlaceAttributes j;
    @JsonField
    public frw k;
    
    public JsonTwitterPlace() {
        this.c = efv$b.H0;
    }
    
    @Override
    public final Object s() {
        final boolean e = flr.e((CharSequence)this.d);
        Object o = null;
        final lb2 lb2 = null;
        if (!e) {
            final JsonTwitterPlace.JsonTwitterPlace$CoordinateArray i = this.i;
            List list2 = null;
            Label_0153: {
                if (i != null) {
                    final ArrayList a = i.a;
                    if (!kr4.t((Collection)a)) {
                        final ojf h = ojf.H();
                        final Iterator iterator = a.iterator();
                        while (iterator.hasNext()) {
                            for (final List list : (List)iterator.next()) {
                                h.p((Object)new jw6((double)list.get(1), (double)list.get(0)));
                            }
                        }
                        list2 = (List)((z4j)h).e();
                        break Label_0153;
                    }
                }
                list2 = null;
            }
            final double[] h2 = this.h;
            jw6 g;
            if (h2 != null) {
                g = new jw6(h2[1], h2[0]);
            }
            else {
                g = null;
            }
            final efv[] g2 = this.g;
            efv j;
            if (!kr4.v((Object[])g2)) {
                j = g2[g2.length - 1];
            }
            else {
                j = null;
            }
            final efv$a efv$a = new efv$a();
            final String d = this.d;
            final String a2 = efv$a.a;
            String a3 = d;
            if (d == null) {
                a3 = a2;
            }
            efv$a.a = a3;
            final efv$b c = this.c;
            final efv$b b = efv$a.b;
            efv$b b2;
            if ((b2 = c) == null) {
                b2 = b;
            }
            efv$a.b = b2;
            final String a4 = this.a;
            final String c2 = efv$a.c;
            String c3;
            if ((c3 = a4) == null) {
                c3 = c2;
            }
            efv$a.c = c3;
            efv$a.e = this.b;
            final lb2.a b3 = lb2.b;
            lb2 f = lb2;
            if (list2 != null) {
                f = lb2;
                if (list2.size() >= 4) {
                    f = new lb2(list2);
                }
            }
            efv$a.f = f;
            efv$a.g = g;
            efv$a.h = this.e;
            efv$a.i = this.f;
            efv$a.j = j;
            final frw k = this.k;
            final frw d2 = efv$a.d;
            frw d3;
            if ((d3 = k) == null) {
                d3 = d2;
            }
            efv$a.d = d3;
            final JsonTwitterPlace.JsonTwitterPlace$JsonPlaceAttributes l = this.j;
            if (l != null) {
                efv$a.k = l.a;
                efv$a.l = l.b;
            }
            o = ((z4j)efv$a).e();
        }
        return o;
    }
}
