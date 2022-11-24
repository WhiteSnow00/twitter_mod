// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.n$a;
import java.util.ArrayList;
import java.util.Collections;
import com.google.android.exoplayer2.drm.b;
import java.util.Map;
import com.google.android.exoplayer2.n;
import android.net.Uri;
import java.util.List;

public class d extends cmc
{
    public static final d n;
    public final List<Uri> d;
    public final List<d.d$b> e;
    public final List<d.d$a> f;
    public final List<d.d$a> g;
    public final List<d.d$a> h;
    public final List<d.d$a> i;
    public final n j;
    public final List<n> k;
    public final Map<String, String> l;
    public final List<b> m;
    
    static {
        n = new d("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    }
    
    public d(final String s, final List<String> list, final List<d.d$b> list2, final List<d.d$a> list3, final List<d.d$a> list4, final List<d.d$a> list5, final List<d.d$a> list6, final n j, final List<n> list7, final boolean b, final Map<String, String> map, final List<b> list8) {
        super(s, (List)list, b);
        final ArrayList list9 = new ArrayList();
        for (int i = 0; i < list2.size(); ++i) {
            final Uri a = list2.get(i).a;
            if (!list9.contains(a)) {
                list9.add(a);
            }
        }
        b(list3, list9);
        b(list4, list9);
        b(list5, list9);
        b(list6, list9);
        this.d = (List<Uri>)Collections.unmodifiableList((List<?>)list9);
        this.e = Collections.unmodifiableList((List<? extends d.d$b>)list2);
        this.f = Collections.unmodifiableList((List<? extends d.d$a>)list3);
        this.g = Collections.unmodifiableList((List<? extends d.d$a>)list4);
        this.h = Collections.unmodifiableList((List<? extends d.d$a>)list5);
        this.i = Collections.unmodifiableList((List<? extends d.d$a>)list6);
        this.j = j;
        List<Object> unmodifiableList;
        if (list7 != null) {
            unmodifiableList = (List<Object>)Collections.unmodifiableList((List<? extends n>)list7);
        }
        else {
            unmodifiableList = null;
        }
        this.k = (List<n>)unmodifiableList;
        this.l = Collections.unmodifiableMap((Map<? extends String, ? extends String>)map);
        this.m = Collections.unmodifiableList((List<? extends b>)list8);
    }
    
    public static void b(final List<d.d$a> list, final List<Uri> list2) {
        for (int i = 0; i < list.size(); ++i) {
            final Uri a = list.get(i).a;
            if (a != null && !list2.contains(a)) {
                list2.add(a);
            }
        }
    }
    
    public static <T> List<T> c(final List<T> list, final int n, final List<akr> list2) {
        final ArrayList list3 = new ArrayList(list2.size());
        for (int i = 0; i < list.size(); ++i) {
            final Object value = list.get(i);
            for (int j = 0; j < list2.size(); ++j) {
                final akr akr = list2.get(j);
                if (akr.G0 == n && akr.H0 == i) {
                    list3.add(value);
                    break;
                }
            }
        }
        return list3;
    }
    
    public static d d(final String s) {
        final Uri parse = Uri.parse(s);
        final n$a n$a = new n$a();
        n$a.a = "0";
        n$a.j = "application/x-mpegURL";
        return new d("", Collections.emptyList(), Collections.singletonList(new d.d$b(parse, n$a.a(), (String)null, (String)null, (String)null, (String)null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }
    
    public final Object a(final List list) {
        return new d(super.a, super.b, c(this.e, 0, list), Collections.emptyList(), c(this.g, 1, list), c(this.h, 2, list), Collections.emptyList(), this.j, this.k, super.c, this.l, this.m);
    }
}
