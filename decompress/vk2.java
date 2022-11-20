import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vk2<T> extends ki6<T>
{
    public final vk2$a f;
    
    public vk2(final Context context, final gcs gcs) {
        super(context, gcs);
        this.f = new vk2$a(this);
    }
    
    @Override
    public final void d() {
        final o9g e = o9g.e();
        final String a = wk2.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(": registering receiver");
        e.a(a, sb.toString());
        super.b.registerReceiver((BroadcastReceiver)this.f, this.f());
    }
    
    @Override
    public final void e() {
        final o9g e = o9g.e();
        final String a = wk2.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(": unregistering receiver");
        e.a(a, sb.toString());
        super.b.unregisterReceiver((BroadcastReceiver)this.f);
    }
    
    public abstract IntentFilter f();
    
    public abstract void g(final Intent p0);
}
