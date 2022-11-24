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

public final class jds implements Iterable<Intent>
{
    public final ArrayList<Intent> F0;
    public final Context G0;
    
    public jds(final Context g0) {
        this.F0 = new ArrayList<Intent>();
        this.G0 = g0;
    }
    
    public final jds e(final Intent intent) {
        this.F0.add(intent);
        return this;
    }
    
    public final jds g(final Intent intent) {
        ComponentName componentName;
        if ((componentName = intent.getComponent()) == null) {
            componentName = intent.resolveActivity(this.G0.getPackageManager());
        }
        if (componentName != null) {
            this.i(componentName);
        }
        this.e(intent);
        return this;
    }
    
    public final jds i(final ComponentName componentName) {
        final int size = this.F0.size();
        try {
            for (Intent intent = vai.b(this.G0, componentName); intent != null; intent = vai.b(this.G0, intent.getComponent())) {
                this.F0.add(size, intent);
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
        return this.F0.iterator();
    }
    
    public final Intent j(final int n) {
        return this.F0.get(n);
    }
    
    public final int k() {
        return this.F0.size();
    }
    
    public final PendingIntent m(final int n, final int n2) {
        if (!this.F0.isEmpty()) {
            final Intent[] array = this.F0.toArray(new Intent[0]);
            array[0] = new Intent(array[0]).addFlags(268484608);
            return a.a(this.G0, n, array, n2, null);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }
    
    public final void n() {
        if (!this.F0.isEmpty()) {
            final Intent[] array = this.F0.toArray(new Intent[0]);
            array[0] = new Intent(array[0]).addFlags(268484608);
            final Context g0 = this.G0;
            final Object a = qo6.a;
            qo6$a.a(g0, array, (Bundle)null);
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
