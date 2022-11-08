// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import java.lang.ref.WeakReference;
import java.util.Objects;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

public final class g
{
    public static g e;
    public final Object a;
    public final Handler b;
    public c c;
    public c d;
    
    public g() {
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), (Handler$Callback)new Handler$Callback() {
            public final boolean handleMessage(final Message message) {
                if (message.what != 0) {
                    return false;
                }
                final g c0 = g.this;
                final c c2 = (c)message.obj;
                synchronized (c0.a) {
                    if (c0.c == c2 || c0.d == c2) {
                        c0.a(c2, 2);
                    }
                    return true;
                }
            }
        });
    }
    
    public static g b() {
        if (g.e == null) {
            g.e = new g();
        }
        return g.e;
    }
    
    public final boolean a(final c c, final int n) {
        final b b = c.a.get();
        if (b != null) {
            this.b.removeCallbacksAndMessages((Object)c);
            b.a(n);
            return true;
        }
        return false;
    }
    
    public final boolean c(final b b) {
        final c c = this.c;
        boolean b2 = true;
        if (c != null) {
            Objects.requireNonNull(c);
            if (b != null && c.a.get() == b) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    public final boolean d(final b b) {
        final c d = this.d;
        boolean b2 = true;
        if (d != null) {
            Objects.requireNonNull(d);
            if (b != null && d.a.get() == b) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    public final void e(final b b) {
        synchronized (this.a) {
            if (this.c(b)) {
                final c c = this.c;
                if (!c.c) {
                    c.c = true;
                    this.b.removeCallbacksAndMessages((Object)c);
                }
            }
        }
    }
    
    public final void f(final b b) {
        synchronized (this.a) {
            if (this.c(b)) {
                final c c = this.c;
                if (c.c) {
                    c.c = false;
                    this.g(c);
                }
            }
        }
    }
    
    public final void g(final c c) {
        int b = c.b;
        if (b == -2) {
            return;
        }
        if (b <= 0) {
            if (b == -1) {
                b = 1500;
            }
            else {
                b = 2750;
            }
        }
        this.b.removeCallbacksAndMessages((Object)c);
        final Handler b2 = this.b;
        b2.sendMessageDelayed(Message.obtain(b2, 0, (Object)c), (long)b);
    }
    
    public final void h() {
        final c d = this.d;
        if (d != null) {
            this.c = d;
            this.d = null;
            final b b = d.a.get();
            if (b != null) {
                b.show();
            }
            else {
                this.c = null;
            }
        }
    }
    
    public interface b
    {
        void a(final int p0);
        
        void show();
    }
    
    public static final class c
    {
        public final WeakReference<b> a;
        public int b;
        public boolean c;
        
        public c(final int b, final b b2) {
            this.a = new WeakReference<b>(b2);
            this.b = b;
        }
    }
}
