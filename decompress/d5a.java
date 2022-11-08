import android.view.View;
import java.util.Objects;
import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d5a implements sn6
{
    public final g5a C0;
    public final /* synthetic */ csr D0;
    
    public d5a(final msm msm, final uaf uaf, final g5a c0, final csr d0) {
        zzd.f((Object)msm, "retainedArgs");
        zzd.f((Object)c0, "viewHolder");
        zzd.f((Object)d0, "subtaskContentViewProvider");
        this.C0 = c0;
        this.D0 = d0;
        final Intent a = msm.a;
        zzd.e((Object)a, "retainedArgs.intent");
        this.a(a);
        uaf.L((gn)new gn() {
            public final /* synthetic */ d5a a;
            
            public final void a(final Activity activity, final Intent intent) {
                zzd.f((Object)activity, "activity");
                zzd.f((Object)intent, "newIntent");
                this.a.a(intent);
            }
        });
    }
    
    public final void a(final Intent intent) {
        zzd.f((Object)intent, "intent");
        final g5a c0 = this.C0;
        final fbs b = ibs.b(intent);
        pf8.r(b);
        final fsr f = b.f;
        Objects.requireNonNull(c0);
        Integer value;
        if (f != null) {
            value = f.a;
        }
        else {
            value = null;
        }
        if (value != null) {
            if (value == 4) {
                ((View)c0.F0.b).requestFocus();
                return;
            }
        }
        if (value != null) {
            if (value == 7) {
                c0.F0.b();
            }
        }
    }
    
    public final jn6 c() {
        return (jn6)this.D0.H0;
    }
}
