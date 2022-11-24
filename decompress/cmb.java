import android.app.Notification;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmb
{
    public final int a;
    public final int b;
    public final Notification c;
    
    public cmb(final int a, final Notification c) {
        this.a = a;
        this.c = c;
        this.b = 0;
    }
    
    public cmb(final int a, final Notification c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && cmb.class == o.getClass()) {
            final cmb cmb = (cmb)o;
            return this.a == cmb.a && this.b == cmb.b && this.c.equals(cmb.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.a * 31 + this.b) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = j98.j("ForegroundInfo{", "mNotificationId=");
        j.append(this.a);
        j.append(", mForegroundServiceType=");
        j.append(this.b);
        j.append(", mNotification=");
        j.append(this.c);
        j.append('}');
        return j.toString();
    }
}
