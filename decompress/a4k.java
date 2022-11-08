import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.appcompat.app.e$a;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a4k implements myd<Object>
{
    public final Activity C0;
    public final mbi<?> D0;
    public final kn E0;
    public final y3k F0;
    
    public a4k(final Activity c0, final mbi<?> d0, final kn e0, final y3k f0) {
        zzd.f((Object)c0, "activity");
        zzd.f((Object)d0, "navigator");
        zzd.f((Object)e0, "activityFinisher");
        zzd.f((Object)f0, "banningHandler");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final boolean j() {
        final e$a e$a = new e$a((Context)this.C0);
        e$a.a.g = ((Context)this.C0).getString(2131956309);
        e$a.i((CharSequence)((Context)this.C0).getString(2131956307), (DialogInterface$OnClickListener)new gnb(this, 1));
        e$a.g((CharSequence)((Context)this.C0).getString(2131956306), (DialogInterface$OnClickListener)null);
        e$a.k();
        return true;
    }
}
