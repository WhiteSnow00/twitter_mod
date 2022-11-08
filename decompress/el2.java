import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class el2<T> extends ej6<T>
{
    public final el2$a f;
    
    public el2(final Context context, final lbs lbs) {
        super(context, lbs);
        this.f = new el2$a(this);
    }
    
    public final void d() {
        final y9g e = y9g.e();
        final String a = fl2.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(": registering receiver");
        e.a(a, sb.toString());
        super.b.registerReceiver((BroadcastReceiver)this.f, this.f());
    }
    
    public final void e() {
        final y9g e = y9g.e();
        final String a = fl2.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(": unregistering receiver");
        e.a(a, sb.toString());
        super.b.unregisterReceiver((BroadcastReceiver)this.f);
    }
    
    public abstract IntentFilter f();
    
    public abstract void g(final Intent p0);
}
