// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import android.util.Pair;
import android.util.SparseArray;
import com.twitter.model.json.core.JsonMediaSizeVariant;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGiphyImage extends tih<z3c>
{
    public static final String[] d;
    public static final String[] e;
    @JsonField(name = { "id" })
    public String a;
    @JsonField(name = { "url" })
    public String b;
    @JsonField(name = { "images" })
    public Map<String, JsonMediaSizeVariant> c;
    
    static {
        d = new String[] { "fixed_height_still", "fixed_width_still", "fixed_height_small_still", "fixed_width_small_still", "original_still" };
        e = new String[] { "fixed_height_small", "fixed_width_small", "fixed_height_downsampled", "fixed_width_downsampled" };
    }
    
    @Override
    public final Object s() {
        final String a = this.a;
        final Object o = null;
        Object o2;
        if (a != null && this.b != null && this.c != null) {
            final String[] d = JsonGiphyImage.d;
            final SparseArray sparseArray = new SparseArray(5);
            final int n = 0;
            for (int i = 0; i < 5; ++i) {
                final JsonMediaSizeVariant jsonMediaSizeVariant = this.c.get(d[i]);
                if (jsonMediaSizeVariant != null) {
                    final int b = jsonMediaSizeVariant.b;
                    sparseArray.put(b, (Object)new Pair((Object)beq.g(b, jsonMediaSizeVariant.c), (Object)jsonMediaSizeVariant.a));
                }
            }
            if (sparseArray.size() == 0) {
                mqb.o("JsonGiphyImage has no still image");
                o2 = o;
            }
            else {
                final String[] e = JsonGiphyImage.e;
                final int n2 = 0;
                String s = null;
                int j = n;
                int n3 = n2;
                while (j < 4) {
                    final JsonMediaSizeVariant jsonMediaSizeVariant2 = this.c.get(e[j]);
                    int n4 = n3;
                    String a2 = s;
                    if (jsonMediaSizeVariant2 != null) {
                        final int b2 = jsonMediaSizeVariant2.b;
                        n4 = n3;
                        a2 = s;
                        if (b2 > n3) {
                            a2 = jsonMediaSizeVariant2.a;
                            n4 = b2;
                        }
                    }
                    ++j;
                    n3 = n4;
                    s = a2;
                }
                if (s == null) {
                    mqb.o("JsonGiphyImage has no thumbnail");
                    o2 = o;
                }
                else {
                    final JsonMediaSizeVariant jsonMediaSizeVariant3 = this.c.get("original");
                    if (jsonMediaSizeVariant3 == null) {
                        mqb.o("JsonGiphyImage has original image");
                        o2 = o;
                    }
                    else {
                        beq.g(jsonMediaSizeVariant3.b, jsonMediaSizeVariant3.c);
                        o2 = new z3c();
                    }
                }
            }
        }
        else {
            mqb.o("JsonGiphyImage has no id, url, or images");
            o2 = o;
        }
        return o2;
    }
}
