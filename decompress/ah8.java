import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ah8 extends ContentObserver
{
    public final p7j a;
    
    public ah8(final Handler handler, final p7j a) {
        this.a = a;
        super(handler);
    }
    
    public final void onChange(final boolean b) {
        if (!((u6j$a)this.a).isDisposed()) {
            ((u6j$a)this.a).onNext((Object)kni.a);
        }
    }
}
