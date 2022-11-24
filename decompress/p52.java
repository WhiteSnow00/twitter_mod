import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p52 implements abi
{
    public final q52 F0;
    public final de6 G0;
    
    public p52(final q52 f0, final kcm kcm) {
        e0e.f((Object)f0, "navigationDelegate");
        e0e.f((Object)kcm, "releaseCompletable");
        this.F0 = f0;
        final de6 g0 = new de6();
        kcm.i((sj)new o52(g0, 0));
        this.G0 = g0;
    }
    
    public final boolean N2(final zai zai, final Menu menu) {
        e0e.f((Object)zai, "navComponent");
        e0e.f((Object)menu, "menu");
        zai.z(2131689536, menu);
        zai.setTitle(this.F0.e);
        this.a(this.F0.d, menu);
        final q52 f0 = this.F0;
        this.G0.a(t5j.merge((fbj)f0.a, (fbj)f0.c).doOnNext((rk6)new z7w((Object)this, (Object)menu, (Object)zai, 1)).subscribe());
        return true;
    }
    
    public final void a(final r62$d r62$d, final Menu menu) {
        final boolean b = r62$d instanceof r62$d.g;
        boolean visible = true;
        final boolean visible2 = b && !e0e.a((Object)((r62$d.g)r62$d).b, (Object)"0");
        final boolean visible3 = r62$d instanceof r62$d.d;
        if (!b || !e0e.a((Object)((r62$d.g)r62$d).b, (Object)"0")) {
            visible = false;
        }
        menu.findItem(2131430021).setVisible(visible2);
        menu.findItem(2131430004).setVisible(visible3);
        menu.findItem(2131430005).setVisible(visible);
    }
    
    public final int d2(final zai zai) {
        e0e.f((Object)zai, "navComponent");
        return 2;
    }
}
