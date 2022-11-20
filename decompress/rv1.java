import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rv1 implements wc4, vu1, wca<f7x, y00>, au1
{
    public final au1 a;
    public final wc4 b;
    public final vu1 c;
    public final wca<f7x, y00> d;
    public final oca<View, f7x> e;
    
    public rv1(final au1 a, final wc4 b, final vu1 c, final wca<f7x, y00> d, final oca<View, f7x> e) {
        czd.f((Object)a, "bceHierarchyContextHelper");
        czd.f((Object)b, "clickExtensions");
        czd.f((Object)c, "bceMetadataRegistry");
        czd.f((Object)d, "eventSourceRegistrar");
        czd.f((Object)e, "eventSourceFactory");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final <V extends View> h5j<View> C(final V v) {
        czd.f((Object)v, "view");
        return (h5j<View>)this.b.C((View)v);
    }
    
    public final <V extends View> h5j<View> D(final V v) {
        czd.f((Object)v, "view");
        return (h5j<View>)this.b.D((View)v);
    }
    
    public final void a(final View view, final String s) {
        czd.f((Object)view, "view");
        this.c.a(view, s);
    }
    
    public final void b(final View view) {
        czd.f((Object)view, "view");
        this.d.b(view);
    }
    
    public final void c(final View view, final zt1 zt1) {
        this.a.c(view, zt1);
    }
    
    public final void d(final View view, final View view2) {
        czd.f((Object)view, "view");
        czd.f((Object)view2, "parentView");
        this.d.d(view, view2);
    }
    
    public final zt1 e(final View view) {
        czd.f((Object)view, "view");
        return this.a.e(view);
    }
    
    public final void f(final View view, final lca<f7x> lca) {
        czd.f((Object)view, "view");
        this.d.f(view, (lca)lca);
    }
    
    public final /* bridge */ void g(final lca lca, final qca qca) {
        this.l((lca<f7x>)lca, (y00)qca);
    }
    
    public final void h(final View view, final qca qca) {
        this.d.h(view, (qca)qca);
    }
    
    public final void i(final lca<f7x> lca, final pca pca) {
        czd.f((Object)lca, "eventSource");
        this.d.i((lca)lca, pca);
    }
    
    public final void j(final View view, final ou1 ou1) {
        czd.f((Object)view, "view");
        this.c.j(view, ou1);
    }
    
    public final lca<f7x> k(final View view) {
        czd.f((Object)view, "view");
        return (lca<f7x>)this.e.b((Object)view);
    }
    
    public final void l(final lca<f7x> lca, final y00 y00) {
        czd.f((Object)lca, "eventSource");
        czd.f((Object)y00, "metadata");
        this.d.g((lca)lca, (qca)y00);
    }
}
