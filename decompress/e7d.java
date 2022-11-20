import android.os.Handler;
import android.os.Message;
import android.os.Looper;
import java.util.Objects;
import android.os.HandlerThread;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e7d extends uj1<m6d> implements Closeable
{
    public final fqh D0;
    public final l7d E0;
    public final j7d F0;
    public final dzr<Boolean> G0;
    public e7d.e7d$a H0;
    
    public e7d(final fqh p0, final l7d p1, final j7d p2, final dzr<Boolean> p3, final dzr<Boolean> p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   uj1.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        e7d.D0:Lfqh;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        e7d.E0:Ll7d;
        //    14: aload_0        
        //    15: aload_3        
        //    16: putfield        e7d.F0:Lj7d;
        //    19: aload_0        
        //    20: aload           4
        //    22: putfield        e7d.G0:Ldzr;
        //    25: return         
        //    Signature:
        //  (Lfqh;Ll7d;Lj7d;Ldzr<Ljava/lang/Boolean;>;Ldzr<Ljava/lang/Boolean;>;)V
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
    
    public final void a(final String a, final Object o, final kp6.a a2) {
        final m6d e = (m6d)o;
        final long now = this.D0.now();
        final l7d e2 = this.e();
        e2.A = a2;
        e2.k = now;
        e2.o = now;
        e2.a = a;
        e2.e = e;
        this.h(e2, 3);
    }
    
    public final void b(final String a, final kp6.a a2) {
        final long now = this.D0.now();
        final l7d e = this.e();
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
    
    public final void c(final String a, final Throwable u, final kp6.a a2) {
        final long now = this.D0.now();
        final l7d e = this.e();
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
    
    public final void d(final String a, final Object d, final kp6.a a2) {
        final long now = this.D0.now();
        final l7d e = this.e();
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
    
    public final l7d e() {
        l7d e0;
        if (Boolean.FALSE) {
            e0 = new l7d();
        }
        else {
            e0 = this.E0;
        }
        return e0;
    }
    
    public final boolean f() {
        final boolean booleanValue = (boolean)this.G0.get();
        if (booleanValue && this.H0 == null) {
            synchronized (this) {
                if (this.H0 == null) {
                    final HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
                    ((Thread)handlerThread).start();
                    final Looper looper = handlerThread.getLooper();
                    Objects.requireNonNull(looper);
                    this.H0 = new e7d.e7d$a(looper, this.F0);
                }
            }
        }
        return booleanValue;
    }
    
    public final void h(final l7d obj, final int arg1) {
        if (this.f()) {
            final e7d.e7d$a h0 = this.H0;
            Objects.requireNonNull(h0);
            final Message obtainMessage = ((Handler)h0).obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = arg1;
            obtainMessage.obj = obj;
            ((Handler)this.H0).sendMessage(obtainMessage);
        }
        else {
            ((i7d)this.F0).b(obj, arg1);
        }
    }
    
    public final void i(final l7d obj, final int arg1) {
        if (this.f()) {
            final e7d.e7d$a h0 = this.H0;
            Objects.requireNonNull(h0);
            final Message obtainMessage = ((Handler)h0).obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = arg1;
            obtainMessage.obj = obj;
            ((Handler)this.H0).sendMessage(obtainMessage);
        }
        else {
            ((i7d)this.F0).a(obj, arg1);
        }
    }
}
