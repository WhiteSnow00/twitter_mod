import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dig extends ContentObserver
{
    public final nsb<fzv> a;
    
    public dig(final nsb<fzv> a) {
        super(new Handler(Looper.getMainLooper()));
        this.a = a;
    }
    
    public final void onChange(final boolean b) {
        this.onChange(b, null);
    }
    
    public final void onChange(final boolean b, final Uri uri) {
        this.a.invoke();
    }
}
