// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import android.os.Handler;
import java.util.Objects;
import java.util.Iterator;
import com.google.android.exoplayer2.n;
import java.util.concurrent.CopyOnWriteArrayList;
import java.io.IOException;

public interface j
{
    void a(final int p0, final i$b p1, final hwg p2);
    
    void d(final int p0, final i$b p1, final f2g p2, final hwg p3);
    
    void i(final int p0, final i$b p1, final hwg p2);
    
    void l(final int p0, final i$b p1, final f2g p2, final hwg p3);
    
    void n(final int p0, final i$b p1, final f2g p2, final hwg p3);
    
    void p(final int p0, final i$b p1, final f2g p2, final hwg p3, final IOException p4, final boolean p5);
    
    public static final class a
    {
        public final int a;
        public final i$b b;
        public final CopyOnWriteArrayList<j.a.a> c;
        public final long d;
        
        public a() {
            final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
            this.c = c;
            this.a = 0;
            this.b = null;
            this.d = 0L;
        }
        
        public a(final CopyOnWriteArrayList<j.a.a> p0, final int p1, final i$b p2, final long p3) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aload_0        
            //     5: aload_1        
            //     6: putfield        com/google/android/exoplayer2/source/j$a.c:Ljava/util/concurrent/CopyOnWriteArrayList;
            //     9: aload_0        
            //    10: iload_2        
            //    11: putfield        com/google/android/exoplayer2/source/j$a.a:I
            //    14: aload_0        
            //    15: aload_3        
            //    16: putfield        com/google/android/exoplayer2/source/j$a.b:Lcom/google/android/exoplayer2/source/i$b;
            //    19: aload_0        
            //    20: lconst_0       
            //    21: putfield        com/google/android/exoplayer2/source/j$a.d:J
            //    24: return         
            //    Signature:
            //  (Ljava/util/concurrent/CopyOnWriteArrayList<Lcom/google/android/exoplayer2/source/j$a$a;>;ILcom/google/android/exoplayer2/source/i$b;J)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 4
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2019)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
        
        public final long a(long n) {
            final long t = cnw.T(n);
            n = -9223372036854775807L;
            if (t != -9223372036854775807L) {
                n = this.d + t;
            }
            return n;
        }
        
        public final void b(final int n, final n n2, final int n3, final Object o, final long n4) {
            this.c(new hwg(1, n, n2, n3, o, this.a(n4), -9223372036854775807L));
        }
        
        public final void c(final hwg hwg) {
            for (final j.a.a a : this.c) {
                cnw.L(a.a, (Runnable)new xzg((Object)this, (Object)a.b, (Object)hwg, 0));
            }
        }
        
        public final void d(final f2g f2g) {
            this.e(f2g, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
        
        public final void e(final f2g f2g, final int n, final int n2, final n n3, final int n4, final Object o, final long n5, final long n6) {
            this.f(f2g, new hwg(n, n2, n3, n4, o, this.a(n5), this.a(n6)));
        }
        
        public final void f(final f2g f2g, final hwg hwg) {
            for (final j.a.a a : this.c) {
                cnw.L(a.a, (Runnable)new a0h((Object)this, (Object)a.b, (Object)f2g, (Object)hwg, 0));
            }
        }
        
        public final void g(final f2g f2g) {
            this.h(f2g, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
        
        public final void h(final f2g f2g, final int n, final int n2, final n n3, final int n4, final Object o, final long n5, final long n6) {
            this.i(f2g, new hwg(n, n2, n3, n4, o, this.a(n5), this.a(n6)));
        }
        
        public final void i(final f2g f2g, final hwg hwg) {
            for (final j.a.a a : this.c) {
                cnw.L(a.a, (Runnable)new yzg((Object)this, (Object)a.b, (Object)f2g, (Object)hwg, 0));
            }
        }
        
        public final void j(final f2g f2g, final int n, final int n2, final n n3, final int n4, final Object o, final long n5, final long n6, final IOException ex, final boolean b) {
            this.l(f2g, new hwg(n, n2, n3, n4, o, this.a(n5), this.a(n6)), ex, b);
        }
        
        public final void k(final f2g f2g, final int n, final IOException ex, final boolean b) {
            this.j(f2g, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, ex, b);
        }
        
        public final void l(final f2g f2g, final hwg hwg, final IOException ex, final boolean b) {
            for (final j.a.a a : this.c) {
                cnw.L(a.a, (Runnable)new c0h(this, a.b, f2g, hwg, ex, b));
            }
        }
        
        public final void m(final f2g f2g, final int n) {
            this.n(f2g, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
        
        public final void n(final f2g f2g, final int n, final int n2, final n n3, final int n4, final Object o, final long n5, final long n6) {
            this.o(f2g, new hwg(n, n2, n3, n4, o, this.a(n5), this.a(n6)));
        }
        
        public final void o(final f2g f2g, final hwg hwg) {
            for (final j.a.a a : this.c) {
                cnw.L(a.a, (Runnable)new zzg((Object)this, (Object)a.b, (Object)f2g, (Object)hwg, 0));
            }
        }
        
        public final void p(final hwg hwg) {
            final i$b b = this.b;
            Objects.requireNonNull(b);
            for (final j.a.a a : this.c) {
                cnw.L(a.a, (Runnable)new b0h((Object)this, (Object)a.b, (Object)b, (Object)hwg, 0));
            }
        }
        
        public final j.a q(final int n, final i$b i$b) {
            return new j.a((CopyOnWriteArrayList)this.c, n, i$b);
        }
        
        public static final class a
        {
            public Handler a;
            public j b;
            
            public a(final Handler a, final j b) {
                this.a = a;
                this.b = b;
            }
        }
    }
}
