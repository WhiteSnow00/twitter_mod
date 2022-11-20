import com.twitter.ui.adapters.inject.ItemObjectGraph$b;
import com.twitter.business.moduleconfiguration.overview.di.ShopModulePreviewItemObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l1q extends xmd<joh.i>
{
    public final vbl f;
    
    public l1q(final ShopModulePreviewItemObjectGraph.a a, final vbl f) {
        czd.f((Object)f, "profileModuleRepository");
        super((Class)joh.i.class, (ItemObjectGraph$b)a, (qsb)new wmd(2131625674, false));
        this.f = f;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final joh.i i = (joh.i)o;
        czd.f((Object)v7x, "viewHolder");
        czd.f((Object)i, "item");
        super.k(v7x, (Object)i, xbm);
        this.f.a(i.a);
    }
}
