import com.twitter.ui.adapters.inject.ItemObjectGraph$b;
import com.twitter.business.moduleconfiguration.overview.di.AboutModulePreviewItemObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z7 extends xmd<joh.a>
{
    public final vbl f;
    
    public z7(final AboutModulePreviewItemObjectGraph.a a, final vbl f) {
        czd.f((Object)f, "profileModuleRepository");
        super((Class)joh.a.class, (ItemObjectGraph$b)a, (qsb)new wmd(2131623965, false));
        this.f = f;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final joh.a a = (joh.a)o;
        czd.f((Object)v7x, "viewHolder");
        czd.f((Object)a, "item");
        super.k(v7x, (Object)a, xbm);
        this.f.a(a.a);
    }
}
