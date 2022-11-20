import android.os.Bundle;
import android.app.PendingIntent;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.content.Context;
import java.util.ArrayList;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rcs implements Iterable<Intent>
{
    public final ArrayList<Intent> D0;
    public final Context E0;
    
    public rcs(final Context e0) {
        this.D0 = new ArrayList<Intent>();
        this.E0 = e0;
    }
    
    public final rcs e(final Intent intent) {
        this.D0.add(intent);
        return this;
    }
    
    public final rcs g(final Intent intent) {
        ComponentName componentName;
        if ((componentName = intent.getComponent()) == null) {
            componentName = intent.resolveActivity(this.E0.getPackageManager());
        }
        if (componentName != null) {
            this.i(componentName);
        }
        this.e(intent);
        return this;
    }
    
    public final rcs i(final ComponentName componentName) {
        final int size = this.D0.size();
        try {
            for (Intent intent = dai.b(this.E0, componentName); intent != null; intent = dai.b(this.E0, intent.getComponent())) {
                this.D0.add(size, intent);
            }
            return this;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    @Deprecated
    @Override
    public final Iterator<Intent> iterator() {
        return this.D0.iterator();
    }
    
    public final Intent j(final int n) {
        return this.D0.get(n);
    }
    
    public final int l() {
        return this.D0.size();
    }
    
    public final PendingIntent m(final int n, final int n2) {
        if (!this.D0.isEmpty()) {
            final Intent[] array = this.D0.toArray(new Intent[0]);
            array[0] = new Intent(array[0]).addFlags(268484608);
            return a.a(this.E0, n, array, n2, null);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }
    
    public final void n() {
        if (!this.D0.isEmpty()) {
            final Intent[] array = this.D0.toArray(new Intent[0]);
            array[0] = new Intent(array[0]).addFlags(268484608);
            final Context e0 = this.E0;
            final Object a = kn6.a;
            kn6.a.a(e0, array, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
    
    public static final class a
    {
        public static PendingIntent a(final Context context, final int n, final Intent[] array, final int n2, final Bundle bundle) {
            return PendingIntent.getActivities(context, n, array, n2, bundle);
        }
    }
}
