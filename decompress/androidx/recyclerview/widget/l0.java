// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.View;

public final class l0
{
    public final b a;
    public a b;
    
    public l0(final b a) {
        this.a = a;
        this.b = new a();
    }
    
    public final View a(int i, final int n, final int n2, final int n3) {
        final int b = this.a.b();
        final int c = this.a.c();
        int n4;
        if (n > i) {
            n4 = 1;
        }
        else {
            n4 = -1;
        }
        View view = null;
        while (i != n) {
            final View d = this.a.d(i);
            final int a = this.a.a(d);
            final int e = this.a.e(d);
            final a b2 = this.b;
            b2.b = b;
            b2.c = c;
            b2.d = a;
            b2.e = e;
            if (n2 != 0) {
                b2.a = 0;
                b2.a(n2);
                if (this.b.b()) {
                    return d;
                }
            }
            View view2 = view;
            if (n3 != 0) {
                final a b3 = this.b;
                b3.a = 0;
                b3.a(n3);
                view2 = view;
                if (this.b.b()) {
                    view2 = d;
                }
            }
            i += n4;
            view = view2;
        }
        return view;
    }
    
    public final boolean b(final View view) {
        final a b = this.b;
        final int b2 = this.a.b();
        final int c = this.a.c();
        final int a = this.a.a(view);
        final int e = this.a.e(view);
        b.b = b2;
        b.c = c;
        b.d = a;
        b.e = e;
        final a b3 = this.b;
        b3.a = 0;
        b3.a(24579);
        return this.b.b();
    }
    
    public static final class a
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        
        public a() {
            this.a = 0;
        }
        
        public final void a(final int n) {
            this.a |= n;
        }
        
        public final boolean b() {
            final int a = this.a;
            if ((a & 0x7) != 0x0 && (a & this.c(this.d, this.b) << 0) == 0x0) {
                return false;
            }
            final int a2 = this.a;
            if ((a2 & 0x70) != 0x0 && (a2 & this.c(this.d, this.c) << 4) == 0x0) {
                return false;
            }
            final int a3 = this.a;
            if ((a3 & 0x700) != 0x0 && (a3 & this.c(this.e, this.b) << 8) == 0x0) {
                return false;
            }
            final int a4 = this.a;
            return (a4 & 0x7000) == 0x0 || (a4 & this.c(this.e, this.c) << 12) != 0x0;
        }
        
        public final int c(final int n, final int n2) {
            if (n > n2) {
                return 1;
            }
            if (n == n2) {
                return 2;
            }
            return 4;
        }
    }
    
    public interface b
    {
        int a(final View p0);
        
        int b();
        
        int c();
        
        View d(final int p0);
        
        int e(final View p0);
    }
}
