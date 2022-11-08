import com.twitter.util.user.UserIdentifier;
import android.app.usage.UsageStatsManager;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ko0
{
    public final Context a;
    public final xca<okm> b;
    
    public ko0(final Context a, final xca<okm> b) {
        zzd.f((Object)a, "context");
        zzd.f((Object)b, "eventReporter");
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        if (Build$VERSION.SDK_INT >= 28) {
            final Object systemService = this.a.getSystemService("usagestats");
            zzd.d(systemService, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
            final int appStandbyBucket = ((UsageStatsManager)systemService).getAppStandbyBucket();
            String s;
            if (appStandbyBucket != 10) {
                if (appStandbyBucket != 20) {
                    if (appStandbyBucket != 30) {
                        if (appStandbyBucket != 40) {
                            if (appStandbyBucket != 45) {
                                s = "unknown";
                            }
                            else {
                                s = "restricted";
                            }
                        }
                        else {
                            s = "rare";
                        }
                    }
                    else {
                        s = "frequent";
                    }
                }
                else {
                    s = "working_set";
                }
            }
            else {
                s = "active";
            }
            this.b.b(UserIdentifier.Companion.c(), (okm)new zf4(nca.Companion.e("app", "", "", "standby", s)));
        }
    }
}
