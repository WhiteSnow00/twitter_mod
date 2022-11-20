// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.search.implementation.results;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import android.content.res.Resources;

@v81
public class SearchPageInfoFactory
{
    public qv a;
    public final Resources b;
    public final n5p c;
    public final Map<String, m7p> d;
    public z7p e;
    
    public SearchPageInfoFactory(final Resources b, final n5p c, final Map<String, m7p> d, final jto jto) {
        this.a = qv.g;
        this.b = b;
        this.c = c;
        this.d = d;
        jto.b((Object)this);
    }
    
    public final int a(final int n) {
        final List<x9p> b = this.b();
        for (int i = 0; i < b.size(); ++i) {
            if (((x9p)b.get(i)).a == n) {
                return i;
            }
        }
        return 0;
    }
    
    public final List<x9p> b() {
        final m7p m7p = this.d.get(this.c.q);
        List<Integer> list;
        if (m7p != null) {
            list = m7p.b;
        }
        else {
            list = rif.w((Object)0, (Object[])new Integer[] { 1, 2, 3, 5 });
        }
        final ArrayList<x9p> list2 = new ArrayList<x9p>();
        for (final Integer n : list) {
            list2.add(new x9p((int)n, n == 1));
        }
        return rif.x((List)list2);
    }
}
