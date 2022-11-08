// 
// Decompiled by Procyon v0.6.0
// 

public final class e1c implements szs
{
    public final lcv<nws> C0;
    public final bfi D0;
    public final c1c E0;
    public String F0;
    
    public e1c(final lcv<nws> p0, final z7x p1, final bfi$a p2, final i1c p3, final nkf p4, final ibm p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        e1c.C0:Llcv;
        //     9: aload_1        
        //    10: invokevirtual   e7x.c:()Ljn6;
        //    13: invokeinterface jn6.getView:()Landroid/view/View;
        //    18: astore_1       
        //    19: aload           4
        //    21: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    24: pop            
        //    25: aload_1        
        //    26: ldc             2131427779
        //    28: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    31: checkcast       Lcom/twitter/ui/widget/NewItemBannerView;
        //    34: astore_1       
        //    35: aload_1        
        //    36: invokestatic    pf8.r:(Ljava/lang/Object;)Ljava/lang/Object;
        //    39: pop            
        //    40: aload_3        
        //    41: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    44: pop            
        //    45: aload_0        
        //    46: new             Lbfi;
        //    49: dup            
        //    50: aload_1        
        //    51: aload_0        
        //    52: ldc2_w          240000
        //    55: ldc2_w          3000
        //    58: aload_2        
        //    59: invokespecial   bfi.<init>:(Lcom/twitter/ui/widget/NewItemBannerView;Lszs;JJLz7x;)V
        //    62: putfield        e1c.D0:Lbfi;
        //    65: aload_0        
        //    66: new             Lc1c;
        //    69: dup            
        //    70: aload_0        
        //    71: invokespecial   c1c.<init>:(Le1c;)V
        //    74: putfield        e1c.E0:Lc1c;
        //    77: aload_2        
        //    78: invokeinterface raf.a:()Lb5j;
        //    83: new             Ld1c;
        //    86: dup            
        //    87: aload_0        
        //    88: invokespecial   d1c.<init>:(Le1c;)V
        //    91: invokevirtual   b5j.subscribe:(Lwbj;)V
        //    94: aload           5
        //    96: new             Lkg1;
        //    99: dup            
        //   100: aload_0        
        //   101: iconst_5       
        //   102: invokespecial   kg1.<init>:(Ljava/lang/Object;I)V
        //   105: invokeinterface nkf.u1:(Lu93;)V
        //   110: return         
        //    Signature:
        //  (Llcv<Lnws;>;Lz7x;Lbfi$a;Li1c;Lnkf;Libm;)V
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
    
    public final void a() {
        if (this.F0 != null) {
            this.C0.V1(c6e.h((Iterable)this.C0.G1().f(), (otk)new vzf((Object)this, 1)), 0, true);
        }
    }
    
    public final void b() {
    }
    
    public final void c() {
    }
}
