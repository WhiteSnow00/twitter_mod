import android.os.Message;
import java.util.Objects;
import android.os.Looper;
import android.os.HandlerThread;
import android.view.Choreographer;
import android.os.Handler;
import android.os.Handler$Callback;
import android.view.Choreographer$FrameCallback;
import android.view.WindowManager;
import android.hardware.display.DisplayManager;
import android.content.Context;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzw
{
    public final y1b a;
    public final b b;
    public final e c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    
    public hzw(final Context context) {
        this.a = new y1b();
        final e e = null;
        Object b = null;
        Label_0100: {
            if (context != null) {
                final Context applicationContext = context.getApplicationContext();
                Object o = null;
                Label_0064: {
                    if (imw.a >= 17) {
                        final DisplayManager displayManager = (DisplayManager)applicationContext.getSystemService("display");
                        if (displayManager != null) {
                            o = new hzw.hzw$d(displayManager);
                            break Label_0064;
                        }
                    }
                    o = null;
                }
                b = o;
                if (o != null) {
                    break Label_0100;
                }
                final WindowManager windowManager = (WindowManager)applicationContext.getSystemService("window");
                if (windowManager != null) {
                    b = new hzw.hzw$c(windowManager);
                    break Label_0100;
                }
            }
            b = null;
        }
        this.b = (b)b;
        e g0 = e;
        if (b != null) {
            g0 = hzw.e.G0;
        }
        this.c = g0;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }
    
    public final void a() {
        if (imw.a >= 30) {
            final Surface e = this.e;
            if (e != null && this.j != Integer.MIN_VALUE) {
                if (this.h != 0.0f) {
                    hzw.a.a(e, this.h = 0.0f);
                }
            }
        }
    }
    
    public final void b() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }
    
    public final void c() {
        if (imw.a >= 30) {
            if (this.e != null) {
                float f;
                if (this.a.a()) {
                    final y1b a = this.a;
                    if (a.a()) {
                        final y1b.a a2 = a.a;
                        final long e = a2.e;
                        long n = 0L;
                        if (e != 0L) {
                            n = a2.f / e;
                        }
                        f = (float)(1.0E9 / n);
                    }
                    else {
                        f = -1.0f;
                    }
                }
                else {
                    f = this.f;
                }
                final float g = this.g;
                if (f == g) {
                    return;
                }
                final boolean b = true;
                final float n2 = fcmpl(f, -1.0f);
                int n4 = 0;
                Label_0263: {
                    if (n2 != 0 && g != -1.0f) {
                        boolean b2 = false;
                        Label_0191: {
                            if (this.a.a()) {
                                final y1b a3 = this.a;
                                long f2;
                                if (a3.a()) {
                                    f2 = a3.a.f;
                                }
                                else {
                                    f2 = -9223372036854775807L;
                                }
                                if (f2 >= 5000000000L) {
                                    b2 = true;
                                    break Label_0191;
                                }
                            }
                            b2 = false;
                        }
                        float n3;
                        if (b2) {
                            n3 = 0.02f;
                        }
                        else {
                            n3 = 1.0f;
                        }
                        if (Math.abs(f - this.g) >= n3) {
                            n4 = (b ? 1 : 0);
                            break Label_0263;
                        }
                    }
                    else {
                        if (n2 != 0) {
                            n4 = (b ? 1 : 0);
                            break Label_0263;
                        }
                        if (this.a.e >= 30) {
                            n4 = (b ? 1 : 0);
                            break Label_0263;
                        }
                    }
                    n4 = 0;
                }
                if (n4 != 0) {
                    this.g = f;
                    this.d(false);
                }
            }
        }
    }
    
    public final void d(final boolean b) {
        if (imw.a >= 30) {
            final Surface e = this.e;
            if (e != null) {
                if (this.j != Integer.MIN_VALUE) {
                    float h;
                    final float n = h = 0.0f;
                    if (this.d) {
                        final float g = this.g;
                        h = n;
                        if (g != -1.0f) {
                            h = this.i * g;
                        }
                    }
                    if (!b && this.h == h) {
                        return;
                    }
                    hzw.a.a(e, this.h = h);
                }
            }
        }
    }
    
    public static final class a
    {
        public static void a(final Surface surface, final float n) {
            int n2;
            if (n == 0.0f) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            try {
                surface.setFrameRate(n, n2);
            }
            catch (final IllegalStateException ex) {
                dml.s("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", (Throwable)ex);
            }
        }
    }
    
    public interface b
    {
        void a(final a p0);
        
        void b();
        
        public interface a
        {
        }
    }
    
    public static final class e implements Choreographer$FrameCallback, Handler$Callback
    {
        public static final e G0;
        public volatile long C0;
        public final Handler D0;
        public Choreographer E0;
        public int F0;
        
        static {
            G0 = new e();
        }
        
        public e() {
            this.C0 = -9223372036854775807L;
            final HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            ((Thread)handlerThread).start();
            final Looper looper = handlerThread.getLooper();
            final int a = imw.a;
            (this.D0 = new Handler(looper, (Handler$Callback)this)).sendEmptyMessage(0);
        }
        
        public final void doFrame(final long c0) {
            this.C0 = c0;
            final Choreographer e0 = this.E0;
            Objects.requireNonNull(e0);
            e0.postFrameCallbackDelayed((Choreographer$FrameCallback)this, 500L);
        }
        
        public final boolean handleMessage(final Message message) {
            final int what = message.what;
            if (what == 0) {
                try {
                    this.E0 = Choreographer.getInstance();
                }
                catch (final RuntimeException ex) {
                    dml.F0("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", (Throwable)ex);
                }
                return true;
            }
            if (what == 1) {
                final Choreographer e0 = this.E0;
                if (e0 != null && ++this.F0 == 1) {
                    e0.postFrameCallback((Choreographer$FrameCallback)this);
                }
                return true;
            }
            if (what != 2) {
                return false;
            }
            final Choreographer e2 = this.E0;
            if (e2 != null && --this.F0 == 0) {
                e2.removeFrameCallback((Choreographer$FrameCallback)this);
                this.C0 = -9223372036854775807L;
            }
            return true;
        }
    }
}
