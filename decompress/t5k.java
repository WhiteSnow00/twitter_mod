import retrofit2.Response;
import tv.periscope.retrofit.RetrofitException;
import retrofit2.HttpException;
import android.util.Log;
import tv.periscope.android.event.ApiEvent;
import java.util.LinkedHashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t5k
{
    public final u9a a;
    public a b;
    public c c;
    public b d;
    public d e;
    public final Set<String> f;
    
    public t5k(final u9a a) {
        czd.f((Object)a, "eventBus");
        this.a = a;
        this.f = new LinkedHashSet();
    }
    
    public final void a(final String s) {
        czd.f((Object)s, "requestId");
        this.f.add(s);
    }
    
    public final void b(final b d) {
        czd.f((Object)d, "publishCallback");
        this.d = d;
        this.a.i((Object)this);
    }
    
    public final void c() {
        this.f.clear();
        this.a.k((Object)this);
        this.b = null;
        this.e = null;
        this.c = null;
    }
    
    public final void onEventMainThread(final ApiEvent apiEvent) {
        czd.f((Object)apiEvent, "event");
        if (!this.f.contains(apiEvent.b)) {
            return;
        }
        this.f.remove(apiEvent.b);
        final int ordinal = ((Enum)apiEvent.a).ordinal();
        final HttpException ex = null;
        final HttpException ex2 = null;
        if (ordinal != 37) {
            if (ordinal != 38) {
                if (ordinal != 98) {
                    Log.d("onEventMainThread", ((Enum)apiEvent.a).name());
                }
                else if (apiEvent.d()) {
                    final l5m l5m = (l5m)apiEvent.d;
                    czd.c((Object)l5m);
                    final c c = this.c;
                    if (c != null) {
                        c.a(l5m);
                    }
                }
                else {
                    final c c2 = this.c;
                    if (c2 != null) {
                        final RetrofitException e = apiEvent.e;
                        HttpException ex3 = ex2;
                        if (e != null) {
                            final Response d0 = e.D0;
                            ex3 = ex2;
                            if (d0 != null) {
                                ex3 = new HttpException(d0);
                            }
                        }
                        c2.b(ex3);
                    }
                }
            }
            else if (apiEvent.d()) {
                final b d2 = this.d;
                if (d2 != null) {
                    d2.a();
                }
            }
        }
        else if (apiEvent.d()) {
            final v47 v47 = (v47)apiEvent.d;
            czd.c((Object)v47);
            if (v47.b().U() != null && !ikr.g((CharSequence)v47.d().a())) {
                final d e2 = this.e;
                if (e2 != null) {
                    e2.a(v47);
                }
            }
            else {
                final a b = this.b;
                if (b != null) {
                    b.a(v47);
                }
            }
        }
        else {
            final RetrofitException e3 = apiEvent.e;
            HttpException ex4 = ex;
            if (e3 != null) {
                final Response d3 = e3.D0;
                ex4 = ex;
                if (d3 != null) {
                    ex4 = new HttpException(d3);
                }
            }
            final d e4 = this.e;
            if (e4 != null) {
                e4.b(ex4);
            }
            final a b2 = this.b;
            if (b2 != null) {
                b2.b(ex4);
            }
        }
    }
    
    public interface a
    {
        void a(final v47 p0);
        
        void b(final HttpException p0);
    }
    
    public interface b
    {
        void a();
    }
    
    public interface c
    {
        void a(final l5m p0);
        
        void b(final HttpException p0);
    }
    
    public interface d
    {
        void a(final v47 p0);
        
        void b(final HttpException p0);
    }
}
