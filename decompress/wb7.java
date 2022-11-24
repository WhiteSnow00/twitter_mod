import android.os.IBinder;
import java.util.Objects;
import android.content.ComponentName;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wb7
{
    public final Intent a;
    public final Bundle b;
    
    public wb7(final Intent a, final Bundle b) {
        this.a = a;
        this.b = b;
    }
    
    public static final class a
    {
        public final Intent a;
        public ArrayList<Bundle> b;
        public Bundle c;
        public boolean d;
        
        public a(final gc7 gc7) {
            final Intent a = new Intent("android.intent.action.VIEW");
            this.a = a;
            final IBinder binder = null;
            this.b = null;
            this.c = null;
            this.d = true;
            if (gc7 != null) {
                a.setPackage(((ComponentName)gc7.d).getPackageName());
            }
            final Bundle bundle = new Bundle();
            Object o;
            if (gc7 == null) {
                o = binder;
            }
            else {
                o = gc7.c;
                Objects.requireNonNull(o);
            }
            rt2.b(bundle, "android.support.customtabs.extra.SESSION", (IBinder)o);
            a.putExtras(bundle);
        }
    }
}
