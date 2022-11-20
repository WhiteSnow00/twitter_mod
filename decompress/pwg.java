import java.util.HashMap;
import com.twitter.api.upload.request.progress.ProgressUpdatedEvent;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwg implements n93
{
    public final rwg a;
    public final long b;
    public final Set c;
    public final j9j d;
    public final lba e;
    public final String f;
    
    public pwg(final rwg a, final long b, final Set c, final j9j d, final lba e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final Object o) {
        final rwg a = this.a;
        final long b = this.b;
        final Set c = this.c;
        final j9j d = this.d;
        final lba e = this.e;
        final String f = this.f;
        ((HashMap<Long, xrc>)a.E0).put(Long.valueOf(b), (xrc)o);
        if (((HashMap<Object, V>)a.E0).keySet().containsAll(c)) {
            ((ril)d).set((Object)a.E0);
        }
        e.onEvent((Object)ProgressUpdatedEvent.b(f, 3));
    }
}
