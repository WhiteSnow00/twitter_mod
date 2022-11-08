import com.twitter.ui.adapters.inject.ItemObjectGraph$b;
import com.twitter.business.moduleconfiguration.overview.di.AboutModulePreviewItemObjectGraph$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8 extends und<eoh$a>
{
    public final ibl f;
    
    public a8(final AboutModulePreviewItemObjectGraph$a aboutModulePreviewItemObjectGraph$a, final ibl f) {
        zzd.f((Object)f, "profileModuleRepository");
        super((Class)eoh$a.class, (ItemObjectGraph$b)aboutModulePreviewItemObjectGraph$a, (rtb)new tnd(2131623965, false));
        this.f = f;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final eoh$a eoh$a = (eoh$a)o;
        zzd.f((Object)c7x, "viewHolder");
        zzd.f((Object)eoh$a, "item");
        super.k(c7x, (Object)eoh$a, ibm);
        this.f.a(eoh$a.a);
    }
}
