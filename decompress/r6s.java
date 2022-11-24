import android.os.BaseBundle;
import java.util.Iterator;
import android.app.job.JobInfo$TriggerContentUri;
import android.net.NetworkRequest$Builder;
import android.os.Build$VERSION;
import android.app.job.JobInfo$Builder;
import android.os.PersistableBundle;
import android.app.job.JobInfo;
import androidx.work.impl.background.systemjob.SystemJobService;
import android.content.Context;
import android.content.ComponentName;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "ClassVerificationFailure" })
public final class r6s
{
    public static final String b;
    public final ComponentName a;
    
    static {
        b = jag.g("SystemJobInfoConverter");
    }
    
    public r6s(final Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class)SystemJobService.class);
    }
    
    public final JobInfo a(final ktx ktx, int b) {
        final wj6 j = ktx.j;
        final PersistableBundle extras = new PersistableBundle();
        ((BaseBundle)extras).putString("EXTRA_WORK_SPEC_ID", ktx.a);
        ((BaseBundle)extras).putInt("EXTRA_WORK_SPEC_GENERATION", ktx.t);
        extras.putBoolean("EXTRA_IS_PERIODIC", ktx.d());
        final JobInfo$Builder setExtras = new JobInfo$Builder(b, this.a).setRequiresCharging(j.b).setRequiresDeviceIdle(j.c).setExtras(extras);
        final int a = j.a;
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b2 = false;
        if (sdk_INT >= 30 && a == 6) {
            setExtras.setRequiredNetwork(new NetworkRequest$Builder().addCapability(25).build());
        }
        else {
            final int g = lb0.G(a);
            b = 4;
            Label_0253: {
                if (g != 0) {
                    if (g != 1) {
                        if (g == 2) {
                            b = 2;
                            break Label_0253;
                        }
                        if (g != 3) {
                            if (g == 4) {
                                if (sdk_INT >= 26) {
                                    break Label_0253;
                                }
                            }
                        }
                        else if (sdk_INT >= 24) {
                            b = 3;
                            break Label_0253;
                        }
                        final jag e = jag.e();
                        final String b3 = r6s.b;
                        final StringBuilder f = ehk.f("API version too low. Cannot convert network type value ");
                        f.append(o6f.m(a));
                        e.a(b3, f.toString());
                    }
                    b = 1;
                }
                else {
                    b = 0;
                }
            }
            setExtras.setRequiredNetworkType(b);
        }
        if (!j.c) {
            if (ktx.l == 2) {
                b = 0;
            }
            else {
                b = 1;
            }
            setExtras.setBackoffCriteria(ktx.m, b);
        }
        final long max = Math.max(ktx.a() - System.currentTimeMillis(), 0L);
        if (sdk_INT <= 28) {
            setExtras.setMinimumLatency(max);
        }
        else if (max > 0L) {
            setExtras.setMinimumLatency(max);
        }
        else if (!ktx.q) {
            setExtras.setImportantWhileForeground(true);
        }
        if (sdk_INT >= 24 && j.a()) {
            for (final wj6.b b4 : j.h) {
                b = (b4.b ? 1 : 0);
                setExtras.addTriggerContentUri(new JobInfo$TriggerContentUri(b4.a, b));
            }
            setExtras.setTriggerContentUpdateDelay(j.f);
            setExtras.setTriggerContentMaxDelay(j.g);
        }
        setExtras.setPersisted(false);
        final int sdk_INT2 = Build$VERSION.SDK_INT;
        if (sdk_INT2 >= 26) {
            setExtras.setRequiresBatteryNotLow(j.d);
            setExtras.setRequiresStorageNotLow(j.e);
        }
        if (ktx.k > 0) {
            b = 1;
        }
        else {
            b = 0;
        }
        if (max > 0L) {
            b2 = true;
        }
        if (sdk_INT2 >= 31 && ktx.q && b == 0 && !b2) {
            setExtras.setExpedited(true);
        }
        return setExtras.build();
    }
}
