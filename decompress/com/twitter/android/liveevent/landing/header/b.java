// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.header;

import android.view.View;
import java.util.Iterator;
import com.twitter.android.liveevent.landing.carousel.d;
import java.util.Set;
import com.twitter.android.liveevent.landing.hero.c;

public final class b extends e7x implements com.twitter.android.liveevent.landing.header.a.a
{
    public final c H0;
    public final com.twitter.android.liveevent.landing.header.a I0;
    public final Set<puf> J0;
    
    public b(final z7x p0, final a p1, final com.twitter.android.liveevent.landing.scribe.a p2, final zxf p3, final com.twitter.android.liveevent.landing.header.a p4, final c p5, final com.twitter.android.liveevent.landing.cover.b p6, final rxf p7, final d p8, final evf p9, final Set<puf> p10) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokespecial   e7x.<init>:(Lz7x;)V
        //     5: aload_0        
        //     6: aload_2        
        //     7: getfield        el8.C0:Landroid/view/View;
        //    10: invokevirtual   e7x.C1:(Landroid/view/View;)V
        //    13: aload_0        
        //    14: aload_3        
        //    15: putfield        com/twitter/android/liveevent/landing/header/b.I0:Lcom/twitter/android/liveevent/landing/header/a;
        //    18: aload_0        
        //    19: aload           4
        //    21: putfield        com/twitter/android/liveevent/landing/header/b.H0:Lcom/twitter/android/liveevent/landing/hero/c;
        //    24: aload_0        
        //    25: aload           8
        //    27: putfield        com/twitter/android/liveevent/landing/header/b.J0:Ljava/util/Set;
        //    30: aload_3        
        //    31: aload_0        
        //    32: putfield        com/twitter/android/liveevent/landing/header/a.e:Lcom/twitter/android/liveevent/landing/header/a$a;
        //    35: aload_0        
        //    36: ldc             2131427543
        //    38: aload           4
        //    40: invokevirtual   e7x.D1:(ILe7x;)V
        //    43: aload_0        
        //    44: ldc             2131427537
        //    46: aload           5
        //    48: invokevirtual   e7x.D1:(ILe7x;)V
        //    51: aload_0        
        //    52: ldc             2131427525
        //    54: aload           6
        //    56: invokevirtual   e7x.D1:(ILe7x;)V
        //    59: aload_0        
        //    60: ldc             2131427527
        //    62: aload           7
        //    64: invokevirtual   e7x.D1:(ILe7x;)V
        //    67: return         
        //    Signature:
        //  (Lz7x;Lcom/twitter/android/liveevent/landing/header/b$a;Lcom/twitter/android/liveevent/landing/scribe/a;Lzxf;Lcom/twitter/android/liveevent/landing/header/a;Lcom/twitter/android/liveevent/landing/hero/c;Lcom/twitter/android/liveevent/landing/cover/b;Lrxf;Lcom/twitter/android/liveevent/landing/carousel/d;Levf;Ljava/util/Set<Lpuf;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 9
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
    
    @Override
    public final void e0(final ouf ouf) {
        final Iterator<puf> iterator = this.J0.iterator();
        while (iterator.hasNext()) {
            iterator.next().e1(ouf);
        }
        final c h0 = this.H0;
        if (!h0.Q0.e() && !h0.S0) {
            final bkc bkc = (bkc)h0.Q0.c();
            final boolean c = h0.K0.c();
            final boolean f = h0.K0.f;
            bkc.o(c);
        }
        else {
            h0.K0.b();
            h0.S0 = false;
        }
    }
    
    public static final class a extends el8
    {
        public a(final View view) {
            super(view.findViewById(2131427525));
        }
    }
}
