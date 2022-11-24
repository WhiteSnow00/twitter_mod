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
public class wpb extends vpb
{
    public static boolean s(final g0u g0u) {
        return !vpb.h((List)g0u.J0) || !vpb.h((List)g0u.L0) || !vpb.h((List)g0u.M0);
    }
    
    public final void a(final Object o, final View view) {
        ((g0u)o).d(view);
    }
    
    public final void b(final Object o, final ArrayList<View> list) {
        final g0u g0u = (g0u)o;
        if (g0u == null) {
            return;
        }
        final boolean b = g0u instanceof c1u;
        final int n = 0;
        int i = 0;
        if (b) {
            for (c1u c1u = (c1u)g0u; i < c1u.j1.size(); ++i) {
                this.b(c1u.T(i), list);
            }
        }
        else if (!s(g0u) && vpb.h((List)g0u.K0)) {
            for (int size = list.size(), j = n; j < size; ++j) {
                g0u.d((View)list.get(j));
            }
        }
    }
    
    public final void c(final ViewGroup viewGroup, final Object o) {
        b1u.a(viewGroup, (g0u)o);
    }
    
    public final boolean e(final Object o) {
        return o instanceof g0u;
    }
    
    public final Object f(final Object o) {
        g0u n;
        if (o != null) {
            n = ((g0u)o).n();
        }
        else {
            n = null;
        }
        return n;
    }
    
    public final Object i(final Object o, Object o2, final Object o3) {
        g0u g0u = (g0u)o;
        final g0u g0u2 = (g0u)o2;
        final g0u g0u3 = (g0u)o3;
        if (g0u != null && g0u2 != null) {
            final c1u c1u = new c1u();
            c1u.S(g0u);
            c1u.S(g0u2);
            c1u.W(1);
            g0u = c1u;
        }
        else if (g0u == null) {
            if (g0u2 != null) {
                g0u = g0u2;
            }
            else {
                g0u = null;
            }
        }
        if (g0u3 != null) {
            o2 = new c1u();
            if (g0u != null) {
                ((c1u)o2).S(g0u);
            }
            ((c1u)o2).S(g0u3);
            return o2;
        }
        return g0u;
    }
    
    public final Object j(final Object o, final Object o2) {
        final c1u c1u = new c1u();
        if (o != null) {
            c1u.S((g0u)o);
        }
        c1u.S((g0u)o2);
        return c1u;
    }
    
    public final void k(final Object o, final View view, final ArrayList<View> list) {
        ((g0u)o).a((g0u$e)new g0u$e(view, list) {
            public final View F0;
            public final ArrayList G0;
            
            public final void a() {
            }
            
            public final void b() {
            }
            
            public final void c() {
            }
            
            public final void d(final g0u g0u) {
                g0u.F((g0u$e)this);
                this.F0.setVisibility(8);
                for (int size = this.G0.size(), i = 0; i < size; ++i) {
                    ((View)this.G0.get(i)).setVisibility(0);
                }
            }
            
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
        //     1: checkcast       Lg0u;
        //     4: new             Lxpb;
        //     7: dup            
        //     8: aload_0        
        //     9: aload_2        
        //    10: aload_3        
        //    11: aload           4
        //    13: aload           5
        //    15: invokespecial   xpb.<init>:(Lwpb;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
        //    18: invokevirtual   g0u.a:(Lg0u$e;)Lg0u;
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
        ((g0u)o).K((g0u$d)new g0u$d(rect) {
            public final Rect a;
            
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
            final g0u g0u = (g0u)o;
            final Rect rect = new Rect();
            this.g(view, rect);
            g0u.K((g0u$d)new g0u$d(rect) {
                public final Rect a;
                
                public final Rect a() {
                    return this.a;
                }
            });
        }
    }
    
    public final void p(final Object o, final View view, final ArrayList<View> list) {
        final c1u c1u = (c1u)o;
        final ArrayList k0 = c1u.K0;
        k0.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            vpb.d((List)k0, (View)list.get(i));
        }
        k0.add(view);
        list.add(view);
        this.b(c1u, list);
    }
    
    public final void q(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final c1u c1u = (c1u)o;
        if (c1u != null) {
            c1u.K0.clear();
            c1u.K0.addAll(list2);
            this.t(c1u, list, list2);
        }
    }
    
    public final Object r(final Object o) {
        if (o == null) {
            return null;
        }
        final c1u c1u = new c1u();
        c1u.S((g0u)o);
        return c1u;
    }
    
    public final void t(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final g0u g0u = (g0u)o;
        final boolean b = g0u instanceof c1u;
        int i = 0;
        int j = 0;
        if (b) {
            for (c1u c1u = (c1u)g0u; j < c1u.j1.size(); ++j) {
                this.t(c1u.T(j), list, list2);
            }
        }
        else if (!s(g0u)) {
            final ArrayList k0 = g0u.K0;
            if (k0.size() == list.size() && k0.containsAll(list)) {
                int size;
                if (list2 == null) {
                    size = 0;
                }
                else {
                    size = list2.size();
                }
                while (i < size) {
                    g0u.d((View)list2.get(i));
                    ++i;
                }
                int size2 = list.size();
                while (--size2 >= 0) {
                    g0u.G((View)list.get(size2));
                }
            }
        }
    }
}
