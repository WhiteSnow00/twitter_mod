// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import androidx.lifecycle.d$c;
import java.util.ArrayList;

public abstract class s
{
    public ArrayList<a> a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList<String> m;
    public ArrayList<String> n;
    public boolean o;
    
    public s() {
        this.a = new ArrayList<a>();
        this.o = false;
    }
    
    public final void b(final a a) {
        this.a.add(a);
        a.d = this.b;
        a.e = this.c;
        a.f = this.d;
        a.g = this.e;
    }
    
    public abstract int c();
    
    public abstract void d();
    
    public abstract void e(final int p0, final Fragment p1, final String p2, final int p3);
    
    public abstract s f(final Fragment p0);
    
    public final s g(final int n, final Fragment fragment, final String s) {
        if (n != 0) {
            this.e(n, fragment, s, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
    
    public abstract s h(final Fragment p0);
    
    public static final class a
    {
        public int a;
        public Fragment b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public d$c h;
        public d$c i;
        
        public a() {
        }
        
        public a(final int a, final Fragment b) {
            this.a = a;
            this.b = b;
            this.c = false;
            final d$c g0 = d$c.G0;
            this.h = g0;
            this.i = g0;
        }
        
        public a(final int a, final Fragment b, final boolean b2) {
            this.a = a;
            this.b = b;
            this.c = true;
            final d$c g0 = d$c.G0;
            this.h = g0;
            this.i = g0;
        }
        
        public a(final Fragment b, final d$c i) {
            this.a = 10;
            this.b = b;
            this.c = false;
            this.h = b.q1;
            this.i = i;
        }
    }
}
