import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a6a extends gue implements jub<jkh, m76, Integer, jkh>
{
    public final /* synthetic */ wyt<o5a> C0;
    public final /* synthetic */ q7r<mp3> D0;
    public final /* synthetic */ q7r<mp3> E0;
    public final /* synthetic */ String F0;
    
    public a6a(final wyt<o5a> p0, final q7r<mp3> p1, final q7r<mp3> p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: putfield        a6a.C0:Lwyt;
        //     5: aload_0        
        //     6: aload_2        
        //     7: putfield        a6a.D0:Lq7r;
        //    10: aload_0        
        //    11: aload_3        
        //    12: putfield        a6a.E0:Lq7r;
        //    15: aload_0        
        //    16: ldc             "Built-in"
        //    18: putfield        a6a.F0:Ljava/lang/String;
        //    21: aload_0        
        //    22: iconst_3       
        //    23: invokespecial   gue.<init>:(I)V
        //    26: return         
        //    Signature:
        //  (Lwyt<Lo5a;>;Lq7r<Lmp3;>;Lq7r<Lmp3;>;Ljava/lang/String;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
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
    
    public final Object h0(Object o, Object o2, final Object o3) {
        final jkh jkh = (jkh)o;
        final m76 m76 = (m76)o2;
        lf.x((Number)o3, jkh, "$this$composed", m76, -140634085);
        final ea6$b a = ea6.a;
        final wyt<o5a> c0 = this.C0;
        m76.x(1157296644);
        final boolean p3 = m76.P((Object)c0);
        o2 = m76.y();
        Label_0099: {
            if (!p3) {
                Objects.requireNonNull(m76.Companion);
                if ((o = o2) != m76$a.b) {
                    break Label_0099;
                }
            }
            o = nkz.r((Object)Boolean.FALSE);
            m76.p(o);
        }
        m76.O();
        final luh luh = (luh)o;
        if (this.C0.b() == this.C0.f() && !this.C0.g()) {
            luh.setValue(Boolean.FALSE);
        }
        else if (this.D0.getValue() != null || this.E0.getValue() != null) {
            luh.setValue(Boolean.TRUE);
        }
        jkh e = jkh;
        if (((q7r)luh).getValue()) {
            final boolean c2 = this.C0.d().c((Object)o5a.C0, (Object)o5a.D0);
            final q7r<mp3> d0 = this.D0;
            final q7r<mp3> e2 = this.E0;
            dx dx = null;
            Label_0335: {
                if (c2) {
                    final mp3 mp3 = (mp3)d0.getValue();
                    if (mp3 != null && (dx = mp3.a) != null) {
                        break Label_0335;
                    }
                    final mp3 mp4 = (mp3)e2.getValue();
                    if (mp4 != null) {
                        dx = mp4.a;
                        break Label_0335;
                    }
                }
                else {
                    final mp3 mp5 = (mp3)e2.getValue();
                    if (mp5 != null && (dx = mp5.a) != null) {
                        break Label_0335;
                    }
                    final mp3 mp6 = (mp3)d0.getValue();
                    if (mp6 != null) {
                        dx = mp6.a;
                        break Label_0335;
                    }
                }
                dx = null;
            }
            final q7r v = nkz.v((Object)dx, m76);
            final wyt<o5a> c3 = this.C0;
            final chv d2 = sow.d(iud.Companion);
            final String f0 = this.F0;
            m76.x(-492369756);
            o2 = m76.y();
            Objects.requireNonNull(m76.Companion);
            final m76$a$a b = m76$a.b;
            if ((o = o2) == b) {
                final StringBuilder sb = new StringBuilder();
                sb.append(f0);
                sb.append(" shrink/expand");
                o = sb.toString();
                m76.p(o);
            }
            m76.O();
            final String s = (String)o;
            boolean b2 = false;
            final wyt$a a2 = ozt.a((wyt)c3, d2, s, m76, 0);
            m76.D(-1553214439, (Object)(this.C0.b() == this.C0.f()));
            final wyt<o5a> c4 = this.C0;
            final chv c5 = sow.c(cud.Companion);
            final String f2 = this.F0;
            m76.x(-492369756);
            o2 = m76.y();
            if ((o = o2) == b) {
                o = new StringBuilder();
                ((StringBuilder)o).append(f2);
                ((StringBuilder)o).append(" InterruptionHandlingOffset");
                o = ((StringBuilder)o).toString();
                m76.p(o);
            }
            m76.O();
            final wyt$a a3 = ozt.a((wyt)c4, c5, (String)o, m76, 0);
            m76.N();
            final wyt<o5a> c6 = this.C0;
            final q7r<mp3> d3 = this.D0;
            final q7r<mp3> e3 = this.E0;
            m76.x(1157296644);
            final boolean p4 = m76.P((Object)c6);
            o2 = m76.y();
            if (p4 || (o = o2) == b) {
                o = new wha(a2, a3, (q7r)d3, (q7r)e3, v);
                m76.p(o);
            }
            m76.O();
            final wha wha = (wha)o;
            if (this.C0.b() == this.C0.f()) {
                wha.H0 = null;
            }
            else if (wha.H0 == null) {
                Object b3;
                if ((b3 = v.getValue()) == null) {
                    Objects.requireNonNull(dx.Companion);
                    b3 = dx$a.b;
                }
                wha.H0 = (dx)b3;
            }
            final mp3 mp7 = (mp3)this.D0.getValue();
            Label_0853: {
                if (mp7 == null || mp7.d) {
                    final mp3 mp8 = (mp3)this.E0.getValue();
                    if (mp8 == null || mp8.d) {
                        break Label_0853;
                    }
                }
                b2 = true;
            }
            jkh jkh2 = jkh.Companion;
            if (!b2) {
                jkh2 = rp2.B(jkh2);
            }
            e = jkh.E(jkh2).E((jkh)wha);
        }
        m76.O();
        return e;
    }
}
