import android.os.IBinder;
import java.util.Objects;
import android.content.ComponentName;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mb7
{
    public final Intent a;
    public final Bundle b;
    
    public mb7(final Intent a, final Bundle b) {
        this.a = a;
        this.b = b;
    }
    
    public static final class a
    {
        public final Intent a;
        public ArrayList<Bundle> b;
        public Bundle c;
        public boolean d;
        
        public a(final wb7 wb7) {
            final Intent a = new Intent("android.intent.action.VIEW");
            this.a = a;
            final IBinder binder = null;
            this.b = null;
            this.c = null;
            this.d = true;
            if (wb7 != null) {
                a.setPackage(((ComponentName)wb7.d).getPackageName());
            }
            final Bundle bundle = new Bundle();
            Object o;
            if (wb7 == null) {
                o = binder;
            }
            else {
                o = wb7.c;
                Objects.requireNonNull(o);
            }
            ht2.b(bundle, "android.support.customtabs.extra.SESSION", (IBinder)o);
            a.putExtras(bundle);
        }
    }
}
