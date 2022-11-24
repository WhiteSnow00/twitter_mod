import android.content.IntentFilter;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ll2<T> extends qj6<T>
{
    public final ll2$a f;
    
    public ll2(final Context context, final ycs ycs) {
        super(context, ycs);
        this.f = new BroadcastReceiver(this) {
            public final ll2<T> a;
            
            public final void onReceive(final Context context, final Intent intent) {
                e0e.f((Object)context, "context");
                e0e.f((Object)intent, "intent");
                this.a.g(intent);
            }
        };
    }
    
    public final void d() {
        final jag e = jag.e();
        final String a = ml2.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(": registering receiver");
        e.a(a, sb.toString());
        super.b.registerReceiver((BroadcastReceiver)this.f, this.f());
    }
    
    public final void e() {
        final jag e = jag.e();
        final String a = ml2.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(": unregistering receiver");
        e.a(a, sb.toString());
        super.b.unregisterReceiver((BroadcastReceiver)this.f);
    }
    
    public abstract IntentFilter f();
    
    public abstract void g(final Intent p0);
}
