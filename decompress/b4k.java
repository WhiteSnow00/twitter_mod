import android.content.Intent;
import com.twitter.periscope.account.PeriscopeBanningActivity;
import tv.periscope.android.event.AppEvent;
import tv.periscope.android.event.ApiEvent$a;
import tv.periscope.android.event.ApiEvent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b4k implements a4k
{
    public final Context a;
    public final w3k b;
    public final z5k c;
    public final u9a d;
    public boolean e;
    public boolean f;
    
    public b4k(final Context a, final w3k b, final z5k c, final u9a d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        this.f = false;
        this.e = false;
        if (!this.d.d((Object)this)) {
            this.d.i((Object)this);
        }
    }
    
    public final void b() {
        this.b.b();
        final adw o = this.b.o;
        if (o != null) {
            this.c.a.edit().remove(z5k.c(o.k())).apply();
            this.c.d(o.k());
        }
    }
    
    public final void c() {
        if (this.d.d((Object)this)) {
            this.d.k((Object)this);
        }
    }
    
    public void onEventMainThread(final ApiEvent apiEvent) {
        if (ApiEvent$a.H0 == apiEvent.a && apiEvent.d()) {
            this.f = false;
            this.e = false;
        }
    }
    
    public void onEventMainThread(final AppEvent<String> appEvent) {
        final int e = ib0.E(appEvent.a);
        if (e != 1) {
            if (e != 2) {
                if (e != 3) {
                    if (e == 4) {
                        if (!this.e) {
                            this.e = true;
                            this.a.startActivity(new Intent(this.a, (Class)PeriscopeBanningActivity.class).setFlags(268435456).putExtra("extra_rectify_url", (String)appEvent.b));
                        }
                    }
                }
                else if (!this.f) {
                    this.f = true;
                    this.b();
                    m1f.e().c(2131956277, 1);
                }
            }
            else if (!this.f) {
                this.f = true;
                this.b();
                m1f.e().c(2131956121, 1);
            }
        }
        else if (!this.f) {
            this.f = true;
            this.b();
            m1f.e().c(2131956351, 1);
        }
    }
}
