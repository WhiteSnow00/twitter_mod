// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Map;
import android.text.Html;
import java.util.regex.Pattern;

public final class b
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("(&#13;)?&#10;");
    }
    
    public static String a(final CharSequence charSequence) {
        return b.a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
    
    public static final class b
    {
        public final String a;
        public final Map<String, String> b;
        
        public b(final String a, final Map b, final b$a object) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c
    {
        public static final Comparator<c> e;
        public static final Comparator<c> f;
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        
        static {
            c.e = ck8.G0;
            c.f = uve.H0;
        }
        
        public c(final int a, final int b, final String c, final String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class d
    {
        public final List<c> a;
        public final List<c> b;
        
        public d() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }
    }
}
