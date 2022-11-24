import java.util.List;
import android.view.inputmethod.BaseInputConnection;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djs implements wrd
{
    public final bjs a;
    
    public djs(final bjs a) {
        this.a = a;
    }
    
    public final void a(final j6m j6m) {
        e0e.f((Object)j6m, "ic");
        for (int size = this.a.h.size(), i = 0; i < size; ++i) {
            if (e0e.a(((WeakReference<Object>)this.a.h.get(i)).get(), (Object)j6m)) {
                this.a.h.remove(i);
                return;
            }
        }
    }
    
    public final void b(final KeyEvent keyEvent) {
        e0e.f((Object)keyEvent, "event");
        ((BaseInputConnection)this.a.i.getValue()).sendKeyEvent(keyEvent);
    }
    
    public final void c(final int n) {
        this.a.e.invoke((Object)new z9d(n));
    }
    
    public final void d(final List<? extends sr9> list) {
        this.a.d.invoke((Object)list);
    }
}
