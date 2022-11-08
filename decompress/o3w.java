import android.app.Activity;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o3w implements p0e<n3w>
{
    public final NavigationHandler a;
    public final Activity b;
    public final tiw c;
    
    public o3w(final NavigationHandler a, final Activity b, final tiw c) {
        zzd.f((Object)a, "navigationHandler");
        zzd.f((Object)b, "hostingActivity");
        zzd.f((Object)c, "userStore");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final asr asr) {
        final lsr b = ((asr)asr).b;
        zzd.e((Object)b, "subtask.properties");
        final p3w p3w = (p3w)b;
        xw0.c((rj)new xg((Object)this, (Object)p3w, 2));
        final NavigationHandler a = this.a;
        final xrv a2 = p3w.a;
        zzd.c((Object)a2);
        a.e(a2);
    }
    
    public static final class a extends p0e$a<n3w>
    {
        public a() {
            super((Class)n3w.class);
        }
    }
    
    public static final class b extends p0e$b<n3w>
    {
        public b(final a a, final fxe<o3w> fxe) {
            zzd.f((Object)a, "matcher");
            zzd.f((Object)fxe, "handler");
            super((p0e$a)a, (fxe)fxe);
        }
    }
}
