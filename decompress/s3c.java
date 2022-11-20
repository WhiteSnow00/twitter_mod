import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.fragment.app.p$k;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s3c extends p$k
{
    public final r3c a;
    
    public s3c(final r3c a) {
        this.a = a;
    }
    
    public final void a(final p p3, final Fragment fragment, final Bundle bundle) {
        czd.f((Object)p3, "fm");
        czd.f((Object)fragment, "f");
        this.a.D0.D((nnb)new lij(fragment, bundle));
    }
    
    public final void b(final p p2, final Fragment fragment) {
        czd.f((Object)p2, "fm");
        czd.f((Object)fragment, "f");
        this.a.D0.D((nnb)new mij(fragment, fragment.L0() == null || !((Activity)fragment.H1()).isChangingConfigurations()));
    }
    
    public final void c(final p p2, final Fragment fragment) {
        czd.f((Object)p2, "fm");
        czd.f((Object)fragment, "f");
        this.a.D0.D((nnb)new pij(fragment));
    }
    
    public final void e(final p p2, final Fragment fragment) {
        czd.f((Object)p2, "fm");
        czd.f((Object)fragment, "f");
        this.a.D0.D((nnb)new qij(fragment));
    }
    
    public final void f(final p p3, final Fragment fragment, final Bundle bundle) {
        czd.f((Object)p3, "fm");
        czd.f((Object)fragment, "f");
        this.a.D0.D((nnb)new rij(fragment, bundle));
    }
    
    public final void g(final p p2, final Fragment fragment) {
        czd.f((Object)p2, "fm");
        czd.f((Object)fragment, "f");
        this.a.D0.D((nnb)new sij(fragment));
    }
    
    public final void h(final p p2, final Fragment fragment) {
        czd.f((Object)p2, "fm");
        czd.f((Object)fragment, "f");
        this.a.D0.D((nnb)new tij(fragment));
    }
    
    public final void i(final p p4, final Fragment fragment, final View view, final Bundle bundle) {
        czd.f((Object)p4, "fm");
        czd.f((Object)fragment, "f");
        czd.f((Object)view, "v");
        this.a.D0.D((nnb)new vij(fragment, bundle));
    }
    
    public final void j(final p p2, final Fragment fragment) {
        czd.f((Object)p2, "fm");
        czd.f((Object)fragment, "f");
        this.a.D0.D((nnb)new wij(fragment));
    }
}
