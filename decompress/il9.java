import android.os.Message;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import com.google.android.exoplayer2.util.GlUtil;
import android.opengl.GLES20;
import android.opengl.EGLConfig;
import android.os.HandlerThread;
import java.util.Objects;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import android.os.Handler$Callback;
import android.os.Handler;
import android.opengl.EGL14;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class il9 extends Surface
{
    public static int G0;
    public static boolean H0;
    public final boolean D0;
    public final a E0;
    public boolean F0;
    
    public il9(final a e0, final SurfaceTexture surfaceTexture, final boolean d0) {
        super(surfaceTexture);
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public static int a(final Context context) {
        final int a = cnw.a;
        final boolean b = false;
        boolean b2 = false;
        Label_0098: {
            Label_0096: {
                if (a >= 24) {
                    if (a < 26) {
                        if ("samsung".equals(cnw.c)) {
                            break Label_0096;
                        }
                        if ("XT1650".equals(cnw.d)) {
                            break Label_0096;
                        }
                    }
                    if (a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        final String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            b2 = true;
                            break Label_0098;
                        }
                    }
                }
            }
            b2 = false;
        }
        if (!b2) {
            return 0;
        }
        int n;
        if (a < 17) {
            n = (b ? 1 : 0);
        }
        else {
            final String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            n = (b ? 1 : 0);
            if (eglQueryString2 != null) {
                n = (b ? 1 : 0);
                if (eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                    n = 1;
                }
            }
        }
        if (n != 0) {
            return 1;
        }
        return 2;
    }
    
    public static boolean b(final Context context) {
        synchronized (il9.class) {
            final boolean h0 = il9.H0;
            boolean b = true;
            if (!h0) {
                il9.G0 = a(context);
                il9.H0 = true;
            }
            if (il9.G0 == 0) {
                b = false;
            }
            return b;
        }
    }
    
    public static il9 c(Context h0, final boolean b) {
        final int n = 0;
        omy.k(!b || b(h0));
        h0 = (Context)new a();
        int g0;
        if (b) {
            g0 = il9.G0;
        }
        else {
            g0 = 0;
        }
        ((Thread)h0).start();
        final Handler e0 = new Handler(((HandlerThread)h0).getLooper(), (Handler$Callback)h0);
        ((a)h0).E0 = e0;
        ((a)h0).D0 = new EGLSurfaceTexture(e0);
        synchronized (h0) {
            ((a)h0).E0.obtainMessage(1, g0, 0).sendToTarget();
            int n2 = n;
            while (((a)h0).H0 == null && ((a)h0).G0 == null && ((a)h0).F0 == null) {
                try {
                    h0.wait();
                }
                catch (final InterruptedException ex) {
                    n2 = 1;
                }
            }
            monitorexit(h0);
            if (n2 != 0) {
                Thread.currentThread().interrupt();
            }
            final RuntimeException g2 = ((a)h0).G0;
            if (g2 != null) {
                throw g2;
            }
            final Error f0 = ((a)h0).F0;
            if (f0 == null) {
                h0 = (Context)((a)h0).H0;
                Objects.requireNonNull(h0);
                return (il9)h0;
            }
            throw f0;
        }
    }
    
    public final void release() {
        super.release();
        synchronized (this.E0) {
            if (!this.F0) {
                final a e0 = this.E0;
                Objects.requireNonNull(e0.E0);
                e0.E0.sendEmptyMessage(2);
                this.F0 = true;
            }
        }
    }
    
    public static final class a extends HandlerThread implements Handler$Callback
    {
        public EGLSurfaceTexture D0;
        public Handler E0;
        public Error F0;
        public RuntimeException G0;
        public il9 H0;
        
        public a() {
            super("ExoPlayer:DummySurface");
        }
        
        public final void a(final int n) {
            Objects.requireNonNull(this.D0);
            final EGLSurfaceTexture d0 = this.D0;
            Objects.requireNonNull(d0);
            boolean b = false;
            final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay == null) {
                throw new EGLSurfaceTexture.GlException("eglGetDisplay failed");
            }
            final int[] array = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
                throw new EGLSurfaceTexture.GlException("eglInitialize failed");
            }
            d0.F0 = eglGetDisplay;
            final EGLConfig[] array2 = { null };
            final int[] array3 = { 0 };
            final boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, EGLSurfaceTexture.J0, 0, array2, 0, 1, array3, 0);
            if (!eglChooseConfig || array3[0] <= 0 || array2[0] == null) {
                throw new EGLSurfaceTexture.GlException(cnw.m("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", eglChooseConfig, array3[0], array2[0]));
            }
            final EGLConfig eglConfig = array2[0];
            final EGLDisplay f0 = d0.F0;
            int[] array4;
            if (n == 0) {
                final int[] array5;
                array4 = (array5 = new int[3]);
                array5[0] = 12440;
                array5[array5[1] = 2] = 12344;
            }
            else {
                final int[] array6;
                array4 = (array6 = new int[5]);
                array6[0] = 12440;
                array6[array6[1] = 2] = 12992;
                array6[3] = 1;
                array6[4] = 12344;
            }
            final EGLContext eglCreateContext = EGL14.eglCreateContext(f0, eglConfig, EGL14.EGL_NO_CONTEXT, array4, 0);
            if (eglCreateContext == null) {
                throw new EGLSurfaceTexture.GlException("eglCreateContext failed");
            }
            d0.G0 = eglCreateContext;
            final EGLDisplay f2 = d0.F0;
            EGLSurface h0;
            if (n == 1) {
                h0 = EGL14.EGL_NO_SURFACE;
            }
            else {
                int[] array7;
                if (n == 2) {
                    final int[] array8;
                    array7 = (array8 = new int[7]);
                    array8[0] = 12375;
                    array8[1] = 1;
                    array8[2] = 12374;
                    array8[3] = 1;
                    array8[4] = 12992;
                    array8[5] = 1;
                    array8[6] = 12344;
                }
                else {
                    final int[] array9;
                    array7 = (array9 = new int[5]);
                    array9[0] = 12375;
                    array9[1] = 1;
                    array9[2] = 12374;
                    array9[3] = 1;
                    array9[4] = 12344;
                }
                h0 = EGL14.eglCreatePbufferSurface(f2, eglConfig, array7, 0);
                if (h0 == null) {
                    throw new EGLSurfaceTexture.GlException("eglCreatePbufferSurface failed");
                }
            }
            if (EGL14.eglMakeCurrent(f2, h0, h0, eglCreateContext)) {
                d0.H0 = h0;
                GLES20.glGenTextures(1, d0.E0, 0);
                GlUtil.b();
                (d0.I0 = new SurfaceTexture(d0.E0[0])).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)d0);
                final SurfaceTexture i0 = this.D0.I0;
                Objects.requireNonNull(i0);
                if (n != 0) {
                    b = true;
                }
                this.H0 = new il9(this, i0, b);
                return;
            }
            throw new EGLSurfaceTexture.GlException("eglMakeCurrent failed");
        }
        
        public final void b() {
            Objects.requireNonNull(this.D0);
            final EGLSurfaceTexture d0 = this.D0;
            d0.D0.removeCallbacks((Runnable)d0);
            try {
                final SurfaceTexture i0 = d0.I0;
                if (i0 != null) {
                    i0.release();
                    GLES20.glDeleteTextures(1, d0.E0, 0);
                }
            }
            finally {
                final EGLDisplay f0 = d0.F0;
                if (f0 != null && !f0.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                    final EGLDisplay f2 = d0.F0;
                    final EGLSurface egl_NO_SURFACE = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(f2, egl_NO_SURFACE, egl_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                }
                final EGLSurface h0 = d0.H0;
                if (h0 != null && !h0.equals((Object)EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(d0.F0, d0.H0);
                }
                final EGLContext g0 = d0.G0;
                if (g0 != null) {
                    EGL14.eglDestroyContext(d0.F0, g0);
                }
                if (cnw.a >= 19) {
                    EGL14.eglReleaseThread();
                }
                final EGLDisplay f3 = d0.F0;
                if (f3 != null && !f3.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(d0.F0);
                }
                d0.F0 = null;
                d0.G0 = null;
                d0.H0 = null;
                d0.I0 = null;
            }
        }
        
        public final boolean handleMessage(final Message p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/os/Message.what:I
            //     4: istore_2       
            //     5: iload_2        
            //     6: iconst_1       
            //     7: if_icmpeq       51
            //    10: iload_2        
            //    11: iconst_2       
            //    12: if_icmpeq       17
            //    15: iconst_1       
            //    16: ireturn        
            //    17: aload_0        
            //    18: invokevirtual   il9$a.b:()V
            //    21: aload_0        
            //    22: invokevirtual   android/os/HandlerThread.quit:()Z
            //    25: pop            
            //    26: goto            41
            //    29: astore_1       
            //    30: ldc             "DummySurface"
            //    32: ldc             "Failed to release dummy surface"
            //    34: aload_1        
            //    35: invokestatic    g63.s:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //    38: goto            21
            //    41: iconst_1       
            //    42: ireturn        
            //    43: astore_1       
            //    44: aload_0        
            //    45: invokevirtual   android/os/HandlerThread.quit:()Z
            //    48: pop            
            //    49: aload_1        
            //    50: athrow         
            //    51: aload_0        
            //    52: aload_1        
            //    53: getfield        android/os/Message.arg1:I
            //    56: invokevirtual   il9$a.a:(I)V
            //    59: aload_0        
            //    60: monitorenter   
            //    61: aload_0        
            //    62: invokevirtual   java/lang/Object.notify:()V
            //    65: aload_0        
            //    66: monitorexit    
            //    67: goto            131
            //    70: astore_1       
            //    71: aload_0        
            //    72: monitorexit    
            //    73: aload_1        
            //    74: athrow         
            //    75: astore_1       
            //    76: goto            138
            //    79: astore_1       
            //    80: ldc             "DummySurface"
            //    82: ldc             "Failed to initialize dummy surface"
            //    84: aload_1        
            //    85: invokestatic    g63.s:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //    88: aload_0        
            //    89: aload_1        
            //    90: putfield        il9$a.F0:Ljava/lang/Error;
            //    93: aload_0        
            //    94: monitorenter   
            //    95: aload_0        
            //    96: invokevirtual   java/lang/Object.notify:()V
            //    99: aload_0        
            //   100: monitorexit    
            //   101: goto            131
            //   104: astore_1       
            //   105: aload_0        
            //   106: monitorexit    
            //   107: aload_1        
            //   108: athrow         
            //   109: astore_1       
            //   110: ldc             "DummySurface"
            //   112: ldc             "Failed to initialize dummy surface"
            //   114: aload_1        
            //   115: invokestatic    g63.s:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   118: aload_0        
            //   119: aload_1        
            //   120: putfield        il9$a.G0:Ljava/lang/RuntimeException;
            //   123: aload_0        
            //   124: monitorenter   
            //   125: aload_0        
            //   126: invokevirtual   java/lang/Object.notify:()V
            //   129: aload_0        
            //   130: monitorexit    
            //   131: iconst_1       
            //   132: ireturn        
            //   133: astore_1       
            //   134: aload_0        
            //   135: monitorexit    
            //   136: aload_1        
            //   137: athrow         
            //   138: aload_0        
            //   139: monitorenter   
            //   140: aload_0        
            //   141: invokevirtual   java/lang/Object.notify:()V
            //   144: aload_0        
            //   145: monitorexit    
            //   146: aload_1        
            //   147: athrow         
            //   148: astore_1       
            //   149: aload_0        
            //   150: monitorexit    
            //   151: aload_1        
            //   152: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  17     21     29     41     Any
            //  30     38     43     51     Any
            //  51     59     109    138    Ljava/lang/RuntimeException;
            //  51     59     79     109    Ljava/lang/Error;
            //  51     59     75     153    Any
            //  61     67     70     75     Any
            //  71     73     70     75     Any
            //  80     93     75     153    Any
            //  95     101    104    109    Any
            //  105    107    104    109    Any
            //  110    123    75     153    Any
            //  125    131    133    138    Any
            //  134    136    133    138    Any
            //  140    146    148    153    Any
            //  149    151    148    153    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 103, Size: 103
            //     at java.util.ArrayList.rangeCheck(Unknown Source)
            //     at java.util.ArrayList.get(Unknown Source)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
    }
}
