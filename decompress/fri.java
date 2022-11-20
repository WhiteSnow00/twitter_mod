import android.widget.RemoteViews;
import android.app.PendingIntent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fri
{
    public final int a;
    public final PendingIntent b;
    public final RemoteViews c;
    public final RemoteViews d;
    
    public fri(final int a, final PendingIntent b, final RemoteViews c, final RemoteViews d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fri)) {
            return false;
        }
        final fri fri = (fri)o;
        return this.a == fri.a && czd.a((Object)this.b, (Object)fri.b) && czd.a((Object)this.c, (Object)fri.c) && czd.a((Object)this.d, (Object)fri.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final PendingIntent b = this.b;
        final RemoteViews c = this.c;
        final RemoteViews d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationData(flags=");
        sb.append(a);
        sb.append(", pendingIntent=");
        sb.append(b);
        sb.append(", notificationLayout=");
        sb.append(c);
        sb.append(", notificationCompactLayout=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
