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
public class zpb extends ypb
{
    public static boolean s(final xyt xyt) {
        return !ypb.h((List)xyt.G0) || !ypb.h((List)xyt.I0) || !ypb.h((List)xyt.J0);
    }
    
    public final void a(final Object o, final View view) {
        ((xyt)o).d(view);
    }
    
    public final void b(final Object o, final ArrayList<View> list) {
        final xyt xyt = (xyt)o;
        if (xyt == null) {
            return;
        }
        final boolean b = xyt instanceof tzt;
        final int n = 0;
        int i = 0;
        if (b) {
            for (tzt tzt = (tzt)xyt; i < tzt.g1.size(); ++i) {
                this.b(tzt.T(i), list);
            }
        }
        else if (!s(xyt) && ypb.h((List)xyt.H0)) {
            for (int size = list.size(), j = n; j < size; ++j) {
                xyt.d((View)list.get(j));
            }
        }
    }
    
    public final void c(final ViewGroup viewGroup, final Object o) {
        szt.a(viewGroup, (xyt)o);
    }
    
    public final boolean e(final Object o) {
        return o instanceof xyt;
    }
    
    public final Object f(final Object o) {
        xyt n;
        if (o != null) {
            n = ((xyt)o).n();
        }
        else {
            n = null;
        }
        return n;
    }
    
    public final Object i(final Object o, Object o2, final Object o3) {
        Object o4 = o;
        final xyt xyt = (xyt)o2;
        final xyt xyt2 = (xyt)o3;
        if (o4 != null && xyt != null) {
            final tzt tzt = new tzt();
            tzt.S((xyt)o4);
            tzt.S(xyt);
            tzt.W(1);
            o4 = tzt;
        }
        else if (o4 == null) {
            if (xyt != null) {
                o4 = xyt;
            }
            else {
                o4 = null;
            }
        }
        if (xyt2 != null) {
            o2 = new tzt();
            if (o4 != null) {
                ((tzt)o2).S((xyt)o4);
            }
            ((tzt)o2).S(xyt2);
            return o2;
        }
        return o4;
    }
    
    public final Object j(final Object o, final Object o2) {
        final tzt tzt = new tzt();
        if (o != null) {
            tzt.S((xyt)o);
        }
        tzt.S((xyt)o2);
        return tzt;
    }
    
    public final void k(final Object o, final View view, final ArrayList<View> list) {
        ((xyt)o).a((xyt.e)new xyt.e() {
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
            public final void d(final xyt xyt) {
                xyt.F((xyt.e)this);
                view.setVisibility(8);
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((View)list.get(i)).setVisibility(0);
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
        //     1: checkcast       Lxyt;
        //     4: new             Laqb;
        //     7: dup            
        //     8: aload_0        
        //     9: aload_2        
        //    10: aload_3        
        //    11: aload           4
        //    13: aload           5
        //    15: invokespecial   aqb.<init>:(Lzpb;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
        //    18: invokevirtual   xyt.a:(Lxyt$e;)Lxyt;
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
        ((xyt)o).K((xyt.d)new xyt.d() {
            @Override
            public final Rect a() {
                final Rect a = rect;
                if (a != null && !a.isEmpty()) {
                    return rect;
                }
                return null;
            }
        });
    }
    
    public final void n(final Object o, final View view) {
        if (view != null) {
            final xyt xyt = (xyt)o;
            final Rect rect = new Rect();
            this.g(view, rect);
            xyt.K((xyt.d)new xyt.d() {
                @Override
                public final Rect a() {
                    return rect;
                }
            });
        }
    }
    
    public final void p(final Object o, final View view, final ArrayList<View> list) {
        final tzt tzt = (tzt)o;
        final ArrayList<View> h0 = ((xyt)tzt).H0;
        h0.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            ypb.d((List)h0, (View)list.get(i));
        }
        h0.add(view);
        list.add(view);
        this.b(tzt, list);
    }
    
    public final void q(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final tzt tzt = (tzt)o;
        if (tzt != null) {
            ((xyt)tzt).H0.clear();
            ((xyt)tzt).H0.addAll(list2);
            this.t(tzt, list, list2);
        }
    }
    
    public final Object r(final Object o) {
        if (o == null) {
            return null;
        }
        final tzt tzt = new tzt();
        tzt.S((xyt)o);
        return tzt;
    }
    
    public final void t(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final xyt xyt = (xyt)o;
        final boolean b = xyt instanceof tzt;
        int i = 0;
        int j = 0;
        if (b) {
            for (tzt tzt = (tzt)xyt; j < tzt.g1.size(); ++j) {
                this.t(tzt.T(j), list, list2);
            }
        }
        else if (!s(xyt)) {
            final ArrayList<View> h0 = xyt.H0;
            if (h0.size() == list.size() && h0.containsAll(list)) {
                int size;
                if (list2 == null) {
                    size = 0;
                }
                else {
                    size = list2.size();
                }
                while (i < size) {
                    xyt.d((View)list2.get(i));
                    ++i;
                }
                int size2 = list.size();
                while (--size2 >= 0) {
                    xyt.G((View)list.get(size2));
                }
            }
        }
    }
}
