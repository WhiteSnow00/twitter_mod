import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ron extends ste implements qsb<Long, fzv>
{
    public final qon D0;
    public final String E0;
    public final String F0;
    
    public ron(final qon d0, final String e0, final String f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Long n = (Long)o;
        final qon d0 = this.D0;
        final float a = gu8.a(d0.a);
        final StringBuilder sb = new StringBuilder();
        sb.append("Battery Level: ");
        sb.append(a);
        qon.a(d0, sb.toString());
        final qon d2 = this.D0;
        final ActivityManager activityManager = (ActivityManager)d2.a.getSystemService("activity");
        long totalMem;
        if (activityManager != null) {
            final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
            activityManager.getMemoryInfo(activityManager$MemoryInfo);
            totalMem = activityManager$MemoryInfo.totalMem;
        }
        else {
            totalMem = -1L;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Ram Memory Level: ");
        sb2.append(totalMem);
        qon.a(d2, sb2.toString());
        this.D0.c.uploadBroadcasterLogs(this.E0, this.F0);
        return fzv.a;
    }
}
