import android.database.CursorWrapper;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bld extends ows implements ykd
{
    public final uts I0;
    public final boolean J0;
    public final int K0;
    
    public bld(final uts i0, final s97<? extends nws> s97, final int k0) {
        super((Cursor)i0, s97, 0);
        this.I0 = i0;
        this.J0 = false;
        this.K0 = k0;
    }
    
    public bld(final uts p0, final s97<? extends nws> p1, final int p2, final boolean p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: iload_3        
        //     4: invokespecial   ows.<init>:(Landroid/database/Cursor;Ls97;I)V
        //     7: aload_0        
        //     8: aload_1        
        //     9: putfield        bld.I0:Luts;
        //    12: aload_0        
        //    13: iconst_1       
        //    14: putfield        bld.J0:Z
        //    17: aload_0        
        //    18: iload           4
        //    20: putfield        bld.K0:I
        //    23: return         
        //    Signature:
        //  (Luts;Ls97<+Lnws;>;IZI)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 5
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
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
    
    public final int e(final long n) {
        final uts i0 = this.I0;
        int n2 = -1;
        if (i0 != null) {
            final int e = i0.e(n);
            n2 = n2;
            if (e >= 0) {
                n2 = e;
            }
        }
        return n2;
    }
    
    @Override
    public final Object m(int a) {
        final nws nws = null;
        Object o;
        try {
            final nws nws2 = (nws)super.m(a);
            final uts i0 = this.I0;
            o = nws2;
            if (i0 != null && (o = nws2) != null) {
                if (!i0.J0.d.contains(nws2.d())) {
                    o = nws2;
                }
                else {
                    o = nws;
                    if (nws2.a > 0L) {
                        o = nws;
                        if (nws2.k()) {
                            o = ((h4j)new fgx.a(nws2)).e();
                        }
                    }
                }
            }
        }
        catch (final IllegalStateException b) {
            final int k0 = this.K0;
            final zf4.a a2 = new zf4.a(UserIdentifier.getCurrent());
            final String q = pb.Q(k0);
            String s;
            if (k0 == 17) {
                s = "home";
            }
            else if (k0 == 34) {
                s = "latest";
            }
            else {
                s = "";
            }
            a2.o(q, s, "", "", "hydration_failed");
            xca.a().b(UserIdentifier.getCurrent(), (okm)a2.e());
            final uts i2 = this.I0;
            final aav p = aav.p2();
            Object j;
            if (i2 == null) {
                j = ged.C0;
                final int a3 = w4j.a;
            }
            else if (((CursorWrapper)i2).getInt(uvs.e) != 1) {
                j = ged.C0;
                final int a4 = w4j.a;
            }
            else {
                j = ij1.i((loo)new ald((Cursor)i2, b, p));
                Objects.requireNonNull(j);
            }
            if (this.J0) {
                final Cursor p2 = new v97((Cursor)this.I0).p(a);
                Object o2 = null;
                Label_0406: {
                    if (p2 != null) {
                        long n;
                        if (mlw.d(p2)) {
                            n = p2.getLong(uvs.b);
                        }
                        else {
                            n = p2.getLong(tnu.z);
                        }
                        final ous ous = new ous();
                        if (n > 0L && mlw.d(p2)) {
                            final m9a.a a5 = new m9a.a(n);
                            a5.k = (Map<String, String>)j;
                            a5.c = ous.d(p2);
                            a = w4j.a;
                            o2 = ((h4j)a5).e();
                            break Label_0406;
                        }
                    }
                    o2 = null;
                }
                if (o2 != null) {
                    final z8a z8a = new z8a(UserIdentifier.getCurrent().getId());
                    z8a.b = b;
                    for (final Map.Entry<String, V> entry : ((Map<String, String>)j).entrySet()) {
                        final String s2 = entry.getKey();
                        final V value = entry.getValue();
                        zzd.f((Object)s2, "key");
                        zzd.f((Object)value, "value");
                        z8a.b(s2, (Object)value);
                    }
                    e9a.c(z8a);
                    o = o2;
                    return o;
                }
            }
            final r8a a6 = e9a.b().a;
            a6.i((loo)new ald(a6, (Map)j, b));
            o = nws;
        }
        return o;
    }
    
    public final w4e q(final int n) {
        final uts i0 = this.I0;
        final w4e w4e = null;
        if (i0 == null) {
            return null;
        }
        Objects.requireNonNull(i0);
        w4e w4e2 = w4e;
        if (n >= 0) {
            w4e2 = w4e;
            if (n < i0.getCount()) {
                w4e2 = i0.J0.a.get(n);
            }
        }
        return w4e2;
    }
}
