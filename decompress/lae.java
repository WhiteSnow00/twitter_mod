import android.os.BaseBundle;
import java.util.Set;
import java.util.Iterator;
import android.util.Base64;
import android.os.PersistableBundle;
import android.app.job.JobInfo$Builder;
import android.app.job.JobInfo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lae implements htx
{
    public final Context a;
    public final gea b;
    public final dxo c;
    
    public lae(final Context a, final gea b, final dxo c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final z1u z1u, final int n) {
        this.b(z1u, n, false);
    }
    
    public final void b(final z1u z1u, final int n, final boolean b) {
        final ComponentName componentName = new ComponentName(this.a, (Class)JobInfoSchedulerService.class);
        final JobScheduler jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
        final Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(z1u.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(d0l.a(z1u.d())).array());
        if (z1u.c() != null) {
            adler32.update(z1u.c());
        }
        final int n2 = (int)adler32.getValue();
        Label_0210: {
            if (!b) {
                while (true) {
                    for (final JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                        final int int1 = ((BaseBundle)jobInfo.getExtras()).getInt("attemptNumber");
                        if (jobInfo.getId() == n2) {
                            if (int1 < n) {
                                break;
                            }
                            final boolean b2 = true;
                            if (b2) {
                                uag.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", (Object)z1u);
                                return;
                            }
                            break Label_0210;
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
        }
        final long q2 = this.b.q2(z1u);
        final dxo c = this.c;
        final JobInfo$Builder jobInfo$Builder = new JobInfo$Builder(n2, componentName);
        final zzk d = z1u.d();
        jobInfo$Builder.setMinimumLatency(c.b(d, q2, n));
        final Set c2 = c.c().get(d).c();
        if (c2.contains(dxo$b.F0)) {
            jobInfo$Builder.setRequiredNetworkType(2);
        }
        else {
            jobInfo$Builder.setRequiredNetworkType(1);
        }
        if (c2.contains(dxo$b.H0)) {
            jobInfo$Builder.setRequiresCharging(true);
        }
        if (c2.contains(dxo$b.G0)) {
            jobInfo$Builder.setRequiresDeviceIdle(true);
        }
        final PersistableBundle extras = new PersistableBundle();
        ((BaseBundle)extras).putInt("attemptNumber", n);
        ((BaseBundle)extras).putString("backendName", z1u.b());
        ((BaseBundle)extras).putInt("priority", d0l.a(z1u.d()));
        if (z1u.c() != null) {
            ((BaseBundle)extras).putString("extras", Base64.encodeToString(z1u.c(), 0));
        }
        jobInfo$Builder.setExtras(extras);
        uag.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { z1u, n2, this.c.b(z1u.d(), q2, n), q2, n });
        jobScheduler.schedule(jobInfo$Builder.build());
    }
}
