import android.util.Log;
import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class tmb<INFO> implements rq6<INFO>
{
    public final List<rq6<? super INFO>> a;
    
    public tmb() {
        this.a = new ArrayList(2);
    }
    
    public final void a(final String s, final INFO info) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            try {
                final rq6 rq6 = this.a.get(i);
                if (rq6 != null) {
                    rq6.a(s, (Object)info);
                }
            }
            catch (final Exception ex) {
                this.h("InternalListener exception in onIntermediateImageSet", ex);
            }
        }
    }
    
    public final void b(final String s, final Throwable t) {
        synchronized (this) {
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                try {
                    final rq6 rq6 = this.a.get(i);
                    if (rq6 != null) {
                        rq6.b(s, t);
                    }
                }
                catch (final Exception ex) {
                    this.h("InternalListener exception in onFailure", ex);
                }
            }
        }
    }
    
    public final void c(final String s) {
        synchronized (this) {
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                try {
                    final rq6 rq6 = this.a.get(i);
                    if (rq6 != null) {
                        rq6.c(s);
                    }
                }
                catch (final Exception ex) {
                    this.h("InternalListener exception in onRelease", ex);
                }
            }
        }
    }
    
    public final void d(final String s, final INFO info, final Animatable animatable) {
        synchronized (this) {
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                try {
                    final rq6 rq6 = this.a.get(i);
                    if (rq6 != null) {
                        rq6.d(s, (Object)info, animatable);
                    }
                }
                catch (final Exception ex) {
                    this.h("InternalListener exception in onFinalImageSet", ex);
                }
            }
        }
    }
    
    public final void e(final String s, final Object o) {
        synchronized (this) {
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                try {
                    final rq6 rq6 = this.a.get(i);
                    if (rq6 != null) {
                        rq6.e(s, o);
                    }
                }
                catch (final Exception ex) {
                    this.h("InternalListener exception in onSubmit", ex);
                }
            }
        }
    }
    
    public final void f(final String s, final Throwable t) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            try {
                final rq6 rq6 = this.a.get(i);
                if (rq6 != null) {
                    rq6.f(s, t);
                }
            }
            catch (final Exception ex) {
                this.h("InternalListener exception in onIntermediateImageFailed", ex);
            }
        }
    }
    
    public final void g(final rq6<? super INFO> rq6) {
        synchronized (this) {
            this.a.add(rq6);
        }
    }
    
    public final void h(final String s, final Throwable t) {
        synchronized (this) {
            Log.e("FdingControllerListener", s, t);
        }
    }
}
