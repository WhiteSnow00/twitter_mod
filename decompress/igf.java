import com.twitter.ui.adapters.inject.ItemObjectGraph$b;
import com.twitter.business.moduleconfiguration.overview.di.LinkModulePreviewItemObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igf extends xmd<joh.f>
{
    public final vbl f;
    
    public igf(final LinkModulePreviewItemObjectGraph.a a, final vbl f) {
        czd.f((Object)f, "profileModuleRepository");
        super((Class)joh.f.class, (ItemObjectGraph$b)a, (qsb)new wmd(2131624719, false));
        this.f = f;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final joh.f f = (joh.f)o;
        czd.f((Object)v7x, "viewHolder");
        czd.f((Object)f, "item");
        super.k(v7x, (Object)f, xbm);
        this.f.a(f.a);
    }
}
