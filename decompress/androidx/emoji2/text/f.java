// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.content.pm.PackageManager$NameNotFoundException;
import android.database.ContentObserver;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.content.Context;

public final class f extends c
{
    public static final a e;
    
    static {
        e = new a();
    }
    
    public f(final Context context, final dlb dlb) {
        super(new b(context, dlb));
    }
    
    public static final class a
    {
    }
    
    public static final class b implements g
    {
        public final Context C0;
        public final dlb D0;
        public final a E0;
        public final Object F0;
        public Handler G0;
        public Executor H0;
        public ThreadPoolExecutor I0;
        public h J0;
        public androidx.emoji2.text.g K0;
        public ght L0;
        
        public b(final Context context, final dlb d0) {
            final a e = f.e;
            this.F0 = new Object();
            ri4.r((Object)context, (Object)"Context cannot be null");
            this.C0 = context.getApplicationContext();
            this.D0 = d0;
            this.E0 = e;
        }
        
        public final void a() {
            synchronized (this.F0) {
                this.J0 = null;
                final androidx.emoji2.text.g k0 = this.K0;
                if (k0 != null) {
                    final a e0 = this.E0;
                    final Context c0 = this.C0;
                    Objects.requireNonNull(e0);
                    c0.getContentResolver().unregisterContentObserver((ContentObserver)k0);
                    this.K0 = null;
                }
                final Handler g0 = this.G0;
                if (g0 != null) {
                    g0.removeCallbacks((Runnable)this.L0);
                }
                this.G0 = null;
                final ThreadPoolExecutor i0 = this.I0;
                if (i0 != null) {
                    i0.shutdown();
                }
                this.H0 = null;
                this.I0 = null;
            }
        }
        
        @Override
        public final void b(final h j0) {
            synchronized (this.F0) {
                this.J0 = j0;
                monitorexit(this.F0);
                this.c();
            }
        }
        
        public final void c() {
            synchronized (this.F0) {
                if (this.J0 == null) {
                    return;
                }
                if (this.H0 == null) {
                    final ThreadPoolExecutor a = af6.a("emojiCompat");
                    this.I0 = a;
                    this.H0 = a;
                }
                this.H0.execute((Runnable)new elb((Object)this, 0));
            }
        }
        
        public final tlb d() {
            try {
                final a e0 = this.E0;
                final Context c0 = this.C0;
                final dlb d0 = this.D0;
                Objects.requireNonNull(e0);
                final slb a = clb.a(c0, d0);
                if (a.a != 0) {
                    throw new RuntimeException(gd.y(w48.g("fetchFonts failed ("), a.a, ")"));
                }
                final tlb[] b = a.b;
                if (b != null && b.length != 0) {
                    return b[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            catch (final PackageManager$NameNotFoundException ex) {
                throw new RuntimeException("provider not found", (Throwable)ex);
            }
        }
    }
}
