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
public class JsonTwitterPlace extends fih<qev>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public qev.b c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public String f;
    @JsonField
    public qev[] g;
    @JsonField
    public double[] h;
    @JsonField
    public CoordinateArray i;
    @JsonField
    public JsonPlaceAttributes j;
    @JsonField
    public pqw k;
    
    public JsonTwitterPlace() {
        this.c = qev.b.F0;
    }
    
    public final Object s() {
        final boolean e = ikr.e((CharSequence)this.d);
        Object o = null;
        final ya2 ya2 = null;
        if (!e) {
            final CoordinateArray i = this.i;
            List list2 = null;
            Label_0153: {
                if (i != null) {
                    final ArrayList a = i.a;
                    if (!fq4.t((Collection)a)) {
                        final rif h = rif.H();
                        final Iterator iterator = a.iterator();
                        while (iterator.hasNext()) {
                            for (final List list : (List)iterator.next()) {
                                h.p((Object)new dv6((double)list.get(1), (double)list.get(0)));
                            }
                        }
                        list2 = (List)((n4j)h).e();
                        break Label_0153;
                    }
                }
                list2 = null;
            }
            final double[] h2 = this.h;
            dv6 g;
            if (h2 != null) {
                g = new dv6(h2[1], h2[0]);
            }
            else {
                g = null;
            }
            final qev[] g2 = this.g;
            qev j;
            if (!fq4.v((Object[])g2)) {
                j = g2[g2.length - 1];
            }
            else {
                j = null;
            }
            final qev.a a2 = new qev.a();
            final String d = this.d;
            final String a3 = a2.a;
            String a4 = d;
            if (d == null) {
                a4 = a3;
            }
            a2.a = a4;
            final qev.b c = this.c;
            final qev.b b = a2.b;
            qev.b b2;
            if ((b2 = c) == null) {
                b2 = b;
            }
            a2.b = b2;
            final String a5 = this.a;
            final String c2 = a2.c;
            String c3;
            if ((c3 = a5) == null) {
                c3 = c2;
            }
            a2.c = c3;
            a2.e = this.b;
            final ya2$a b3 = ya2.b;
            ya2 f = ya2;
            if (list2 != null) {
                f = ya2;
                if (list2.size() >= 4) {
                    f = new ya2(list2);
                }
            }
            a2.f = f;
            a2.g = g;
            a2.h = this.e;
            a2.i = this.f;
            a2.j = j;
            final pqw k = this.k;
            final pqw d2 = a2.d;
            pqw d3;
            if ((d3 = k) == null) {
                d3 = d2;
            }
            a2.d = d3;
            final JsonPlaceAttributes l = this.j;
            if (l != null) {
                a2.k = l.a;
                a2.l = l.b;
            }
            o = a2.e();
        }
        return o;
    }
    
    @JsonObject
    public static class CoordinateArray extends qfe
    {
        @JsonField
        public List<List<List<Double>>> a;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonPlaceAttributes extends qfe
    {
        @JsonField
        public String a;
        @JsonField(name = { "twitter" })
        public String b;
    }
}
