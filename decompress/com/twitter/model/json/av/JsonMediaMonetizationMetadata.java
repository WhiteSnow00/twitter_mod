// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.av;

import java.util.Collection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.FIELD_NAME)
public class JsonMediaMonetizationMetadata extends tih<lxg>
{
    @JsonField
    public boolean a;
    @JsonField
    public List<Integer> b;
    @JsonField
    public List<JsonMediaMonetizationMetadata.JsonMediaMonetizationMetadata$JsonAdvertiser> c;
    @JsonField
    public List<Integer> d;
    @JsonField
    public List<JsonMediaMonetizationMetadata.JsonMediaMonetizationMetadata$JsonAdvertiser> e;
    @JsonField
    public List<Integer> f;
    @JsonField
    public List<Integer> g;
    @JsonField
    public List<Integer> h;
    
    public static List<Long> t(List<JsonMediaMonetizationMetadata.JsonMediaMonetizationMetadata$JsonAdvertiser> iterator) {
        if (iterator == null) {
            return null;
        }
        final ojf h = ojf.H();
        iterator = ((List<JsonMediaMonetizationMetadata.JsonMediaMonetizationMetadata$JsonAdvertiser>)iterator).iterator();
        while (iterator.hasNext()) {
            final JsonMediaMonetizationMetadata.JsonMediaMonetizationMetadata$JsonAdvertiser jsonMediaMonetizationMetadata$JsonAdvertiser = iterator.next();
            try {
                h.p((Object)Long.parseLong(jsonMediaMonetizationMetadata$JsonAdvertiser.a));
            }
            catch (final NumberFormatException ex) {
                r9a.c(new m9a((Throwable)ex));
            }
        }
        return (List)((z4j)h).e();
    }
    
    @Override
    public final Object s() {
        final lxg.a a = new lxg.a();
        a.a = this.a;
        lxg.a.p((aop<Object>)a.b, this.b);
        lxg.a.p((aop<Long>)a.c, t(this.c));
        lxg.a.p((aop<Object>)a.d, this.d);
        lxg.a.p((aop<Long>)a.e, t(this.e));
        lxg.a.p((aop<Object>)a.f, this.f);
        lxg.a.p((aop<Object>)a.g, this.g);
        lxg.a.p((aop<Object>)a.h, this.h);
        return a.e();
    }
}
