import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.Layout$Alignment;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Pair;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xbu implements fur
{
    public final ubu F0;
    public final long[] G0;
    public final Map<String, wbu> H0;
    public final Map<String, vbu> I0;
    public final Map<String, String> J0;
    
    public xbu(final ubu f0, final Map<String, wbu> map, final Map<String, vbu> i0, final Map<String, String> j0) {
        this.F0 = f0;
        this.I0 = i0;
        this.J0 = j0;
        this.H0 = Collections.unmodifiableMap((Map<? extends String, ? extends wbu>)map);
        final TreeSet set = new TreeSet();
        int n = 0;
        f0.e(set, false);
        final long[] g0 = new long[set.size()];
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            g0[n] = (long)iterator.next();
            ++n;
        }
        this.G0 = g0;
    }
    
    public final int b(final long n) {
        int b = rnw.b(this.G0, n, false);
        if (b >= this.G0.length) {
            b = -1;
        }
        return b;
    }
    
    public final List<v87> e(final long n) {
        final ubu f0 = this.F0;
        final Map<String, wbu> h0 = this.H0;
        final Map<String, vbu> i0 = this.I0;
        final Map<String, String> j0 = this.J0;
        Objects.requireNonNull(f0);
        final ArrayList list = new ArrayList();
        f0.h(n, f0.h, (List)list);
        final TreeMap treeMap = new TreeMap();
        f0.j(n, false, f0.h, (Map)treeMap);
        f0.i(n, (Map)h0, (Map)i0, f0.h, (Map)treeMap);
        final ArrayList list2 = new ArrayList();
        for (final Pair pair : list) {
            final String s = j0.get(pair.second);
            if (s == null) {
                continue;
            }
            final byte[] decode = Base64.decode(s, 0);
            final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            final vbu vbu = i0.get(pair.first);
            Objects.requireNonNull(vbu);
            list2.add(new v87((CharSequence)null, (Layout$Alignment)null, (Layout$Alignment)null, decodeByteArray, vbu.c, 0, vbu.e, vbu.b, 0, Integer.MIN_VALUE, -3.4028235E38f, vbu.f, vbu.g, false, -16777216, vbu.j, 0.0f));
        }
        for (final Map.Entry<Object, V> entry : treeMap.entrySet()) {
            final vbu vbu2 = i0.get(entry.getKey());
            Objects.requireNonNull(vbu2);
            final v87.a a = (v87.a)entry.getValue();
            final CharSequence a2 = a.a;
            Objects.requireNonNull(a2);
            final SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder)a2;
            for (final kp8 kp8 : (kp8[])spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), (Class)kp8.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart((Object)kp8), spannableStringBuilder.getSpanEnd((Object)kp8), (CharSequence)"");
            }
            for (int l = 0; l < spannableStringBuilder.length(); ++l) {
                if (spannableStringBuilder.charAt(l) == ' ') {
                    int n3;
                    int n2;
                    for (n2 = (n3 = l + 1); n3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(n3) == ' '; ++n3) {}
                    final int n4 = n3 - n2;
                    if (n4 > 0) {
                        spannableStringBuilder.delete(l, n4 + l);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int n5 = 0; n5 < spannableStringBuilder.length() - 1; ++n5) {
                if (spannableStringBuilder.charAt(n5) == '\n') {
                    final int n6 = n5 + 1;
                    if (spannableStringBuilder.charAt(n6) == ' ') {
                        spannableStringBuilder.delete(n6, n5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int n7 = 0; n7 < spannableStringBuilder.length() - 1; ++n7) {
                if (spannableStringBuilder.charAt(n7) == ' ') {
                    final int n8 = n7 + 1;
                    if (spannableStringBuilder.charAt(n8) == '\n') {
                        spannableStringBuilder.delete(n7, n8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            final float c = vbu2.c;
            final int d = vbu2.d;
            a.e = c;
            a.f = d;
            a.g = vbu2.e;
            a.h = vbu2.b;
            a.l = vbu2.f;
            final float m = vbu2.i;
            final int h2 = vbu2.h;
            a.k = m;
            a.j = h2;
            a.p = vbu2.j;
            list2.add(a.a());
        }
        return list2;
    }
    
    public final long f(final int n) {
        return this.G0[n];
    }
    
    public final int g() {
        return this.G0.length;
    }
}
