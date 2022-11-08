import android.content.Intent;
import com.twitter.periscope.account.PeriscopeBanningActivity;
import tv.periscope.android.event.AppEvent;
import tv.periscope.android.event.ApiEvent$a;
import tv.periscope.android.event.ApiEvent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z3k implements y3k
{
    public final Context a;
    public final u3k b;
    public final s5k c;
    public final maa d;
    public boolean e;
    public boolean f;
    
    public z3k(final Context a, final u3k b, final s5k c, final maa d) {
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
        final ocw o = this.b.o;
        if (o != null) {
            this.c.a.edit().remove(s5k.c(o.k())).apply();
            this.c.d(o.k());
        }
    }
    
    public final void c() {
        if (this.d.d((Object)this)) {
            this.d.k((Object)this);
        }
    }
    
    public void onEventMainThread(final ApiEvent apiEvent) {
        if (ApiEvent$a.G0 == apiEvent.a && apiEvent.d()) {
            this.f = false;
            this.e = false;
        }
    }
    
    public void onEventMainThread(final AppEvent<String> appEvent) {
        final int d = nb0.D(appEvent.a);
        if (d != 1) {
            if (d != 2) {
                if (d != 3) {
                    if (d == 4) {
                        if (!this.e) {
                            this.e = true;
                            this.a.startActivity(new Intent(this.a, (Class)PeriscopeBanningActivity.class).setFlags(268435456).putExtra("extra_rectify_url", (String)appEvent.b));
                        }
                    }
                }
                else if (!this.f) {
                    this.f = true;
                    this.b();
                    p88.f().b(2131956277, 1);
                }
            }
            else if (!this.f) {
                this.f = true;
                this.b();
                p88.f().b(2131956121, 1);
            }
        }
        else if (!this.f) {
            this.f = true;
            this.b();
            p88.f().b(2131956351, 1);
        }
    }
}
