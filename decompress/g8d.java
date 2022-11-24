import android.os.Handler;
import android.os.Message;
import android.os.Looper;
import java.util.Objects;
import android.os.HandlerThread;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g8d extends yj1<n7d> implements Closeable
{
    public final uqh F0;
    public final n8d G0;
    public final l8d H0;
    public final zzr<Boolean> I0;
    public g8d.g8d$a J0;
    
    public g8d(final uqh p0, final n8d p1, final l8d p2, final zzr<Boolean> p3, final zzr<Boolean> p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   yj1.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        g8d.F0:Luqh;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        g8d.G0:Ln8d;
        //    14: aload_0        
        //    15: aload_3        
        //    16: putfield        g8d.H0:Ll8d;
        //    19: aload_0        
        //    20: aload           4
        //    22: putfield        g8d.I0:Lzzr;
        //    25: return         
        //    Signature:
        //  (Luqh;Ln8d;Ll8d;Lzzr<Ljava/lang/Boolean;>;Lzzr<Ljava/lang/Boolean;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 5
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public final void a(final String a, final Object o, final qq6$a a2) {
        final n7d e = (n7d)o;
        final long now = this.F0.now();
        final n8d e2 = this.e();
        e2.A = a2;
        e2.k = now;
        e2.o = now;
        e2.a = a;
        e2.e = e;
        this.h(e2, 3);
    }
    
    public final void b(final String a, final qq6$a a2) {
        final long now = this.F0.now();
        final n8d e = this.e();
        e.A = a2;
        e.a = a;
        final int v = e.v;
        if (v != 3 && v != 5 && v != 6) {
            e.m = now;
            this.h(e, 4);
        }
        e.w = 2;
        e.y = now;
        this.i(e, 2);
    }
    
    public final void c(final String a, final Throwable u, final qq6$a a2) {
        final long now = this.F0.now();
        final n8d e = this.e();
        e.A = a2;
        e.l = now;
        e.a = a;
        e.u = u;
        this.h(e, 5);
        e.w = 2;
        e.y = now;
        this.i(e, 2);
    }
    
    public final void close() {
        this.e().a();
    }
    
    public final void d(final String a, final Object d, final qq6$a a2) {
        final long now = this.F0.now();
        final n8d e = this.e();
        e.b();
        e.i = now;
        e.a = a;
        e.d = d;
        e.A = a2;
        this.h(e, 0);
        e.w = 1;
        e.x = now;
        this.i(e, 1);
    }
    
    public final n8d e() {
        n8d g0;
        if (Boolean.FALSE) {
            g0 = new n8d();
        }
        else {
            g0 = this.G0;
        }
        return g0;
    }
    
    public final boolean f() {
        final boolean booleanValue = this.I0.get();
        if (booleanValue && this.J0 == null) {
            synchronized (this) {
                if (this.J0 == null) {
                    final HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
                    ((Thread)handlerThread).start();
                    final Looper looper = handlerThread.getLooper();
                    Objects.requireNonNull(looper);
                    this.J0 = new g8d.g8d$a(looper, this.H0);
                }
            }
        }
        return booleanValue;
    }
    
    public final void h(final n8d obj, final int arg1) {
        if (this.f()) {
            final g8d.g8d$a j0 = this.J0;
            Objects.requireNonNull(j0);
            final Message obtainMessage = ((Handler)j0).obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = arg1;
            obtainMessage.obj = obj;
            ((Handler)this.J0).sendMessage(obtainMessage);
        }
        else {
            ((k8d)this.H0).b(obj, arg1);
        }
    }
    
    public final void i(final n8d obj, final int arg1) {
        if (this.f()) {
            final g8d.g8d$a j0 = this.J0;
            Objects.requireNonNull(j0);
            final Message obtainMessage = ((Handler)j0).obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = arg1;
            obtainMessage.obj = obj;
            ((Handler)this.J0).sendMessage(obtainMessage);
        }
        else {
            ((k8d)this.H0).a(obj, arg1);
        }
    }
}
