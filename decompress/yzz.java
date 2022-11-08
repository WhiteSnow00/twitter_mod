import android.app.Dialog;
import com.google.android.material.bottomsheet.a;
import java.util.Arrays;
import android.content.DialogInterface$OnDismissListener;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yzz implements wqy
{
    public final /* synthetic */ int C0;
    public final Object D0;
    public final Object E0;
    public Object F0;
    
    public yzz() {
        this.C0 = 3;
        final boolean b = dta.b().b("android_reduced_display_session_histogram_enabled", false);
        final jth jth = new jth();
        this.D0 = new dcx(jth, b);
        this.E0 = new dcx(jth, b);
        this.F0 = new fcx(jth, b);
    }
    
    public yzz(final Context d0, final qw8 e0, final x1g f0) {
        this.C0 = 2;
        zzd.f((Object)d0, "context");
        zzd.f((Object)e0, "dialogOpener");
        zzd.f((Object)f0, "liveSyncPermissions");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public yzz(final View view, final otb e0) {
        this.C0 = 4;
        zzd.f((Object)view, "rootView");
        this.D0 = view;
        this.E0 = e0;
        final Context context = view.getContext();
        zzd.e((Object)context, "rootView.context");
        final k92 f0 = new k92(context);
        ((a)f0).setContentView(view);
        ((Dialog)f0).setOnDismissListener((DialogInterface$OnDismissListener)new od3((Object)this, 1));
        this.F0 = f0;
    }
    
    public yzz(final wqy d0, final wqy e0, final wqy f0) {
        this.C0 = 1;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final yzz b(final String c0) {
        final ezz ezz = new ezz(null);
        ((ezz)this.F0).E0 = ezz;
        this.F0 = ezz;
        ezz.D0 = null;
        ezz.C0 = c0;
        return this;
    }
    
    @Override
    public final String toString() {
        switch (this.C0) {
            default: {
                return super.toString();
            }
            case 0: {
                final StringBuilder sb = new StringBuilder(32);
                sb.append((String)this.D0);
                sb.append('{');
                ezz ezz = (ezz)((ezz)this.E0).E0;
                String s = "";
                while (ezz != null) {
                    final Object d0 = ezz.D0;
                    sb.append(s);
                    final String s2 = (String)ezz.C0;
                    if (s2 != null) {
                        sb.append(s2);
                        sb.append('=');
                    }
                    if (d0 != null && d0.getClass().isArray()) {
                        final String deepToString = Arrays.deepToString(new Object[] { d0 });
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    else {
                        sb.append(d0);
                    }
                    ezz = (ezz)ezz.E0;
                    s = ", ";
                }
                sb.append('}');
                return sb.toString();
            }
        }
    }
}
