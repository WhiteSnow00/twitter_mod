import java.util.Collection;
import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.view.View;
import java.util.List;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "RestrictedApi" })
public class vob extends uob
{
    public static boolean s(final nzt nzt) {
        return !uob.h((List)nzt.H0) || !uob.h((List)nzt.J0) || !uob.h((List)nzt.K0);
    }
    
    public final void a(final Object o, final View view) {
        ((nzt)o).d(view);
    }
    
    public final void b(final Object o, final ArrayList<View> list) {
        final nzt nzt = (nzt)o;
        if (nzt == null) {
            return;
        }
        final boolean b = nzt instanceof j0u;
        int i = 0;
        final int n = 0;
        if (b) {
            final j0u j0u = (j0u)nzt;
            for (int size = j0u.h1.size(), j = n; j < size; ++j) {
                this.b(j0u.T(j), list);
            }
        }
        else if (!s(nzt) && uob.h((List)nzt.I0)) {
            while (i < list.size()) {
                nzt.d((View)list.get(i));
                ++i;
            }
        }
    }
    
    public final void c(final ViewGroup viewGroup, final Object o) {
        i0u.a(viewGroup, (nzt)o);
    }
    
    public final boolean e(final Object o) {
        return o instanceof nzt;
    }
    
    public final Object f(final Object o) {
        nzt n;
        if (o != null) {
            n = ((nzt)o).n();
        }
        else {
            n = null;
        }
        return n;
    }
    
    public final Object i(final Object o, Object o2, final Object o3) {
        Object o4 = o;
        final nzt nzt = (nzt)o2;
        final nzt nzt2 = (nzt)o3;
        if (o4 != null && nzt != null) {
            final j0u j0u = new j0u();
            j0u.S((nzt)o4);
            j0u.S(nzt);
            j0u.W(1);
            o4 = j0u;
        }
        else if (o4 == null) {
            if (nzt != null) {
                o4 = nzt;
            }
            else {
                o4 = null;
            }
        }
        if (nzt2 != null) {
            o2 = new j0u();
            if (o4 != null) {
                ((j0u)o2).S((nzt)o4);
            }
            ((j0u)o2).S(nzt2);
            return o2;
        }
        return o4;
    }
    
    public final Object j(final Object o, final Object o2) {
        final j0u j0u = new j0u();
        if (o != null) {
            j0u.S((nzt)o);
        }
        j0u.S((nzt)o2);
        return j0u;
    }
    
    public final void k(final Object o, final View view, final ArrayList<View> list) {
        ((nzt)o).a((nzt.e)new nzt.e(view, list) {
            public final View D0;
            public final ArrayList E0;
            
            @Override
            public final void a() {
            }
            
            @Override
            public final void b() {
            }
            
            @Override
            public final void c() {
            }
            
            @Override
            public final void d(final nzt nzt) {
                nzt.F((nzt.e)this);
                this.D0.setVisibility(8);
                for (int size = this.E0.size(), i = 0; i < size; ++i) {
                    ((View)this.E0.get(i)).setVisibility(0);
                }
            }
            
            @Override
            public final void e() {
            }
        });
    }
    
    public final void l(final Object p0, final Object p1, final ArrayList<View> p2, final Object p3, final ArrayList<View> p4, final Object p5, final ArrayList<View> p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Lnzt;
        //     4: new             Lwob;
        //     7: dup            
        //     8: aload_0        
        //     9: aload_2        
        //    10: aload_3        
        //    11: aload           4
        //    13: aload           5
        //    15: invokespecial   wob.<init>:(Lvob;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
        //    18: invokevirtual   nzt.a:(Lnzt$e;)Lnzt;
        //    21: pop            
        //    22: return         
        //    Signature:
        //  (Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList<Landroid/view/View;>;Ljava/lang/Object;Ljava/util/ArrayList<Landroid/view/View;>;Ljava/lang/Object;Ljava/util/ArrayList<Landroid/view/View;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 6
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    
    public final void m(final Object o, final Rect rect) {
        ((nzt)o).K((nzt.d)new nzt.d(rect) {
            public final Rect a;
            
            @Override
            public final Rect a() {
                final Rect a = this.a;
                if (a != null && !a.isEmpty()) {
                    return this.a;
                }
                return null;
            }
        });
    }
    
    public final void n(final Object o, final View view) {
        if (view != null) {
            final nzt nzt = (nzt)o;
            final Rect rect = new Rect();
            this.g(view, rect);
            nzt.K((nzt.d)new nzt.d(rect) {
                public final Rect a;
                
                @Override
                public final Rect a() {
                    return this.a;
                }
            });
        }
    }
    
    public final void p(final Object o, final View view, final ArrayList<View> list) {
        final j0u j0u = (j0u)o;
        final ArrayList<View> i0 = ((nzt)j0u).I0;
        i0.clear();
        for (int size = list.size(), j = 0; j < size; ++j) {
            uob.d((List)i0, (View)list.get(j));
        }
        i0.add(view);
        list.add(view);
        this.b(j0u, list);
    }
    
    public final void q(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final j0u j0u = (j0u)o;
        if (j0u != null) {
            ((nzt)j0u).I0.clear();
            ((nzt)j0u).I0.addAll(list2);
            this.t(j0u, list, list2);
        }
    }
    
    public final Object r(final Object o) {
        if (o == null) {
            return null;
        }
        final j0u j0u = new j0u();
        j0u.S((nzt)o);
        return j0u;
    }
    
    public final void t(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final nzt nzt = (nzt)o;
        final boolean b = nzt instanceof j0u;
        int i = 0;
        int j = 0;
        if (b) {
            for (j0u j0u = (j0u)nzt; j < j0u.h1.size(); ++j) {
                this.t(j0u.T(j), list, list2);
            }
        }
        else if (!s(nzt)) {
            final ArrayList<View> i2 = nzt.I0;
            if (i2.size() == list.size() && i2.containsAll(list)) {
                int size;
                if (list2 == null) {
                    size = 0;
                }
                else {
                    size = list2.size();
                }
                while (i < size) {
                    nzt.d((View)list2.get(i));
                    ++i;
                }
                int size2 = list.size();
                while (--size2 >= 0) {
                    nzt.G((View)list.get(size2));
                }
            }
        }
    }
}
