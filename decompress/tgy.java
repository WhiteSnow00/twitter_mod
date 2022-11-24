import java.util.Iterator;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import java.util.Objects;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.ref.WeakReference;
import android.content.Intent;
import java.util.Set;
import java.util.List;
import android.content.Context;
import android.os.Handler;
import java.util.Map;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tgy<T extends IInterface>
{
    public static final Map<String, Handler> o;
    public final Context a;
    public final h4a b;
    public final String c;
    public final List<cdy> d;
    public final Set<ffz<?>> e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final cfy<T> i;
    public final WeakReference<vey> j;
    public final ldy k;
    public final AtomicInteger l;
    public kgy m;
    public T n;
    
    static {
        tgy.o = new HashMap();
    }
    
    public tgy(final Context p0, final h4a p1, final String p2, final Intent p3, final cfy<T> p4, final vey p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/ArrayList;
        //     8: dup            
        //     9: invokespecial   java/util/ArrayList.<init>:()V
        //    12: putfield        tgy.d:Ljava/util/ArrayList;
        //    15: aload_0        
        //    16: new             Ljava/util/HashSet;
        //    19: dup            
        //    20: invokespecial   java/util/HashSet.<init>:()V
        //    23: putfield        tgy.e:Ljava/util/HashSet;
        //    26: aload_0        
        //    27: new             Ljava/lang/Object;
        //    30: dup            
        //    31: invokespecial   java/lang/Object.<init>:()V
        //    34: putfield        tgy.f:Ljava/lang/Object;
        //    37: aload_0        
        //    38: new             Lldy;
        //    41: dup            
        //    42: aload_0        
        //    43: invokespecial   ldy.<init>:(Ltgy;)V
        //    46: putfield        tgy.k:Lldy;
        //    49: aload_0        
        //    50: new             Ljava/util/concurrent/atomic/AtomicInteger;
        //    53: dup            
        //    54: iconst_0       
        //    55: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:(I)V
        //    58: putfield        tgy.l:Ljava/util/concurrent/atomic/AtomicInteger;
        //    61: aload_0        
        //    62: aload_1        
        //    63: putfield        tgy.a:Landroid/content/Context;
        //    66: aload_0        
        //    67: aload_2        
        //    68: putfield        tgy.b:Lh4a;
        //    71: aload_0        
        //    72: aload_3        
        //    73: putfield        tgy.c:Ljava/lang/String;
        //    76: aload_0        
        //    77: aload           4
        //    79: putfield        tgy.h:Landroid/content/Intent;
        //    82: aload_0        
        //    83: aload           5
        //    85: putfield        tgy.i:Lcfy;
        //    88: aload_0        
        //    89: new             Ljava/lang/ref/WeakReference;
        //    92: dup            
        //    93: aconst_null    
        //    94: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //    97: putfield        tgy.j:Ljava/lang/ref/WeakReference;
        //   100: return         
        //    Signature:
        //  (Landroid/content/Context;Lh4a;Ljava/lang/String;Landroid/content/Intent;Lcfy<TT;>;Lvey;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 6
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
    
    public final Handler a() {
        final HashMap o = tgy.o;
        synchronized (o) {
            if (!o.containsKey(this.c)) {
                final HandlerThread handlerThread = new HandlerThread(this.c, 10);
                ((Thread)handlerThread).start();
                o.put(this.c, new Handler(handlerThread.getLooper()));
            }
            return (Handler)o.get(this.c);
        }
    }
    
    public final void b(final cdy cdy, final ffz<?> ffz) {
        synchronized (this.f) {
            this.e.add(ffz);
            final crz a = ffz.a;
            final xhy xhy = new xhy(this, (ffz)ffz);
            Objects.requireNonNull(a);
            a.b.b((n7z)new hjy((Executor)zcs.a, (thj)xhy));
            a.e();
            monitorexit(this.f);
            synchronized (this.f) {
                if (this.l.getAndIncrement() > 0) {
                    this.b.i("Already connected to the service.", new Object[0]);
                }
                monitorexit(this.f);
                this.a().post((Runnable)new bey(this, cdy.F0, cdy));
            }
        }
    }
    
    public final void c(ffz<?> f) {
        synchronized (this.f) {
            this.e.remove(f);
            monitorexit(this.f);
            f = this.f;
            synchronized (f) {
                if (this.l.decrementAndGet() > 0) {
                    this.b.l("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                monitorexit(f);
                f = new mey(this);
                this.a().post((Runnable)f);
            }
        }
    }
    
    public final void d() {
        synchronized (this.f) {
            final Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((ffz)iterator.next()).a((Exception)new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
            }
            this.e.clear();
        }
    }
}
